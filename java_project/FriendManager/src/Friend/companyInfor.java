package Friend;

public class CompanyInfor extends Friend {

	private String company; // 회사 
	private String email;
	
	CompanyInfor(String name, String pNum, String addr, String cpn, String em) {
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
