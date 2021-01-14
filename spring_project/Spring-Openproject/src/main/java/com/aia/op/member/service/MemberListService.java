package com.aia.op.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.member.dao.MemberDao;
import com.aia.op.member.domain.Member;
import com.aia.op.member.domain.MemberListView;
import com.aia.op.member.domain.SearchParam;

@Service
public class MemberListService {
	
	
	private MemberDao dao;
	@Autowired
	private SqlSessionTemplate template;
	
	
	
	public MemberListView getListView(SearchParam param) {
		
		MemberListView listview= null;
		try {
		System.out.println(param.getP());
		
		dao = template.getMapper(MemberDao.class);
		
		int totalMemberCount = dao.selectTatalCount();
		System.out.println(totalMemberCount);
		
		int cntPerPage = 5;
		int startRow = (param.getP()-1) * cntPerPage;
		int endRow = startRow+cntPerPage;
		
		List<Member> memberList = dao.SelectMemberList(startRow, cntPerPage);
		System.out.println(memberList);
		
		listview = new MemberListView(param.getP(), totalMemberCount, cntPerPage, memberList, startRow, endRow);
		System.out.println(listview);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
		return listview;
	}
	

}
