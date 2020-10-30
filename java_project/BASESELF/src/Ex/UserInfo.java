package Ex;

public class UserInfo {

	private String name;
	private int Pass;
	private int BookNum; // 좌석번호
	private int myMoney = 0; // 돈
	private int point = 0; // 포인트

	public UserInfo(String name, int pass) {

		this.name = name;
		this.Pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPass() {
		return Pass;
	}

	public void setPass(int pass) {
		Pass = pass;
	}

	public int getBookNum() {
		return BookNum;
	}

	public void setBookNum(int bookNum) {
		BookNum = bookNum;
	}

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}
