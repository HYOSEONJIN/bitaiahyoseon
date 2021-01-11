package com.aia.self.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.self.domain.Member;
import com.aia.self.member.dao.MemberDao;

@Service
public class MemberRegService {
	
	
	@Autowired
	private MemberDao dao;
	
	public int inserMember(Member member) {
		int result=0;
		
		try {
			result=dao.insertMember(member);	
		}catch(Exception e){
			e.printStackTrace();			
		}
		
		return result;
	}

}
