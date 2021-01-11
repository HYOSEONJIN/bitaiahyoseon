package com.aia.self.domain;

import org.springframework.web.multipart.MultipartFile;

public class LoginMemberInfo {
	

		private String userId;
		private String userName;
		private String userNumber;
		private String userPhoto;
		

		public LoginMemberInfo() {
		
		}

		public LoginMemberInfo(String userId, String userName, String userNumber, String userPhoto) {
	
			this.userId = userId;
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
			return "LoginMemberInfo [userId=" + userId + ", userName=" + userName + ", userNumber=" + userNumber
					+ ", userPhoto=" + userPhoto + "]";
		}


		

	}
