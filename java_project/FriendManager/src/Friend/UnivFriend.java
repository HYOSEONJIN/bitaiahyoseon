package Friend;

public class UnivFriend extends Friend {

	private String major; // 전공
	private String year ; // 학년 + 추가
	private String email; // 이메일 + 추가

	// 생성자를 이용해 초기화
	UnivFriend(String name, String pNum, String addr, String major, String year, String em) {
		super(name, pNum, addr);
		this.major = major;
		this.year=year;
		this.email=em;
	}



	@Override
	public void showData() {
		super.showData();
		System.out.println("전공 : "+ major);
		System.out.println("학년 : " + year);
		System.out.println("이메일 : " +email);
		
	}

	@Override
	public void showBasicInfo() {
			super.showData();
	}
	
	

}
