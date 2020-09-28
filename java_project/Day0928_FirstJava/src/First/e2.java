package First;

import java.util.Scanner;

public class e2 {

	public static void main(String[] args) {

		
		// 영어만 입력받는 거 만들어보기
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
				
				if ( a<97 || a>122 ){
					System.out.println("영문만 입력해주세요.");
					b=true;
					break;
				}
	}
			
			if(b==false) {
				System.out.println("입력된 ID는 " + id);
				break;
			}
			
			
		// 숫자까지 입력가능하게 하고싶으면 어떻게 할지 생각해보기 = 내일..
			
		}
}
}
