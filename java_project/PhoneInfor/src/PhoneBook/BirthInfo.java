package PhoneBook;

public class BirthInfo extends PhoneInfo {

	private String birthday;
	
	BirthInfo(String name, String pNum, String birthday) {
		super(name, pNum);
		this.birthday=birthday;
	}

	@Override
	public void showData() {
		super.showData();
		System.out.println("생년월일 : " + birthday);
	}



}
