package com.aia.self.member.dao;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.aia.self.domain.LoginMemberInfo;
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
	
	

	// 로그인DAO 메서드
	public List<LoginMemberInfo> loginMember(Member member) {
			
		String sql="select * from open.memdata where id='"+member.getUserId() +"' and password='"+member.getUserPw()+"'";
		System.out.println("로그인 : " +sql);
		//sql, member.getUserName(), member.getUserPw());
				
		return template.query(sql, new RowMapper<LoginMemberInfo>() {

			@Override
			public LoginMemberInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
				LoginMemberInfo loginInfo = new LoginMemberInfo();
				loginInfo.setUserId(rs.getString("id"));
				loginInfo.setUserName(rs.getString("name"));
				loginInfo.setUserNumber(rs.getString("usernumber"));
				loginInfo.setUserPhoto(rs.getString("photo"));
				return loginInfo;
			}});
		
				
				

	}

}