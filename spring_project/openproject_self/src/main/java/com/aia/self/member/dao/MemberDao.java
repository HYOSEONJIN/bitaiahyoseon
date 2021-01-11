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

		String sql="insert into memdata (userId, userPw, UserName,userNumber,userPhoto) values(?,?,?,?,?)";
		int result=template.update(sql,
				member.getUserId(),
				member.getUserPw(),
				member.getUserName(),
				member.getUserNumber(),
				member.getUserPhoto().getOriginalFilename());	
				
		return result;
	}
	
	

	// 로그인DAO 메서드
	public LoginMemberInfo loginMember(Member member) {
			
		String sql="select * from open.memdata where userId='"+member.getUserId() +"' and userPw='"+member.getUserPw()+"'";
		System.out.println("로그인 : " +sql);
		//sql, member.getUserName(), member.getUserPw());
		
		
		LoginMemberInfo loginInfoResult= null;
		
		
		try {
		List<LoginMemberInfo> InfoList= template.query(sql, new RowMapper<LoginMemberInfo>() {
					
			@Override
			public LoginMemberInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
				LoginMemberInfo loginInfo = new LoginMemberInfo();
				loginInfo.setUserId(rs.getString("userId"));
				loginInfo.setUserName(rs.getString("userName"));
				loginInfo.setUserNumber(rs.getString("userNumber"));
				loginInfo.setUserPhoto(rs.getString("userPhoto"));
				
				System.out.println(loginInfo);
				System.out.println(loginInfo==null);
				return loginInfo;
				
			}});
			
			loginInfoResult = InfoList.get(0);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
				
		 return loginInfoResult;

	}

}