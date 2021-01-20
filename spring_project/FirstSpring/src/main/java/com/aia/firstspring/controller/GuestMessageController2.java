package com.aia.firstspring.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aia.firstspring.domain.GuestMessage;
import com.aia.firstspring.domain.GuestMessage2;
import com.aia.firstspring.domain.GuestMessageList2;

@Controller
public class GuestMessageController2 {
	

	@RequestMapping(value= "/message/listJson") 
	@ResponseBody
	public GuestMessageList2 listXml2() {
		return getMessageList2();
	}

	
	private GuestMessageList2 getMessageList2() {

		List<GuestMessage2> list2 = new ArrayList<GuestMessage2>();
		list2.add(new GuestMessage2(1, "안녕", new Date()));
		list2.add(new GuestMessage2(2, "HELLO", new Date()));
		list2.add(new GuestMessage2(3, "빠이", new Date()));
		return new GuestMessageList2(list2);
	}
	

}