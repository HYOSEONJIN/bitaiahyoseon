package Friend;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Main implements Serializable{
 
	public static void main(String[] args)   throws Exception {
 
		Manager handler = Manager.getInstance();
		handler.call();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("** 메뉴선택 **");
				System.out.println("1 : 입력, 2:찾기 3:지우기 4:전부출력 5:일부출력 6: 종료");
		
				System.out.println("선택하세요 >>");
				
				int choice = oneSix();
				
				switch (choice) {
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
					handler.save();
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