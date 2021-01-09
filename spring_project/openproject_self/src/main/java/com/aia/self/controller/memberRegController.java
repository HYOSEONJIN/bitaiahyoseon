package com.aia.self.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aia.self.domain.Member;

@Controller
@RequestMapping("/member/reg")
public class memberRegController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getLoginForm() {
		return new ModelAndView("member/regForm"); 
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public  ModelAndView regSumbit(
				Member member,
				Model model,
				HttpServletRequest request) throws IllegalStateException, IOException {
		
		model.addAttribute("photoFile", member.getUserPhoto().getOriginalFilename());		
		member.getUserPhoto().transferTo(getFile(request, uri, member.getUserPhoto().getOriginalFilename()));
				
		return new ModelAndView("member/loginForm");
	}


	String uri = "/uploadphoto";
	
	private File getFile(HttpServletRequest request, String uri, String fileName) {
		
		String rpath = request.getSession().getServletContext().getRealPath(uri);
		File newFile = new File(rpath, fileName);
		
		return newFile;
	}
}
