
public class Lotto {

	public static void main(String[] args) {

		// 로또

		int[] ball = new int[45];

		// 각 변수에 숫자를 중복되지 않게 저장~
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		

		// 각index의 값을 섞는 처리~ 
			
		int j=0; // 임의의 index
		int temp=0; // 각 변수의 값을 바꾸기 위한 임시변수
		
		for(int i=0; i<100; i++) {
			// 임의 인덱스 index를 구한다.	
			j=(int)(Math.random()*44)+1;
			
			temp=ball[0];
			ball[0]=ball[j];
			ball[j]=temp;
			
		}
		
		for (int i=0; i<6; i++) {
			System.out.println(ball[i]);
		}
		
	}

}
