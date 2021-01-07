package jdbc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

// 데이터 베이스 드라이버 로드
public class Loader extends HttpServlet {

	@Override
	public void init() throws ServletException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("게스트북 mysql 드라이버 로드 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("게스트북 mysql 로드 실패");
			e.printStackTrace();
		}
	}
	
	

}