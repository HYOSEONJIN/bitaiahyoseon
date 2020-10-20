package Friend;

import java.util.Scanner;

public class FriendInfoMain {

	public static void main(String[] args) {

		FriendInfoHandler handler = new FriendInfoHandler(10);
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("** 메뉴선택 **");
			System.out.println("1 : 고교 친구 정보 저장");
			System.out.println("2 : 대학 친구 정보 저장");
			System.out.println("3 : 회사 친구 정보 저장");
			System.out.println("4 : 동호회 친구 정보 저장");
			System.out.println("5 : 전체 정보 출력 ");
			System.out.println("6 : 간단 정보 전체 출력 ");
			System.out.println("7 : 종료 ");
			System.out.println("선택하세요 >>");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				case Menu.INSERT_HIGH: case Menu.INSERT_UNIV: case Menu.INTSERT_COM: case Menu.INSERT_CLUB: 
					handler.addFriend(choice);
					break;
				case Menu.INSERT_ALL:
					handler.showAllData();
					break;
				case Menu.INSERT_BASIC:
					handler.showAllSimpleData();
					break;
				case Menu.EXIT:
					System.out.println("프로그램을 종료합니다.");
					return;
			
			}
		}
	}

}
