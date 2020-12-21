package member;

// 회원정보를 저장하는 빈즈클래스
public class Member {

	// 변수는 private
	private String userId;
	private String password;
	private String userName;
	private String userPhoto;
	
	// 기본생성자 필수	
	public Member() {
	}

	public Member(String userId, String password, String userName, String userPhoto) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.userPhoto = userPhoto;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", password=" + password + ", userName=" + userName + ", userPhoto="
				+ userPhoto + "]";
	}
	
	
	// Member -> LoginInfo
	public LoginInfo toLoginInfo() {		
		return new LoginInfo(this.userId, this.userName, this.userPhoto);
	}
	

	
	
}
