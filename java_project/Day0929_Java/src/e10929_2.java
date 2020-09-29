import java.util.Scanner;

public class e10929_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 영어만 입력받는 거 만들어보기 + 숫자까지 (영문과숫자로이루어진id입력받기)
		// ID
		
		
		Scanner sc = new Scanner(System.in);
		
		String id;
		String small;
		boolean b; 
		

		
		while(true) {
			b=false;
			System.out.print("ID 입력 : ");
			id=sc.next();
			small=id.toLowerCase(); // 대소문자 구별을 위해 소문자로 바꿔줌
			
			for(int i=0 ; i<small.length() ; i++) {
				char a = small.charAt(i);
				int asc = (int)a; // 아스키코드로 변경
				
				if ((96<asc && asc<123) || (47<asc && asc<58) ) {
					b=false;
					break;
				}
				else  {
					System.out.println("영문/숫자만 입력하세요");
					b=true;
					break;
				}  
	}
			
			if(b==false) {
				System.out.println("입력된 ID는 " + id);
				break;
			}
			
			
		}
	}
}