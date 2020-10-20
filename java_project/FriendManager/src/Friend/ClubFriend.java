package Friend;

public class ClubFriend extends Friend{



	private String clubname;
	
	ClubFriend(String name, String pNum, String addr, String club) {
		super(name, pNum, addr);
		this.clubname=club;
	}

	@Override
	public void showData() {
		super.showData();
		System.out.println("동호회 이름 : " + clubname);
	}

	@Override
	public void showBasicInfo() {
		System.out.println("이름 : " + getName()); // private이므로 getName생성해서 불러움
		System.out.println("전화번호 : " + getPhoneNumber());
		System.out.println("주소 : " + getAddr());
	}
	
	
}
