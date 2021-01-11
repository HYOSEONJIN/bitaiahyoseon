package com.aia.self.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aia.self.domain.Member;

@Controller
@RequestMapping("/member/login")
public class MemberLoginController {

	
	// 처음 로그인 창에 진입하려고할 때는 로그인폼을 보여준다
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getLoginForm() {
		return new ModelAndView("member/loginForm"); // setViewName과 동일, 
	}
	
	// 아이디 패스워드를 입력하면 로그인 상태로 view
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,
				Member member) {
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		System.out.println(member);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		mav.addObject("userId", userId);
		mav.addObject("userPw", userPw);
		
		return mav;
		
	}
	
	
}
