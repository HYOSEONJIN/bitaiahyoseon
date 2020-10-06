
public class Memojang {
public static void main(String[] args){

	int number = 12345;

	int tmp = number;

	int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
                // >> 54321

	while(tmp !=0) {

		result= number%10 ;
		System.out.println(result);
		number=number/10;
		
		if(number==0) {
			tmp=0;}			
			
				
	} 

	if(number == result)

	System.out.println( number + "는 회문수 입니다.");

	else

	System.out.println( number + "는 회문수가 아닙니다.");

	} // main
}