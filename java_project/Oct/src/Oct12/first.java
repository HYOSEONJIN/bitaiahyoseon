package Oct12;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<7 ; i++) {
			for(int j=1; j<7 ;j++) {
				if((i+j)==6) {
					System.out.println("1번 주사위의 눈이 " + i + ", 2번 주사위의 눈이 " + j +"인 경우");
				}
			}
		}
}
}