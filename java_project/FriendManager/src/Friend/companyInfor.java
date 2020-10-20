package Friend;

public class companyInfor extends Friend {

	private String company; // 회사 
	private String email;
	
	companyInfor(String name, String pNum, String addr, String cpn, String em) {
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

	@Override // 원래 비어있는 메소드였음
	public void showBasicInfo() {
		System.out.println("이름 : " + getName()); // private이므로 getName생성해서 불러움
		System.out.println("전화번호 : " + getPhoneNumber());
		System.out.println("주소 : " + getAddr());
	}
	
}
