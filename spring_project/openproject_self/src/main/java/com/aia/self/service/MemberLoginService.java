package com.aia.self.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.self.domain.LoginMemberInfo;
import com.aia.self.domain.Member;
import com.aia.self.member.dao.MemberDao;

@Service
public class MemberLoginService {

	@Autowired
	private MemberDao dao;
	
	public List<LoginMemberInfo> loginMember(Member member) {
		System.out.println("로그인 :"+dao.loginMember(member));
		return dao.loginMember(member);		
	}
	
}
