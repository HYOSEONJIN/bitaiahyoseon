import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		// 문제1

		int num = 120;
		if ((num > 0) && (num % 2 == 0)) {
			System.out.println("양수이면서 짝수");
		}

		// 문제2

		Scanner sc = new Scanner(System.in);

		int n2;
		System.out.println("문제2의 num을 입력하세요 ");
		n2 = sc.nextInt();

		if (n2 < 0) {
			System.out.println("0 미만");
		} else if (n2 >= 0 && n2 < 100) {
			System.out.println("0이상 100미만");
		} else if (n2 >= 100 && n2 < 200) {
			System.out.println("100이상 200미만");
		} else if (n2 >= 200 && n2 < 300) {
			System.out.println("200이상 300미만");
		} else {
			System.out.println("300이상");
		}

		// 문제3

		int num1 = 50, num2 = 100;
		int big, diff;

		if (num1 > num2) {
			big = num1;
			diff = num1 - num2;
			System.out.println("큰수는 " + big + ", 큰수 - 작은수의 값은 " + diff);
		} else if (num2 > num1) {
			big = num2;
			diff = num2 - num1;
			System.out.println("큰수는 " + big + "큰수 - 작은수의 값은 " + diff);
		} else {
			System.out.println("num1과 num2는 같다");
		}

		// 문제4

		int n = 3;

		if (n == 1) {
			System.out.println("Simple Java");
		} else if (n == 2) {
			System.out.println("Funny Java");
		} else if (n == 3) {
			System.out.println("Fantastic Java");
		} else {
			System.out.println("The best programming language");
		}
		System.out.println("Do you like coffee?");

		// 문제5

		int num5;

		System.out.println("문제5의 num을 입력하세요");
		num5 = sc.nextInt();

		if (num5 < 0) {
			System.out.println("0미만");
		} else {
			switch (num5 / 100) {
			case 0:
				System.out.println("0이상 100미만");
				break;
			case 1:
				System.out.println("100이상 200미만");
				break;
			case 2:
				System.out.println("200이상 300미만");
				break;
			default:
				System.out.println("300이상");
				break;
			}

			// 문제 6

			int n6 = 1;
			int sum = 0;

			while (n6 < 100) {
				sum += n6;
				n6++;
			}

			System.out.println(sum);

			// 문제 7

			int n7 = 1;

			while (n7 < 101) {
				System.out.println(n7);
				n7++;
			}
			do {
				System.out.println(n7 - 1);
				n7--;
			} while (n7 > 1);

			// 문제 8

			int n8 = 1;
			int sum1 = 0;

			while (n8 < 1001) {

				if (n8 % 14 == 0) {
					System.out.print(n8 + ", ");
					sum1 += n8;
				}

				n8++;
			}
			System.out.println("");
			System.out.println(sum1);

			// 문제9

			int mul = 1;

			for (int i = 2; i < 11; i++) {
				mul = mul * i;
			}

			System.out.println(mul);

			// 문제 10

			int five = 5;

			for (int i = 1; i < 10; i++) {
				System.out.println(five + " * " + i + " = " + (five * i));
			}

			// 문제 11

			int count = 0;

			for (int i = 1; i < 100; i++) {
				if (i % 35 == 0) {
					System.out.println(i);
					count++;
				}
			}
			System.out.println("count: " + count);

			// 문제 12

			int num11 = 1;
			int sum11 = 0;

			while (true) {
				if (num11 % 2 != 0 || num11 % 3 == 0) {
					System.out.println(num11);
					sum11 += num11;
				}

				if (sum11 > 1000) {
					break;
				}
				num11++;
			}

			System.out.println(num11 + "까지 더했을때 1000을 넘는 값 " + sum11 + "을 가진다");

			// 문제 13

			for (int i = 1; i < 10; i++) {
				if (i % 2 == 0 && i != 6) {
					for (int j = 1; j < (i + 1); j++) {
						System.out.println(i + "*" + j + " = " + (i * j));
					}
				}
			}

			// 문제 14

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if ((j + i) == 9) {
						System.out.println("A는 " + i + ", B는 " + j);
					}

				}
			}
			// 문제 15

			int n1 = 2;

			switch (n1) {
			case 1:
				System.out.println("현재 인원은 1명입니다");
				break;
			case 2:
				System.out.println("현재 인원은 1명입니다");
				break;
			case 3:
				System.out.println("현재 인원은 3명입니다");
				break;
			default:
				if (n1 > 3) {
					System.out.println("현재 많은 사람들이 있습니다.");
				}
				System.out.println("ERROR");
			}

		}
	}
}