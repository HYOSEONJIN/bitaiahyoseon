package com.aia.self.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aia.self.domain.Member;
import com.aia.self.domain.MemberReg;
import com.aia.self.service.MemberRegService;

@Controller
@RequestMapping("/member/reg")
public class memberRegController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getLoginForm() {
		return new ModelAndView("member/regForm"); 
	}
	
	
	@Autowired
	private MemberRegService regservice;
	
	@RequestMapping(method = RequestMethod.POST)
	public String regSumbit(
				MemberReg memberReg,
				Model model,
				HttpServletRequest request) throws IllegalStateException, IOException {

		
		System.out.println("컨트롤러의 meberreg : "+ memberReg);
		String view="member/regForm";	
		int resultCnt=regservice.insertMember(memberReg, request);
		
		model.addAttribute("resultCnt",resultCnt);
		
		if(resultCnt>0) {		
			System.out.println("가입성공");
			view="redirect:/member/login";
		}else {
			System.out.println("가입실패");
		}
		

				
		return view;
	}

}
