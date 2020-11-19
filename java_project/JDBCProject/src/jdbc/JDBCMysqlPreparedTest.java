package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMysqlPreparedTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;

		try {
			// 1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Load!");

			// 2. DB 연결 localhost == 127.0.0.1
			String jdbcUrl = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
			String user = "hyo";
			String password = "admin";

			conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("데이터베이스에 접속했습니다.");

			// Statement stmt = conn.createStatement();

			System.out.println("부서 번호 입력해주세요.");
			int userDeptno = sc.nextInt();
			sc.nextLine();
			System.out.println("부서 이름을 입력해주세요.");
			String userDname = sc.nextLine();

			System.out.println("부서의 위치를 입력해주세요.");
			String userLoc = sc.nextLine();

			// PreparedStatement 인스턴스 생성
			String sqlInsert = "insert into dept values (?, ?, ?)";

			PreparedStatement pstmt = conn.prepareStatement(sqlInsert);
			pstmt.setInt(1, userDeptno);
			pstmt.setString(2, userDname);
			pstmt.setString(3, userLoc);

			int resultCnt = pstmt.executeUpdate();

			if (resultCnt > 0) {
				System.out.println("정상적으로 입력되었음.");
			} else {
				System.out.println("데이터 입력이 되지 않았음.");
			}

			// 부서 리스트 출력
			String sqlList = "select * from dept order by loc";
			pstmt = conn.prepareStatement(sqlList);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getInt(1) + ", ");
				System.out.print(rs.getString(2) + ", ");
				System.out.print(rs.getString(3) + "\n");
			}

			rs.close();
			pstmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			System.out.println("Driver 로드 실패");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}