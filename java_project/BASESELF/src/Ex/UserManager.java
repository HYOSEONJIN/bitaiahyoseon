package Ex;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

	public UserManager() {
		
	}

	public List<UserInfo> list = new ArrayList<UserInfo>();
	
	

	// 유저를 받는 메서드 (가입)
	
	void joinMembeR() {
		String name = ""; // 나중에 받는 처리
		int pass = 0; // 나중에 받는처리
		
		list.add(new UserInfo(name, pass));
	
	}
	
	
	// 유저 정보 출력 메서드
	
	void showUserInfo() {
		
	}
	
	


}
