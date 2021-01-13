package com.aia.self.domain;

import org.springframework.web.multipart.MultipartFile;

public class MemberReg {

	private String userid;
	private String userpw;
	private String username;
	private String usernumber;
	private MultipartFile userphoto;

	public MemberReg() {
	}
	
	

	public MemberReg(String userid, String userpw, String username, String usernumber, MultipartFile userphoto) {
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.usernumber = usernumber;
		this.userphoto = userphoto;
	}



	@Override
	public String toString() {
		return "MemberReg [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", usernumber="
				+ usernumber + ", userphoto=" + userphoto + "]";
	}



	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsernumber() {
		return usernumber;
	}

	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}

	public MultipartFile getUserphoto() {
		return userphoto;
	}

	public void setUserphoto(MultipartFile userphoto) {
		this.userphoto = userphoto;
	}

	public Member toMember() {
		Member member = new Member();
		member.setUserid(userid);
		member.setUserpw(userpw);
		member.setUsername(username);
		member.setUsernumber(usernumber);
		return member;
	}

	
	
	

}
