package com.aia.self.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/reg")
public class memberRegController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getLoginForm() {
		return new ModelAndView("member/regForm"); 
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public  ModelAndView regSumbit() {		
		return new ModelAndView("member/loginForm");
	}


}
