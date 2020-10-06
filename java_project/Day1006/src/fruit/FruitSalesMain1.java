package fruit;

public class FruitSalesMain1 {

	public static void main(String[] args) {
		
		// fruitSeller 타입의 참조변수 선언
		fruitSeller seller = null;
		// fruitSeller의 객체 생성
		
		seller = new fruitSeller(); // 객체 생성 후 객체의 주소값을 반환해준다.
		
		// fruitBuyer 타입의 참조변수 선언과 초기화
		fruitBuyer buyer = new fruitBuyer();
		
		// 사과를 구매 : 2000 지불
		
		buyer.buyApple(seller, 2000);
		
		System.out.println("판매자의 현재 지표");
		seller.showSaleResult();
		System.out.println("구매자의 현재 지표");
		buyer.showBuyResult();
		
		

	}

}
