package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	public static Connection getCooConnection() {
		
		Connection conn = null;
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/open?serverTimezone=UTC";
		String user = "aia";
		String password = "aia";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("커넥션 로드 완료");
		} catch (SQLException e) {
			System.out.println("커넥션 로드 실패");
			e.printStackTrace();
		}
		
		return conn;

	}

}
