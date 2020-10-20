package ver04;

public class PhoneBook {
	
	
	// 공통되는 정보
	private String name;
	private String PhoneNumber;
	private String email;
	
	
	public String getName() {
		return name;
	}


	public String getPhoneNumber() {
		return PhoneNumber;
	}



	public String getEmail() {
		return email;
	}

	
	//초기화
	PhoneBook(String name, String pb, String em) {
		this.name=name;
		this.PhoneNumber=pb;
		this.email=em;		
		
	}
	
	public void showData() {
		System.out.println("이름 : "+ name);
		System.out.println("전화번호 : "+ name);
		System.out.println("이메일 : "+ name);
	}

}
