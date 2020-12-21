package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	public static Connection getConnection() {
		
	Connection conn = null;
	
	String Url="jdbc:mysql://localhost:3306/open?serverTimezone=UTC";
	String sqlid = "aia";
	String sqlpw = "aia";
	
	try {
		conn = DriverManager.getConnection(Url, sqlid, sqlpw);
		System.out.println("커넥션 성공");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return conn;
	}
	

}
