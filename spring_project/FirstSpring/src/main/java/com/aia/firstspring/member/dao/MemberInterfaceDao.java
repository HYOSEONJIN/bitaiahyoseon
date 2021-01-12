package com.aia.firstspring.member.dao;

import java.util.List;

import com.aia.firstspring.domain.Member;

public interface MemberInterfaceDao {

	
	//abstract public 생략	
	List<Member> selectMemberList();
	int insertMember(Member member);
	int totalCount();
	Member SelectByIdPw();
}
