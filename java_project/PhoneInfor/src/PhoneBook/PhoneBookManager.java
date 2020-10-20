package PhoneBook;
import java.util.Scanner;

public class PhoneBookManager {
	
	Scanner sc=new Scanner(System.in);
	
	PhoneInfo[] phoneBook;
	int cnt;
	
	// 초기화
	public PhoneBookManager(int num) {
		phoneBook=new PhoneInfo[num];
		cnt=0;
	}
	
	
	//저장
	void addPhoneInfo(PhoneInfo pb) {
		phoneBook[cnt]=pb;
		cnt++;
	}
	
	// 입력받기	
	void insertInfo() {
		System.out.println("친구 정보의 입력을 시작합니다.");
		System.out.println("이름을 입력해주세요 >>");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요 >>");
		String pNum = sc.nextLine();
		System.out.println("생년월일을 입력해주세요 >>");
		String birthday  = sc.nextLine();
		
		if(birthday!=null && birthday.length()>0) {
			addPhoneInfo(new BirthInfo(name, pNum, birthday));				
		}else {
			addPhoneInfo(new PhoneInfo(name, pNum));
		}
	}

	
	// 정보출력
	
	public void showAllData() {
		System.out.println("정보를 출력합니다.");
			for(int i=0; i<cnt ;i++) {
				phoneBook[i].showData();
				System.out.println("------------------------");
			}
	}
	
	// 인덱스 써치 메서드
	
	int searchIndex(String name) {
		int result=-1;
		
		for (int i=0; i<cnt; i++) {
			if(phoneBook[i].getName().equals(name)) {
				result=i;
				break;
			}
		}
		return result;
	}
	
	
	// 삭제 메서드
	
	void deleteInfo() {
		if (cnt==0) {
			System.out.println("저장된 데이터가 없습니다.");
		}
		System.out.println("정보를 삭제하고자하는 사람의 이름을 입력하세요 ");
		String name=sc.nextLine();
		int index=searchIndex(name);
		
		if(index<0) {
			System.out.println("삭제하고자 하는 정보가 존재하지 않습니다.");
		} else {
			//삭제
			for(int i=index;i<cnt-1;i++) {
				phoneBook[i]=phoneBook[i+1];
			}
			cnt--;
			System.out.println("삭제되었습니다.");
		}
	}
	
	// 검색 메서드
	
	void searchInfo() {
		if (cnt==0) {
			System.out.println("저장된 데이터가 없습니다.");
		}
		System.out.println("찾는 사람의 이름을 입력하세요 ");
		String name=sc.nextLine();
		int index=searchIndex(name);
		
		if(index<0) {
			System.out.println("찾으시는 사람의 정보가 존재하지 않습니다.");
		}else {
			phoneBook[index].showData();
		}
		
	}
}
