package com.aia.firstspring.member.domain;

public class LoginRequest {

	
	// 변수의 이름이 form에있는 name과 같아야 한다.
	String uid;
	String pw;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "LoginRequest [uid=" + uid + ", pw=" + pw + "]";
	}
	
	
}
