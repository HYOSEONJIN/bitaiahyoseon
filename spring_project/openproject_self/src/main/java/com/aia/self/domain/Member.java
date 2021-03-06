package com.aia.self.domain;

public class Member {

	private String userid;
	private String userpw;
	private String username;
	private String usernumber;
	private String userphoto;

	public Member() {
	}


	public Member(String userid, String userpw, String username, String usernumber, String userphoto) {

		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.usernumber = usernumber;
		this.userphoto = userphoto;
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


	public String getUserphoto() {
		return userphoto;
	}


	public void setUserphoto(String userphoto) {
		this.userphoto = userphoto;
	}

	
	public LoginMemberInfo toLoginInfo() {
		return new LoginMemberInfo(userid, username, usernumber, userphoto);
	}
	
	

	@Override
	public String toString() {
		return "Member [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", usernumber="
				+ usernumber + ", userphoto=" + userphoto + "]";
	}


	
	
	

}
