package fruit;

public class fruitBuyer {



		// 변수와 메소드를 정의해준다
		// 구매자의 소유 금액, 소유한 사과의 갯수

		int myMoney = 5000; // 구매자의 소지금액
		int numOfApple = 0; // 구매자의 사과개수

		// 기능 : 사과 구매, 현재상태(금액, 사과개수)값을 출력

		// 사과를 구매
		// 판매자 정보와 금액을 받는다, - 판매자의 판매 메서드 호출!

		// 구매자의 사과 개수를 증가시켜야함
		// 구매자의 금액을 감소시킨다.

		


	// 참조 변수는 객체의 주소를 저장하고 있다 -> 셀러의 참조값을 받도록 참조변수를 매개 변수로 정의.
	void buyApple(fruitSeller seller, int money) {
		
			// 구매할 사과의 개수를 구한다.
			int num = seller.saleApple(money);
			// 나의 사과 개수 증가
			numOfApple +=num;
			// 나의 보유 금액 감소
			myMoney -=money;
	}
	
	// 현재 상태 (금액, 사과의 개수) 값을 출력
	void showBuyResult() {
		System.out.println("보유 금액 : "+ myMoney);
		System.out.println("보유한 사과의 개수는 : " + numOfApple);
	}
	}

