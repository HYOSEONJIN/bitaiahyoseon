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
				Member member,
				Model model,
				HttpServletRequest request) throws IllegalStateException, IOException {
		
		int resultCnt=regservice.inserMember(member);
		model.addAttribute("resultCnt",resultCnt);
		
		String view="member/regForm";
		
		if(resultCnt==1) {
		//사진파일 저장
		member.getUserPhoto().transferTo(getFile(request, uri, member.getUserPhoto().getOriginalFilename()));
		view= "redirect:/member/login";
		
		}
				
		return view;
	}


	String uri = "/uploadphoto";
	
	private File getFile(HttpServletRequest request, String uri, String fileName) {
		
		String rpath = request.getSession().getServletContext().getRealPath(uri);
		File newFile = new File(rpath, fileName);
		
		return newFile;
	}
}
