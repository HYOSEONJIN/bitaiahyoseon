package com.aia.self.member.dao;

import com.aia.self.domain.Member;

public interface MemberDao {

	
	public int insertMember(Member member);
	public Member loginMember(String id, String pw);
}
