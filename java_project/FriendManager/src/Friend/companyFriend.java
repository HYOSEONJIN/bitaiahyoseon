package Friend;

import java.io.Serializable;

public class companyFriend extends Friend implements Serializable  {

	private String company; // �쉶�궗 
	private String email;
	
	companyFriend(String name, String pNum, String addr, String cpn, String em) {
		super(name, pNum, addr);
		this.company=cpn;
		this.email=em;
	}

	public void showData() {
	System.out.println("이름 : " + getName());
	System.out.println("전화번호 : " + getPhoneNumber()); 
	System.out.println("회사 : "+ company);
	System.out.println("이메일 : " + email);
}

	@Override
	public void showBasicInfo() {
			super.showData();
	}
	
}
