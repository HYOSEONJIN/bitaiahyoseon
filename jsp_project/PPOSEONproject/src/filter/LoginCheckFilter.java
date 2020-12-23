package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginCheckFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request,
						ServletResponse response,
						FilterChain chain)
			throws IOException, ServletException {
		
		// 회원이 로그인 되어있는지 확인하는 Filter를 생성하려고 한다.
		// 서블릿리퀘스트를 http서블릿리퀘스트로
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession();
		
//		boolean loginCheck = false;
		
		if(session!=null && session.getAttribute("loginInfo")!=null) {
			chain.doFilter(request, response); // 정상실행
//			loginCheck =true;
		} else {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/member/loginForm.jsp");
			dispatcher.forward(request, response);
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
