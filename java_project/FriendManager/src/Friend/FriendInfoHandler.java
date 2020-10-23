package Friend;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendInfoHandler {
	Scanner sc = new Scanner(System.in);

	// 친구정보를 저장하는 배열을 필요로함.
	private  ArrayList<Friend> ar1; // 친구의 정보를 저장하는 배열 생성
	private int numOfFriends; // 저장된 친구의 정보 개수, 배열에 추가 시 count, index로 사용

	// static  ArrayList<FriendInfoHandler> List = new ArrayList<FriendInfoHandler>();
	
	// 생성자로 초기화 // 싱글턴패턴 적용
	private FriendInfoHandler() {
		ar1= new ArrayList<Friend>();
	}
	
	// 사용 인스턴스 클래스 내부 생성
	private static FriendInfoHandler fi = new FriendInfoHandler();
	
	// 참조값을 제공하는 메서드
	public static FriendInfoHandler getInstance() {
		return fi;
	}
	
	// 배열에 친구정보를 저장하는 기능 : 다형성을 이용한 매개변수 정의

	void addFriend() {

		// 기본정보를 입력받자 > 이름, 전화번호, 주소
		
		System.out.println("친구 정보의 입력을 시작합니다.");
		System.out.println(Number.HIGH+")고교친구 "+Number.UNIV+")대학친구 "+Number.COM+")회사친구 "+ Number.CLUB+")동호회 친구");
		int choice=sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력해주세요 >>");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요 >>");
		String pNum = sc.nextLine();
		System.out.println("주소를 입력해주세요 >>");
		String addr = sc.nextLine();

		if (choice == Number.HIGH) {
			// 고교친구 데이터 받고 > 인스턴스 생성 > 배열 저장
			System.out.println("직업을 입력해 주세요");
			String work = sc.nextLine();

			// 배열에 저장
			ar1.add(new HighFriend(name, pNum, addr, work));
			numOfFriends++;

		} else if (choice == Number.UNIV) {
			// 대학친구 데이터 받고 > 인스턴스 생성 > 배열 저장
			System.out.println("전공을 입력해 주세요");
			String major = sc.nextLine();
			System.out.println("학년을 입력해 주세요");
			String year = sc.nextLine();
			System.out.println("이메일을 입력해 주세요");
			String email = sc.nextLine();

			ar1.add(new UnivFriend(name, pNum, addr, major, year, email));
			numOfFriends++;

		} else if (choice == Number.COM) {
			System.out.println("회사를 입력해주세요");
			String cpn = sc.nextLine();
			System.out.println("이메일을 입력해주세요");
			String email = sc.nextLine();

			ar1.add(new CompanyInfor(name, pNum, addr, cpn, email));
			numOfFriends++;
			
		} else if (choice == Number.CLUB) {
			System.out.println("동호회 이름을 입력하세요 ");
			String club = sc.nextLine();
			
			ar1.add(new ClubFriend(name, pNum, addr, club));
			numOfFriends++;
		}
		System.out.println("입력이 완료되었습니다.");
	}

	// 인덱스 써치 메서드
	
	int searchIndex(String name) {
		int result=-1;
		
		for (int i=0; i<numOfFriends; i++) {
			if(ar1.get(i).getName().equals(name)) {
				result=i;
				break;
			}
		}
		return result;
	}
	
	
	// 삭제
	
	void deleteInfo() {
		if (numOfFriends==0) {
			System.out.println("저장된 데이터가 없습니다.");
		}
		System.out.println("정보를 삭제하고자하는 사람의 이름을 입력하세요 ");
		String name=sc.nextLine();
		int index=searchIndex(name);
		
		if(index<0) {
			System.out.println("삭제하고자 하는 정보가 존재하지 않습니다.");
		} else {
			//삭제
			for(int i=index;i<numOfFriends-1;i++) {
				ar1.remove(i);
			}
			numOfFriends--;
			System.out.println("삭제되었습니다.");
		}
	}
	
	// 써치
	
	void searchInfo() {
		if (numOfFriends==0) {
			System.out.println("저장된 데이터가 없습니다.");
		}
		System.out.println("찾는 사람의 이름을 입력하세요 ");
		String name=sc.nextLine();
		int index=searchIndex(name);
		
		if(index<0) {
			System.out.println("찾으시는 사람의 정보가 존재하지 않습니다.");
		}else {
			ar1.get(index).showData();
		}
		
	}
	
	// 전체 정보를 출력하는 메서드 : showData()

	public void showAllData() {
		if (numOfFriends==0) {
			System.out.println("저장된 데이터가 없습니다.");
		}
		System.out.println("전체 데이터를 출력합니다.");
		for (int i = 0; i < numOfFriends; i++) {
			ar1.get(i).showData(); // friend[0] > friend 타입의 참조변수 - 하위클래스의 인스턴스들을 참조
			System.out.println("------------------------");
		}

	}

	
	
	// 전체 기본 정보를 출력하는 메서드 : showBasicInfor()

	public void showAllSimpleData() {
		if (numOfFriends==0) {
			System.out.println("저장된 데이터가 없습니다.");
		}
		System.out.println("전체 기본 정보를 출력합니다.");
		for (int i = 0; i < numOfFriends; i++) {
			ar1.get(i).showBasicInfo();
			System.out.println("------------------------");

		}
	}


}
