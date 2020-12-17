package form;

public class regFormData {
	
	private String userId;
	private String pass;
	private String userName;
	private Object File;
	
	public regFormData() {
		super();
	}
	
	public regFormData(String userId, String pass, String userName, Object file) {
		super();
		this.userId = userId;
		this.pass = pass;
		this.userName = userName;
		File = file;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Object getFile() {
		return File;
	}

	public void setFile(Object file) {
		File = file;
	}

	@Override
	public String toString() {
		return "regFormData [userId=" + userId + ", pass=" + pass + ", userName=" + userName + ", File=" + File + "]";
	}
	
	
	
	
}
