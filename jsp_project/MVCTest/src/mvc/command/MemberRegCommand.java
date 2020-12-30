package mvc.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.Command;

public class MemberRegCommand extends Command {

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		// 사용자의 요청을 처리, 응답에 필요한 데이터를 request 속성에 저장, 응답에 필요한 설정
		// 이 요청의 응답 처리를 위한 View페이지 경로를 반환
		
		
		// 사용자 요청에 대한 처리
		String result = "회원가입 페이지입니다. 요청하신 경로는" + request.getRequestURI();
		
		// request 속성에 결과를 저장하자
		
		request.setAttribute("result", result);
		
		
		
		return "/view/member/regForm.jsp";
	}
	
	
}
