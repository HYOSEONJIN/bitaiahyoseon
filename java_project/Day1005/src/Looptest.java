
public class Looptest {

	public static void main(String[] args) {

		// while loop
		// 반복의 횟수를 체크하기 위한 인덱스
		int i = 0;

		while (i < 5) {
			System.out.println("자바 안녕~!! " + i);
			i++;
		}

		System.out.println("--------------------------------------------");

		// do while Loop
		// 최소 한번 실행 후 조건에 맞게 반복 설정

		i = 0;

		do {
			System.out.println("안녕 자바 !! " + i);
		} while (i > 5);

		System.out.println("--------------------------------------------");

		// for Loop

		int sum = 0;

		for (int j = 0; j < 11; j++) {
			sum += j;
		}
		System.out.println(sum);
		System.out.println("--------------------------------------------");

		// 0부터 몇까지 더해나갔을 때 합이 100이 넘어가는지 확인하는 프로그램

		sum = 0;
		i = 0;

		// 몇번을 반복해야하는지 모름!

		while (true) {
			// 탈출의 조건
			if (sum > 100) {
				break;
			}

			i++; // 더하는 수의 증가
			sum += i; // 합을 구하는 연산
		}

		System.out.println(i + "를 더했을 때 100이 넘어갑니다. 100이 넘어가는 최초의 값은 " + sum);
		System.out.println("--------------------------------------------");
		
		// continue문 예제!
		// 1부터 10까지의 수중 3의 배수를 생략하고 출력
		
		for (i=0; i<11 ; i++) {
			if(i%3==0) { // 3의 배수를 찾는 조건
				continue;
				}
			System.out.print(i+ ", ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		
		
		// continue를 이용한 숫자찾기
		// 0~99까지의 숫자 중에 5의 배수이면서 7의 배수인 숫자를 출력하고 총 몇개가 존재하는지 갯수를 출력
		
		
		int num=0;
		int count=0;
		
		while(num<100) {
			num++;
			if(num%5!=0 || num%7!=0) {
				continue;
			}
			
			count++;
			System.out.print(num+", ");
		}
		System.out.println();
		System.out.println("0~99사이의 숫자중 5의 배수이면서 7의 배수인 숫자는 모두 " + count + "개가 있다.");
		
		System.out.println();
		System.out.println("--------------------------------------------");
		
		
		outerLoop : for(i=1; i<10; i++) {
			for(int j=1; j<10 ; j++) {
				System.out.println("["+i+","+j+"]");
				if(i%2==0 && j%2==0) {
					break outerLoop;
				}
			}
		}
	}

}
