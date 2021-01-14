package com.aia.op.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.member.dao.MemberDao;

@Service
public class MemberDeleteService {
	
	private MemberDao dao;
	
	@Autowired
	SqlSessionTemplate template;
	

}
