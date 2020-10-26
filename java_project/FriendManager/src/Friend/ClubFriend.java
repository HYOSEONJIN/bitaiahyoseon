package Friend;

import java.io.Serializable;

public class ClubFriend extends Friend implements Serializable {



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
			super.showData();
	}
	
	
}
