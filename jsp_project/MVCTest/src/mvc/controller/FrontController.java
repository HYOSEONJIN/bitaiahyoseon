package mvc.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);

	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청을 분석 : URI 이용해서 분석
		// http://loclhost:8080/mvc/greeting -> /greeting
		String command = request.getRequestURI();
		System.out.println(command);
		System.out.println(command.indexOf(request.getContextPath()));

		if (command.indexOf(request.getContextPath()) == 0) {
			command = command.substring(request.getContextPath().length());
		}
		System.out.println(command);
		
		// 요청에 맞는 기능 실행 -> 결과 데이터를 생성
		Object resultObject = null;
		
		if(command.equals("/greeting")|| command.equals("/")) {
			resultObject = "올리버쌤입니다";
		} else if(command.equals("/date")) {
			resultObject = new Date();
		} else if(command.equals("/member/login")){
			resultObject = "로그인페이지입니다";
		} else{
			resultObject = "Invalid Type";
		}
		
		// request의 속성에 결과 데이터를 넣어준다.
		
		request.setAttribute("result", resultObject);
		
		// 5. View 페이지를 선택하고, forward
		RequestDispatcher dispatcher = request.getRequestDispatcher("/simpleView.jsp");
		dispatcher.forward(request, response);


	}
}