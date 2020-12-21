package jdbc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Loader extends HttpServlet {

	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	

}
