package mvc.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.service.MemberRegService;

public class regMemberCommand implements Command {

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {

		// MemberregService
		// insertMember(HttpServletRequest request) -> int 1 or 0 

		MemberRegService service = MemberRegService.getInstance();
		service.insertMember(request);
			
		// memberReg3.jsp 역할
		// 사용자의 요청에 맞는 서비스 클래스 선택 -> 메소드 실행
		// View 페이지를 선택 -> 포워드
		
		return "/WEB-INF/view/member/memberRegView.jsp";
	}

}
