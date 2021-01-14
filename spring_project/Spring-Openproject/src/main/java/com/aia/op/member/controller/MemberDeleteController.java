package com.aia.op.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberDeleteController {
	
	@RequestMapping("/member/delete")
	public String deleteMember(
			@RequestParam("idx") int idx) {
		
		return "member/delete";
	}

}
