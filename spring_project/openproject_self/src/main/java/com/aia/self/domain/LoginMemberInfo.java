package com.aia.self.domain;

import org.springframework.web.multipart.MultipartFile;

public class LoginMemberInfo {
	

		private String userid;
		private String username;
		private String usernumber;
		private String userphoto;
		

		public LoginMemberInfo() {
		
		}


		public LoginMemberInfo(String userid, String username, String usernumber, String userphoto) {

			this.userid = userid;
			this.username = username;
			this.usernumber = usernumber;
			this.userphoto = userphoto;
		}



		public String getUserid() {
			return userid;
		}




		public String getUsername() {
			return username;
		}



		public String getUsernumber() {
			return usernumber;
		}




		public String getUserphoto() {
			return userphoto;
		}



		@Override
		public String toString() {
			return "LoginMemberInfo [userId=" + userid + ", userName=" + username + ", userNumber=" + usernumber
					+ ", userPhoto=" + userphoto + "]";
		}


		

	}
