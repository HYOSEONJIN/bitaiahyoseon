
import java.lang.Math;
import java.util.Scanner;

public class OperatorTest {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1=10;
		int num2=8;
		
		System.out.println("10/8 = " +num1/num2);
		System.out.println("10%8 = " + num1%num2);
		System.out.println("10/-8 = "+num1%-num2);
		System.out.println("10f/8f = " + 10f/8f);
		System.out.println("10f/8 = " + 10f/8);
		System.out.println("10/8 = " + num1/(float)num2);
		
		char c1='A';
		char c2='B';
		
		System.out.println("'A'<'B' => " +( c1<c2));   // 65<66
		System.out.println("'0' == 0 => " + ('0'==0)); // 48==0
		System.out.println("10.0d == 10.0f => " + (10.0d==10.0f)); // 10.0d==10.0d
		System.out.println("0.1d==0.1 => "+ (0.1d==0.1f));  // 0.1d=0.1d
		
		double d= (double)0.1f;
		
		System.out.println("d => " +d);
		System.out.println("(float)d==0.1f=> " + ((float)d==0.1f));
		
		
		num1=10;
		num2=20;
		
		
		boolean result1 = num1== 10 && num2==20;
						//순서 1        //순서2
		
		boolean result2 = num1<=12 || num2 >=30;

		System.out.println("num1== 10 && num2==20    =>  "+ result1);
		System.out.println("result2 = num1<=12 || num2 >=3      =>  " + result2);
		
		
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 같지 않다");
		}
		else {
			System.out.println("num1과 num2는 같다");
		}
			
			float pi=3.141592f;
		
			float spi= (int)(pi*100)/100f;
			
			System.out.println((int)(pi*100));
			System.out.println(spi);
			
			int price=11234;
			int price2 = price/1000*1000;  // 11*1000
			System.out.println(price2); 
			
			float spi2 = pi*100;
			System.out.println(spi2);//314.1592
			
			float spi21=Math.round(pi *100);
			System.out.println(spi21);//314.1592
						
			float spi211=Math.round(pi *100)/100;
				System.out.println(spi211);
				
				
			int i=5;
			int j=0;
			
			System.out.println(i++); // 출력5, i=6
			System.out.println(++j); // 출력6 i=6
			
			System.out.println("i =  " + i + ", j = " +j);
			
			
			// 문자열 처리 : String 클래스 이용 -> 객체 생성 -> 클래스가 가지는 변수와 메서드를 메모리에 로드한다.
			
			String str=null;
			
			str = "abc";
			System.out.println(str.toString());
			System.out.println(str.equals("abc"));
			
			if(str != null && !str.equals("")) {
				System.out.println(str.charAt(1));
			}
	
			num1=50;
			num2=20;
			
			int big=0; // 큰수
			int diff=0; //두수의차이
			
			//삼항 연산자 이용
			//big = num1>num2 ? num1 : num2;
			
			//diff= num1>num2 ? num1-num2 : num2-num1;
			
			if (num1>num2) {
				big = num1;
				diff =num1-num2;		
			}else {
				big=num2;
				diff = num2-num1;
				
			}
			
			
			System.out.println("큰 수는 " + big);
			System.out.println("큰 수와 작은 수의 차이는 "+ diff);
			
			
			
			//switch
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
				
			switch(n) {
				case 1:
					System.out.println("입력");
					System.out.println("심플자바");
					break;
				case 2:
					System.out.println("데이터열람");
					System.out.println("퍼니자바");
					break;
				case 3:
					System.out.println("정보수정");
					System.out.println("판타스틱자바");
					break;
				case 4:
					System.out.println("데이터삭제");
					break;
					
			}
		}
	
}
