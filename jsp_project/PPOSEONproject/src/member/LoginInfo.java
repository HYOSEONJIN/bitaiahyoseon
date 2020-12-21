package member;

public class LoginInfo {

	private String userId;
	private String userName;
	private String userPhoto;
	

	public LoginInfo(String userId, String userName, String userPhoto) {
	
		this.userId = userId;
		this.userName = userName;
		this.userPhoto = userPhoto;
	}
	
	
	// getter만만들어준다
	public String getUserId() {
		return userId;
	}


	public String getUserName() {
		return userName;
	}


	public String getUserPhoto() {
		return userPhoto;
	}


	@Override
	public String toString() {
		return "LoginInfo [userId=" + userId + ", userName=" + userName + ", userPhoto=" + userPhoto + "]";
	}






}
