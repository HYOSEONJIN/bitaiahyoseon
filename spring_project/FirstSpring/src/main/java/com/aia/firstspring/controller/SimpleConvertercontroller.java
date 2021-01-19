package com.aia.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mc/simple")
public class SimpleConvertercontroller {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		
		return "simple/form";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String simple(@RequestBody String body) {
		
		System.out.println(body + " @ResponseBody 어노태이션은 일반객체도응답처리가된다 ");
		return body;
	}
		

}
