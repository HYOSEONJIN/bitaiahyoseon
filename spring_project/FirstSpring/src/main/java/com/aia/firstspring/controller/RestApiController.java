package com.aia.firstspring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aia.firstspring.member.domain.Member;
import com.aia.firstspring.member.service.MemberListService;
import com.aia.firstspring.member.service.MemberRestService;

@RestController
@RequestMapping("/rest/ver1/members")
public class RestApiController {
	
	@Autowired
	private MemberRestService restService;
	
	
	/*
	 @GetMapping("/{idx}") // RequestMapping(method=GET)과 같음, /rest/ver01/members/36와 같은 경로로 들어옴
	// @GetMapping
	public String getRest(
			@PathVariable("idx") int idx ) {
		return "@RestController를 사용한 응답처리 : " + idx;
	}
	*/
	@Autowired
	private MemberListService listService;
	
	@GetMapping
	public List<Member> getMemberList(){
		return listService.getMemberList();
	}
	
	@GetMapping("/map")
	public Map<Integer, Member> getMemberListMap(){
		
		Map<Integer, Member> memberMap = new HashMap<Integer, Member>();
		for(Member member : listService.getMemberList()) {
			memberMap.put(member.getIdx(), member);
		}
		return memberMap;
		
	}
	 
		@GetMapping("/{idx}")
		public Member getMemberInfo(
				@PathVariable("idx") int idx) {
			
			return restService.getMember(idx);
			
		}
}