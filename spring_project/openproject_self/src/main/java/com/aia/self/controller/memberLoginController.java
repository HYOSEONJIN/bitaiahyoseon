package com.aia.self.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aia.self.domain.Member;
import com.aia.self.service.MemberLoginService;

	@Controller
	@RequestMapping("/member/login")
	public class memberLoginController {

		
		// 처음 로그인 창에 진입하려고할 때는 로그인폼을 보여준다
		@RequestMapping(method = RequestMethod.GET)
		public ModelAndView getLoginForm() {
			return new ModelAndView("member/loginForm"); // setViewName과 동일, 
		}
		
		@Autowired
		private MemberLoginService loginService;
		
		
		// 아이디 패스워드를 입력하면 로그인 상태로 view
		@RequestMapping(method = RequestMethod.POST)
		public String login(HttpServletRequest request,
				HttpServletResponse response, Model model) {
	
			
			
			String view="member/loginForm";
			
			model.addAttribute("loginCheck",loginService.login(request, response));
			System.out.println(loginService.login(request, response));
			
			if(loginService.login(request, response)) {
			System.out.println("로그인성공");
			view="home";
			}
			return view;
			
		}
		
		
	}

