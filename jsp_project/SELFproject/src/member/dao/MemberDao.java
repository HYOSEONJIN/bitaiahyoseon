package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.model.Member;

public class MemberDao {

	
	private MemberDao() {}
	
	private static MemberDao dao = new MemberDao();
	
	public static MemberDao getinstance() {
		return dao;
	}
	
	
	// 입력하기
	public int inserMember(Connection conn, Member member) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		String insert = "INSERT INTO open.memdata(id,password,name,usernumber,photo)VALUES(?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getUserPw());
			pstmt.setString(3, member.getUserName());
			pstmt.setString(4, member.getUserNumber());
			pstmt.setString(5, member.getUserPhoto());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return result;
	}
	
	
	// 로그인하기
	
	public Member Login(Connection conn, String uid, String pw) {
		
		Member member = null;
		//select *from open.memdata where id='hyoseon' and password='1111';
		String select= "select *from open.memdata where id=? and password=?";
		
		System.out.println(uid);
		System.out.println(pw);
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, uid);
			pstmt.setString(2, pw);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member(rs.getString("id"),
									rs.getString("password"),
									rs.getString("name"),
									rs.getString("usernumber"),
									rs.getString("photo"));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		
		
		return member;
		
	}
}
