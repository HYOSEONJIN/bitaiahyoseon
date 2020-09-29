import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		// 조건문과 반목문.pdf 문제들

		// 문제1

		int num = 120;

		if (num > 0 && num % 2 == 0) {
			System.out.println("양수이면서짝수이다");
		} else {
			System.out.println("-");
		}

		// 문제2

		Scanner sc = new Scanner(System.in);
		System.out.print("num입력 ");
		num = sc.nextInt();

		if (num < 0) {
			System.out.println("0미만");
		} else if (num < 100) {
			System.out.println("0이상 100미만");
		} else if (num < 200) {
			System.out.println("100이상 200미만");
		} else if (num < 300) {
			System.out.println("200이상 300미만");
		} else {
			System.out.println("300이상");
		}

		// 문제3 - 강사님이랑 했음

		// 문제4

		System.out.print("num입력 ");
		num = sc.nextInt();

		if (num == 1) {
			System.out.println("1");
		} else if (num == 7) {
			System.out.println("7");
		} else if (num == 6) {
			System.out.println("KTF");
		} else if (num == 9) {
			System.out.println("LG");
		} else {
			System.out.println("UNKNOWN");
		}

		// 문제5
		
	}

}
