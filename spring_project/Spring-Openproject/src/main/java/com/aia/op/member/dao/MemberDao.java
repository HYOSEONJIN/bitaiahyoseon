package com.aia.op.member.dao;

import com.aia.op.member.domain.MemberRegRequest;

public interface MemberDao {
	
	int insertMember(MemberRegRequest regRequest);

}
