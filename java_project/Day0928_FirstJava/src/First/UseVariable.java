package First;

public class UseVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 정수형 타입의 변수 num1변수를 선언하자
		
		int num1;
		
		// 2. 변수 num1에 숫자 데이터 10을 저장하자.
		
		num1= 10;
				
		// 3. 정수형 타입의 변수 num2변수를 선언하고
		// 숫자 20을 대입하자.
		
		int num2= 20;
		
		// 4. 정수형 타입의 변수 num3을 선언하고
		// 변수 num1과 num2를 합하는 연산한 결과를
		// 변수 num3에 대입한다.
		
		int num3=num1+num2;
		
		// 5. 연산의 결과를 출력하자.
		
		System.out.println(num3);
		
		
		
		
		// 실수 연산 오류
		
		
		float n1 = 1.0000001f;
		double n2 = 1.0000002;
		
		
		System.out.println((double)n1);
		System.out.println(n1+n2);
		
		
		// 캐릭터 값은 유니코드로 저장된다. 
		 
		char c1='A';
		System.out.println(c1);
		System.out.println((int)c1); //형변환

		
		
		
		// boolean : true/false
		
		boolean check = true;
		
		if(check) {   //논리값을 가지는 변수에 참조
			System.out.println(true);
			}
		
		int i =0;
		
		while(check) { // 반복의조건
			if(1<5) {
				break;
			}
			i++; // 탈출의 조건, 연산식
		}
	}

}
