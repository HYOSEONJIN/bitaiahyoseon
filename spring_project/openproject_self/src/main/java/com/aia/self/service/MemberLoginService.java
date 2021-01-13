package com.aia.self.service;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.self.domain.LoginMemberInfo;
import com.aia.self.domain.Member;
import com.aia.self.member.dao.MemberDao;

@Service
public class MemberLoginService {

	
	private MemberDao dao;
	
	@Autowired
	SqlSessionTemplate template;
	

	public boolean login(HttpServletRequest request,
						HttpServletResponse response) {
		
		boolean loginChk=false;
		
		String id = request.getParameter("userid");
		String pw = request.getParameter("userpw");
		String chk = request.getParameter("chk");
		
		dao = template.getMapper(MemberDao.class);
		
		Member member = dao.loginMember(id, pw);
		
		if(member != null) {
			
			request.getSession().setAttribute("loginInfo", member.toLoginInfo());
			loginChk = true;
			
			
			if(chk!=null && chk.equals("on")) {
				Cookie c = new Cookie("uid",id);
				c.setMaxAge(60*5);
				response.addCookie(c);
			}else {
				Cookie c = new Cookie("uid",id);
				c.setMaxAge(0);
				response.addCookie(c);
				
			}
		}
		
		
		
		
		return loginChk;
	}
}