package com.aia.self.domain;

import org.springframework.web.multipart.MultipartFile;

public class Member {
	
	private String userId;
	private String userPw;
	private String userName;
	private String userNumber;
	private MultipartFile userPhoto;
	
	public Member() {
	}

	public Member(String userId, String userPw, String userName, String userNumber, MultipartFile userPhoto) {
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userNumber = userNumber;
		this.userPhoto = userPhoto;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}



	public MultipartFile getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(MultipartFile userPhoto) {
		this.userPhoto = userPhoto;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userNumber="
				+ userNumber + ", userPhoto=" + userPhoto + "]";
	}
	
	
	/*
	 * public LoginMemberInfo toLMI() { return new LoginMemberInfo(userId, userName,
	 * userNumber, userPhoto); }
	 */
	
	

	

}
