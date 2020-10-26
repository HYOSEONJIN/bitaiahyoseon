package Friend;

import java.io.Serializable;

public class Friend implements Serializable {

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


	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + PhoneNumber);
		System.out.println("주소 : " + addr);
	}
	
	public void showBasicInfo() {
	
	}

		
	}
	
	


