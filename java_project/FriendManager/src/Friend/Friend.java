package Friend;

public class Friend {

	private String name; // 이름
	private String PhoneNumber; // 전화번호
	private String addr; // 주소

	// 생성자를 통해서 인스턴스 변수들을 초기화
	Friend(String name, String pNum, String addr) {
		this.name = name;
		this.PhoneNumber = pNum;
		this.addr = addr;
	}
	
	
	// name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	// PhoneNumber
	public String getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	// addr
	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	// 오버라이딩 처리할 거임 : 상속하는 클래스의 추가 속성을 출력하도록.
	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + PhoneNumber);
		System.out.println("주소 : " + addr);
	}
	
	public void showBasicInfo() {
		//오버라이딩을 확인하기 위해서 만들어둔 것
		// 비어있는 처리부를 기능을 추가할 것.
	}
	
	
}
