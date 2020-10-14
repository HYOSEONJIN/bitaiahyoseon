package fruit;

public class fruitSeller {


		// 클래스 에는 변수와 메서드를 정의
		// 성격이 비슷한 변수 메서드를 정의한다
	
		// 여기있는 변수 : 인스턴스 변수 , 멤버 변수
	
		final int applePrice = 1000; // 사과1개의 가격
		int numOfApple = 20; // 사과의 갯수
		int myMoney =0; // 수익금액
		
		// 기능 : 판매, 정산 출력
		// 판매메서드 : 돈을받고,
		// 반환하는 사과의 개수, 
		// 수익금 증가,
		// 보유 사과의 갯수 감소
		// 사과 갯수 반환
		
		int saleApple(int money) {
			
			int num= 0; // 반환할 사과의 개수 , 지역변수는 반드시 초기화 해주어야 한다.
			
			// 반환할 사과의 개수를 구한다
			num= money/applePrice; // 받은돈/1000
			//수익금증가
			myMoney = myMoney + money ;
			//사과의갯수감소
			numOfApple = numOfApple - num;
			
			return num;
		}
		
	
		



		// 정산출력 : 보유한 사과 개수 출력, 보유한 금액 출력 (반환타입이 없으므로 void)
		// 받는 데이터가 없으므로 매개개 변수 정의하지 않는다
		void showSaleResult() {
			System.out.println("현재 보유한 사과의 개수 : " + numOfApple);
			System.out.println("판매 수익 금액 : " +  myMoney);
		}
	}


