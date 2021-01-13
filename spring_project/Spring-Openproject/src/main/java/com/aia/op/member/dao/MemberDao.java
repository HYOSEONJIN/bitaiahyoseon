package com.aia.op.member.dao;

import com.aia.op.member.domain.Member;

public interface MemberDao {
	
	int insertMember(Member member);
	Member selectLogin(String id, String pw);

}
