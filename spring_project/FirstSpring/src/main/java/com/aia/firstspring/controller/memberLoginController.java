package com.aia.firstspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aia.firstspring.member.domain.LoginRequest;

@Controller
@RequestMapping("/member/login")
public class memberLoginController {
	//사용자의 요청 url 처리해야될 기능, 메서드를 바인딩 하는 것이 컨트롤러다.
	
	// @RequestMapping(value = "/member/login", method = RequestMethod.GET)
		@RequestMapping(method = RequestMethod.GET)
		public ModelAndView getLoginForm() {
			return new ModelAndView("member/loginForm"); // setViewName과 동일, 
		}
		
		// @RequestMapping(value = "/member/login", method = RequestMethod.POST)
		@RequestMapping(method = RequestMethod.POST)
		public ModelAndView login(
				@RequestParam("uid") String uid,
				@RequestParam("pw") String pw,
				HttpServletRequest request,
				LoginRequest loginRequest) {
			//리퀘스트파람이 파라미터를 받아올 수 있게 해준다.
			
			
			//사용자의 파라미터값을 받는 방법
			//1. HttpServletRequest 객체 이용
			//2. @RequestParam(폼의 네임속성)
			//3. 커맨드 객체(Beans) 이용
			
			
			// login("cool","1111")
			System.out.println(loginRequest);
			
			String userId = request.getParameter("uid");
			String userPw = request.getParameter("pw");
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/member/login"); // 로그인 되었을 때 보이는 페이지 -> mapping에 밸류가 동일해서 오류 생김
			mav.addObject("uid", uid);
			mav.addObject("pw", pw);
			mav.addObject("userId", userId);
			mav.addObject("userPw", userPw);
			//mav.addObject("loginRequest", loginRequest); 
			//안해도 공유가 됨 변수이름은 클래스 이름의 앞글자를 소문자로 바꾼 것으로 됨
			
			return mav;
		}

	}