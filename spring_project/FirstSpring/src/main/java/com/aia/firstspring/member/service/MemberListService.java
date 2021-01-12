package com.aia.firstspring.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.firstspring.domain.Member;
import com.aia.firstspring.member.dao.MemberDao;
import com.aia.firstspring.member.dao.MemberInterfaceDao;
import com.aia.firstspring.member.dao.MybatisMemberDao;

@Service
public class MemberListService {
	
	private MemberInterfaceDao dao;
	
	@Autowired
	SqlSessionTemplate template;

	// 회원목록 반환 메서드
	public List<Member> getMemberList(){		
		dao= template.getMapper(MemberInterfaceDao.class);
		return dao.selectMemberList();
	}
	
	// 회원수 몇명인지 int로 반환해주는 메서드
	public int getMemberTotalCount() {
		dao= template.getMapper(MemberInterfaceDao.class);
		return dao.totalCount();
	}

}
