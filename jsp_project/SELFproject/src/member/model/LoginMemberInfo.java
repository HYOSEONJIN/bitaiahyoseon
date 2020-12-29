package member.model;

public class LoginMemberInfo {
	
	private String userId;
	private String userName;
	private String userNumber;
	private String userPhoto;
	
	public LoginMemberInfo(String userId, String userName, String userNumber, String userPhoto) {
		this.userId = userId;
		this.userName = userName;
		this.userNumber = userNumber;
		this.userPhoto = userPhoto;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public String getUserPhoto() {
		return userPhoto;
	}
	
	
	
	
	

}
