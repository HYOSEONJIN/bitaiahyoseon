package member.service;

import javax.annotation.Resource;

import member.dao.Dao;

public class MemberInfoService3 implements MemberService{
	
	@Resource(name = "memberDao")
	Dao dao;
		
	@Override
	public Object process() {
		System.out.println("MeberInfoService 실행");
		dao.select();
		return null;
	}

}
