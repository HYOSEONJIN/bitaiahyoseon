package myself;

// import java.util.Scanner;

import myself.PhoneInfor;
import ver04.Util;

public class PhoneBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner sc = new Scanner(System.in);
		PhoneInfor book = new PhoneInfor();

		while (true) {

			System.out.println("입력(1) 전체출력(2) 삭제(3) 검색 (4) 끝내기(5)");
			String input = Util.sc.nextLine().trim();

			if (input != null && input.length() > 0) {
				switch (input) {
				case "1":
					book.setData();
					break;
				case "2":
					book.showData();
					break;
				case "3":
					book.deleteData();
					break;
				case "4":
					book.searchInfo();
					break;
				case "5":
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
				default:
					System.out.println("1부터 5까지 정해진 수만 입력하세요");
				}
			} else {
				System.out.println("ERROR 아무것도 입력하지 않았습니다.");
			}

		}

	}

}
