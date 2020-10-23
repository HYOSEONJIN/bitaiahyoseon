package Friend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FriendInfoMain {

	public static void main(String[] args) {

		FriendInfoHandler handler = FriendInfoHandler.getInstance();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("** 메뉴선택 **");
				System.out.println(Number.INSERT + " : 입력");
				System.out.println(Number.SEARCH + " : 검색");
				System.out.println(Number.DELETE + " : 삭제");
				System.out.println(Number.ALLPRINT + " : 전체 정보 출력 ");
				System.out.println(Number.SIMPLEPRINT + " : 간단 정보 전체 출력 ");
				System.out.println(Number.EXIT + " : 종료 ");
				System.out.println("선택하세요 >>");
				
				int choice = oneSix();
				
				switch (choice) {
				case Number.INSERT:
					handler.addFriend();
					break;
				case Number.SEARCH:
					handler.searchInfo();
					break;
				case Number.DELETE:
					handler.deleteInfo();
					break;
				case Number.ALLPRINT:
					handler.showAllData();
					break;
				case Number.SIMPLEPRINT:
					handler.showAllSimpleData();
					break;
				case Number.EXIT:
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			} catch (InputMismatchException | NumberRange e) {
				System.out.println("1에서 6사이의 숫자만 입력하세요");
				continue;
			}
		}
	}
		
		public static int oneSix() throws NumberRange{
			Scanner sc = new Scanner(System.in);
			int choice=sc.nextInt();			
			if(choice>=7 || choice<0) {
				NumberRange e = new NumberRange(choice);
				throw e;
			}
			return choice;
		} 

	

}
