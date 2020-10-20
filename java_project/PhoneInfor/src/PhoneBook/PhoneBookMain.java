package PhoneBook;
import java.util.Scanner;


public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneBookManager pb = new PhoneBookManager(100);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력(1) 전체출력(2) 삭제(3) 검색 (4) 끝내기(5)");
			
			String input = sc.nextLine().trim();
			if (input != null && input.length() > 0) {
				switch (input) {
				case "1":
					pb.insertInfo();
					break;
				case "2":
					pb.showAllData();
					break;
				case "3":
					pb.deleteInfo();
					break;
				case "4":
					pb.searchInfo();
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
