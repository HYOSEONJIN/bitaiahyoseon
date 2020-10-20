package PhoneBook;

public class PhoneInfo {

	private String name;
	private String PhoneNumber;
	
	
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}


	PhoneInfo(String name, String pNum){
		this.name=name;
		this.PhoneNumber=pNum;
		}
	
	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + PhoneNumber);
		
	}
	
	}
