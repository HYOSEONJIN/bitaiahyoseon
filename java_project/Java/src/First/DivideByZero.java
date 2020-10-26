package First;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {

		int n1 = 0, n2 = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("두개의 정수를 입력하세요");
				sc.nextLine();
				n1 = sc.nextInt();
				sc.nextLine();
				n2 = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException a) {
				System.out.println("올바른 메뉴를 선택하지 않았습니다.");
				System.out.println("다시 선택해주세요");
				sc.nextLine();
				continue;
			}
			break;
		}

		try {
			System.out.println("나눗셈의 몫 : " + (n1 / n2));
			System.out.println("나눗셈의 나머지 : " + (n1 % n2));
		} catch (ArithmeticException a) {
			System.out.println("올바른 숫자를 입력하세요!");
			System.out.println(a.getMessage());
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}

	}
}
