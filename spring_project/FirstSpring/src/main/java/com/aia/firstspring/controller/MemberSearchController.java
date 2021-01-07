package com.aia.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberSearchController {
	
	@RequestMapping("/member/search")
	public String searchMember(
			// @RequestParam("p") int pageNumber, 
			// 밸류에 파라미터 이름 정의, 기본값 설정
			@RequestParam(value = "p", defaultValue = "1") int pageNumber,
			// @RequestParam("uid") String uid,
			@RequestParam(value = "uid", required = false) String uid,
			@RequestParam("name") String name) {
		
		System.out.println(pageNumber + " : " +  uid + " : " + name);
		
		//http://localhost8080/컨텍스트경로/member/search?p=1&uid=cool&name=COOL
		
		return "member/search"; // view 이름 > view의 경로
	}

}
