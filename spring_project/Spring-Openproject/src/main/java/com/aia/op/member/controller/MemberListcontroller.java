package com.aia.op.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aia.op.member.domain.MemberListView;
import com.aia.op.member.domain.SearchParam;
import com.aia.op.member.service.MemberListService;

@Controller
public class MemberListcontroller {
	
	@Autowired
	MemberListService listService;
	
	@RequestMapping("/member/list") // member/list?p=1	
	public String memberList(
			//@RequestParam(value="p", defaultValue="1") int page,
			SearchParam param,
			Model model) {
			
		System.out.println(param);
		//MemberListView listview = listService.getListView(page);
		//System.out.println(listview);
		model.addAttribute("listView",listService.getListView(param));
		
		return "member/list";
	}

}
