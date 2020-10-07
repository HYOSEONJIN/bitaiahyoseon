package card;

public class card {
	
	String kind; //카드의 종류
	int number; // 카드의 숫자
	
	
	//클래스 변수선언
	static int width=100; // 카드의폭   [ 보통 static을 쓰는 변수는 final을 붙인다 ]
	static int height =250; // 카드의 높이
	
	void play() {
		System.out.println("카드놀이를 합니다.");
	}
	
	
	

}
