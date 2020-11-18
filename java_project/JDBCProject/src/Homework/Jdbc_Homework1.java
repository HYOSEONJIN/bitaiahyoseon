package Homework;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc_Homework1 {

	public static void main(String[] args) {

			// 2020.11.18
		
		Connection conn = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver Load !!!");

			
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "tiger";
			
			conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("데이터베이스에 접속했습니다.");
			System.out.println("");
			
			
			// 인스턴스 생성하기
			PreparedStatement pstmt = null;
			
////////////// 1) EMP 테이블에 새로운 사원 정보를 입력하는 프로그램을 작성해보자.
			// emp : empno, ename, job, mgr, hiredate, sal, comm, deptno
			String sqlQ1 = "insert into emp values (seq_emp_empno.nextval,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sqlQ1);
			pstmt.setString(1,"hyoseon");
			pstmt.setString(2,"gamer");
			pstmt.setInt(3,7839);
			pstmt.setString(4,"20/11/18");
			pstmt.setInt(5,10000);
			pstmt.setInt(6,2000);
			pstmt.setInt(7,30);
			
			int resultCnt = pstmt.executeUpdate();			
			if (resultCnt>0) {
				System.out.println("");
				System.out.println("-------------------- 문제 1번) 정상입력");
				System.out.println("-------------------- 새로운 사원정보 입력 / ename : hyoseon");
				System.out.println("");
				resultCnt=0;
			}else {
				System.out.println("입력이 되지 않았음");
			}
			
			
			// 부서 리스트 출력
//////////////2) EMP 테이블의 모든 데이터를 출력하는 프로그램을 작성해보자.
			
			
			System.out.println("");
			System.out.println("-------------------- 문제 2번) 모든데이터출력");
			System.out.println("");
			String sqlList="select * from emp order by empno";
			pstmt=conn.prepareStatement(sqlList);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getInt(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getInt(6)+"\t");
				System.out.print(rs.getInt(7)+"\t");
				System.out.print(rs.getInt(8)+"\t");
				System.out.println("");
				
			}
////////////// 3) EMP 테이블에 서 “SCOTT” 사원의 급여(sal) 정보를 1000으로 바꾸는 프로그램을 작성해보자.
			String sqlQ3 = "update emp set sal=1000 where ename='SCOTT'";
			Statement stmt = conn.createStatement();
			resultCnt = stmt.executeUpdate(sqlQ3);
			if (resultCnt>0) {
				System.out.println("");
				System.out.println("-------------------- 문제 3번) 정상입력");
				System.out.println("-------------------- 스캇 월급 1000으로 수정!");
				System.out.println("");
			}else {
				System.out.println("입력이 되지 않았음");
			}
////////////// 4)EMP 테이블에 서 “SCOTT” 이름으로 검색한 결과를 출력하는 프로그램을 작성해보자.
			System.out.println("");
			System.out.println("-------------------- 문제 4번) Scott 검색 데이터 출력");
			
			String sqlQ4 = "select * from emp where ename='SCOTT'";
			
			rs = stmt.executeQuery(sqlQ4);
			if(!rs.next()) {
				System.out.println("검색결과 X");
			}else {
				do {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getInt(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.print(rs.getInt(6)+"\t");
					System.out.print(rs.getInt(7)+"\t");
					System.out.print(rs.getInt(8)+"\t");
					System.out.println("");
				}while(rs.next());
				}
			
			
					

//////////////5.모든 사원정보를 출력하되 부서정보를 함께 출력하는 프로그램을 작성해보자.
			System.out.println("");
			System.out.println("-------------------- 문제 5번) 사원정보 + 부서정보 함께 출력");
			System.out.println("");
			String sqlList2="select * from emp, dept where emp.deptno=dept.deptno";
			pstmt=conn.prepareStatement(sqlList2);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getInt(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getInt(6)+"\t");
				System.out.print(rs.getInt(7)+"\t");
				System.out.print(rs.getInt(8)+"\t");
				System.out.print(rs.getInt(9)+"\t");
				System.out.print(rs.getString(10)+"\t");
				System.out.print(rs.getString(11)+"\t");
				System.out.println("");
				
			}
			
			
		} catch (ClassNotFoundException e) {
	         System.out.println("Driver 로드 실패");
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
		
		
	}

}
