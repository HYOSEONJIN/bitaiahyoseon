package form;

public class LoginFormData {
	
	private String userId; 	// 아이디
	private String pass;	// 비밀번호
	
	
	public LoginFormData() {
		super();
	}


	public LoginFormData(String userId, String pass) {
		super();
		this.userId = userId;
		this.pass = pass;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	@Override
	public String toString() {
		return "LoginFormData [userId=" + userId + ", pass=" + pass + "]";
	}

	
	
	
}
