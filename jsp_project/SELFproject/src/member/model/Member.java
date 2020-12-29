package member.model;

public class Member {
	
	private String userId;
	private String userPw;
	private String userName;
	private String userNumber;
	private String userPhoto;
	
	public Member() {
	}

	public Member(String userId, String userPw, String userName, String userNumber, String userPhoto) {
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

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userNumber="
				+ userNumber + ", userPhoto=" + userPhoto + "]";
	}
	
	
	public LoginMemberInfo toLMI() {
		return new LoginMemberInfo(userId, userName, userNumber, userPhoto);
	}
	
	
	

	

}
