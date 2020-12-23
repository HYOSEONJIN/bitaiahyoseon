package form;

public class Member {
	
		
		private String userId; 	// 아이디
		private String pass;	// 비밀번호
		private String userName;
		private String userPhoto;
		

		public Member(String userId, String pass, String userName, String userPhoto) {
			super();
			this.userId = userId;
			this.pass = pass;
			this.userName = userName;
			this.userPhoto = userPhoto;
		}
		public Member() {
			super();
		}
		
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
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
		public String getUserPhoto() {
			return userPhoto;
		}
		public void setUserPhoto(String userPhoto) {
			this.userPhoto = userPhoto;
		}
		@Override
		public String toString() {
			return "Member [userId=" + userId + ", pass=" + pass + ", userPhoto=" + userPhoto + "]";
		}
		
		

		
		
	}



