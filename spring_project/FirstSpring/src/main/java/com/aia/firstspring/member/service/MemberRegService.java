package com.aia.firstspring.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.firstspring.domain.Member;
import com.aia.firstspring.member.dao.MemberDao;
import com.aia.firstspring.member.dao.MemberInterfaceDao;
import com.aia.firstspring.member.dao.MybatisMemberDao;

@Service
public class MemberRegService {

	
	private MemberInterfaceDao dao;
	//@Autowired
	//private MybatisMemberDao dao;
	//@Autowired
	//private MemberDao dao;
	
	@Autowired
	SqlSessionTemplate template;

	public int insertMember(Member member) {
		int result=0;
		try {
			dao = template.getMapper(MemberInterfaceDao.class);
			result = dao.insertMember(member);
		}catch (Exception e){
			e.printStackTrace();
			
		}
		return result;
		
	}
}
