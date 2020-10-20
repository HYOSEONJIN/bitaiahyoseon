package Friend;

public class HighFriend extends Friend {

	private String work ; // 직업을 추가해줌
	
	// 인스턴스 변수 초기화									// 워크추가
	HighFriend(String name, String pNum, String addr, String work) {
		super(name, pNum, addr);
		this.work=work;
	}

	@Override
	public void showData() {   // Friend f = new HighFriend() > f.showDate();
		super.showData();
		System.out.println("직업 : " + work);
		// 원래 showData메서드가 가진 기능(super)에 새로운 기능을 추가해줌!
	}

	@Override
	public void showBasicInfo() {
		System.out.println("이름 : " + getName()); // private이므로 getName생성해서 불러움
		System.out.println("전화번호 : " + getPhoneNumber());
		System.out.println("주소 : " + getAddr());
	}
	


}
