package card;

public class CardMain {
	
	static int weight = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("카드의 폭 사이즈 : " + card.width);
	
		
		System.out.println(Math.PI);
		
		card c1 = new card();
		card c2 = new card();
		
		c1.play();
		
		System.out.println("카드의 폭 사이즈 : " + c1.width);
		System.out.println("카드의 폭 사이즈 : " + c2.width);
		
		card.width = 120;
		System.out.println("카드의 폭 사이즈 변경");

		System.out.println("카드의 폭 사이즈 : " + c1.width);
		System.out.println("카드의 폭 사이즈 : " + c2.width);
		
	}

}
