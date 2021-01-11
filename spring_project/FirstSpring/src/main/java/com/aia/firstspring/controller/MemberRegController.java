package com.aia.firstspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aia.firstspring.domain.Member;
import com.aia.firstspring.member.service.MemberRegService;

@Controller
@RequestMapping("/member/reg")
public class MemberRegController {
	
	@Autowired
	private MemberRegService regService;

	@RequestMapping(method = RequestMethod.GET)
	public String getRegForm() {
		return "member/regForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String memberReg(Member member, Model model) {
		
		int resultCnt = regService.insertMember(member);
		String view="member/reg";
		model.addAttribute("resultCnt", resultCnt);
		
		if(resultCnt==1) {
			view= "redirect:/member/list";
		}
		return view;
	}
}
