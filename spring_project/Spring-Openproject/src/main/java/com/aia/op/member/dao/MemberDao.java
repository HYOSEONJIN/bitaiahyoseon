package com.aia.op.member.dao;

import java.util.List;
import java.util.Map;

import com.aia.op.member.domain.Member;
import com.aia.op.member.domain.SearchParam;

public interface MemberDao {
	
	int insertMember(Member member);
	Member selectLogin(String id, String pw);
	
	//회원리스트출력
	//1. 회원의 총수
	int selectTatalCount();
	//2. 회원 리스트 (페이지번호에맞는)

	//List<Member> SelectMemberList(int startRow, int cntPerPage);
	List<Member> SelectMemberList(Map<String, Object> param);
	
	// 검색한 회원의 수
	int selectSearchMemberCount(Map<String, Object> listMap);

}
