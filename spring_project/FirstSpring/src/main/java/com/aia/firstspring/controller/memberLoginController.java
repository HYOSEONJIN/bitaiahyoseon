package com.aia.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
				@RequestParam("pw") String pw) {
			
			// login("cool","1111")
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/member/login"); // 로그인 되었을 때 보이는 페이지 -> mapping에 밸류가 동일해서 오류 생김
			mav.addObject("uid", uid);
			mav.addObject("pw", pw);
			return mav;
		}

	}