package com.aia.firstspring.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//컨트롤 클래스라고 알려주는 어노테이션 > 이걸 해주어야 handler mapping에 등록
@Controller 
public class HelloController {
	
	// 이 메서드는 프론트컨트롤러 쪽으로 Viewname을 반환해야 한다.
	// 반환 타입은 ModelAndView를 이용해서 반환하자.
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		
		// prefix suffix를 제외한 이름 /WEB-INF/views/member/hello.jsp -> member/hello
 		mav.setViewName("member/hello");
 		mav.addObject("greeting", greeting());
		
		return mav;
	}

	private String greeting() {
		String result = "안녕!";
		
		int nowTime = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(nowTime>=6 && nowTime <= 10) {
			result="좋은 아침";
		} else if(nowTime >= 12 && nowTime<=15) {
			result="맛점";
		} else if(nowTime >=18 && nowTime<=22) {
			result="굿밤";
		}
		
		return result;
	}

}
