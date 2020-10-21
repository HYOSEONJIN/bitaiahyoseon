package Friend;

public class HighFriend extends Friend {

	private String work; // 직업을 추가해줌

	// 인스턴스 변수 초기화 // 워크추가
	HighFriend(String name, String pNum, String addr, String work) {
		super(name, pNum, addr);
		this.work = work;
	}

	@Override
	public void showData() { 
		super.showData();
		System.out.println("직업 : " + work);
		
	}

	@Override
	public void showBasicInfo() {
		super.showData();
	}

}
