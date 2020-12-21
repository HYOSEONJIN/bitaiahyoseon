package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import member.Member;
import sun.security.jca.GetInstance;

public class MemberDao {
	
	
	// MemberDao는 메서드만 있으므로 싱글톤 처리해준다.
	// 싱글톤 패턴 : 코딩 스타일
	// 외부에서 인스턴스를 생성하지 못하게 하기 위한 용도.
	// 하지만 인스턴스를 반환해주는 메서드가 있어서 인스턴스가 필요한 경우 가져다 쓸 수있다.
	
	// 인스턴스 생성을 막는다 : 생성자의 접근제어 > private
	private MemberDao() {}
	
	// 객체 하나를 생성해서 사용한다.
	private static MemberDao dao = new MemberDao();
	
	// Dao 객체의 참조변수를 반환해주는 메소드 : 외부 클래스 누구나 접근 가능해야 한다.
	public static MemberDao getInstance() {
		return dao;
	}
	
	
	
	
	//Member 테이블의 데이터를 CRUD
	// insert, select, update, delete
	
	// 데이터 입력
	public int insertMember(Connection conn, Member member) {
		
		int resultCnt = 0;
		
		PreparedStatement pstmt = null; 
		String sqlInsert = "INSERT INTO open.member(memberid,password,membername)VALUES(?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sqlInsert);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getUserName());
			
			// 실행갯수 반환해주는 executeUpdate
			resultCnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultCnt;
	}

	
	// 로그인 위한 select
	
	public Member selectMemberLogin(Connection conn, String uid, String pw) {
		
		Member member= null;
		String sqlSelect = "select * from open.member where memberid=? and password=?";
		
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sqlSelect);
			pstmt.setString(1, uid);
			pstmt.setString(2, pw);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member(rs.getString("memberid"),
									rs.getString("password"),
									rs.getString("membername"),
									rs.getString("memberphoto"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return member;
	}
	
	
}
