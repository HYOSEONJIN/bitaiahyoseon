package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCOraclePreparedTest2 {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      Connection conn = null;
      
      try {
         // 1. 드라이버 로드
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("Oracle Driver Load!");
         
         // 2. DB 연결       localhost == 127.0.0.1
         String jdbcUrl ="jdbc:oracle:thin:@localhost:1521:orcl";
         String user = "scott";
         String password = "tiger";
         
         conn = DriverManager.getConnection(jdbcUrl, user, password);
         System.out.println("데이터베이스에 접속했습니다.");
         
         
         // 3. statement 인스턴스생성
         PreparedStatement pstmt = null;

         
         System.out.println("검색하고 싶은 부서 이름을 입력하세요.");
         String searchDname = sc.nextLine();
         
         // 부서 정보 리스트 
         String sqlSelect = "select * from dept where dname=? order by loc";
         
         pstmt = conn.prepareStatement(sqlSelect);
         pstmt.setString(1, searchDname);
         
         ResultSet rs = pstmt.executeQuery();
         
         if(!rs.next()) {
            System.out.println("검색 결과 X");
         } else {
            do  {
               System.out.print(rs.getInt(1)+"\t");
               System.out.print(rs.getNString(2)+"\t");
               System.out.print(rs.getNString(3)+"\n");
            } while(rs.next());
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