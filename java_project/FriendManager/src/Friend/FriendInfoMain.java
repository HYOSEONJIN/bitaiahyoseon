package Friend;

import java.util.Scanner;

public class FriendInfoMain {

	public static void main(String[] args) {

		FriendInfoHandler handler = new FriendInfoHandler(10);
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("** 메뉴선택 **");
			System.out.println("1 : 입력");
			System.out.println("2 : 검색");
			System.out.println("3 : 삭제");
			System.out.println("4 : 전체 정보 출력 ");
			System.out.println("5 : 간단 정보 전체 출력 ");
			System.out.println("6 : 종료 ");
			System.out.println("선택하세요 >>");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1: 
					handler.addFriend();
					break;
				case 2:
					handler.searchInfo();
					break;
				case 3:
					handler.deleteInfo();
					break;
				case 4:
					handler.showAllData();
					break;
				case 5:
					handler.showAllSimpleData();
					break;
				case 6:
					System.out.println("프로그램을 종료합니다.");
					return;
			
			}
		}
	}

}
