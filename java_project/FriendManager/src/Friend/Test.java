package Friend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		
		FriendInfoHandler handler = FriendInfoHandler.getInstance();	
		
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		while(true) {
			System.out.println("** 메뉴선택 **");
			System.out.println(Number.INSERT+ " : 입력");
			System.out.println(Number.SEARCH+ " : 검색");
			System.out.println(Number.DELETE+ " : 삭제");
			System.out.println(Number.ALLPRINT+" : 전체 정보 출력 ");
			System.out.println(Number.SIMPLEPRINT+" : 간단 정보 전체 출력 ");
			System.out.println(Number.EXIT +" : 종료 ");
			System.out.println("선택하세요 >>");
			
			try {
				choice = sc.nextInt();
				if(!(choice>0 && choice<7)) {
					//예외
					NumberRange e = new NumberRange(choice);
					throw e;
				}
			
			} catch(InputMismatchException | NumberRange e) {
				System.out.println("잘못된 입력입니다");
				sc.nextLine();
				continue;						
			} 
			
			
			switch(choice) {
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
				default:
					System.out.println("1-6까지의 숫자만입력하세요");
			
			
			}
		}
	}

}