package com.aia.self.member.dao;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aia.self.domain.Member;

@Repository
public class MemberDao {
	
	@Autowired
	private JdbcTemplate template;
	
	// 회원가입 DAO 메서드
	public int insertMember(Member member) {
		
		String sql="insert into memdata (id,password,name,usernumber,photo) values(?,?,?,?,?)";
		int result=template.update(sql,
				member.getUserId(),
				member.getUserPw(),
				member.getUserName(),
				member.getUserNumber(),
				member.getUserPhoto().getOriginalFilename());	
				
		return result;
	}
	
	
	private File getFile(HttpServletRequest request, String uri, String fileName) {
		
		String rpath = request.getSession().getServletContext().getRealPath(uri);
		File newFile = new File(rpath, fileName);
		
		return newFile;
	}

}
