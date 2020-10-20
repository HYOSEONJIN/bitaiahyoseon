package Ver03;

public class PhoneBookManager {

		// 배열 : 전화번호 정보 (이름, 전화번호, 생일)를 저장하는 목적
		
		final PhoneInfor[] phoneBook; // 정보 저장을 위한 배열 선언
		int cnt; // 저장된 정보의 개수: 반복의 횟수, 배열의 새로운 데이터 입력시 index로도 사용가능.
		
		// Scanner sc;
		
		
		// 초기화
		PhoneBookManager(){
			// phoneBook = new PhoneInfor[100];
			this(100);
		}
		
		PhoneBookManager(int size) {
			phoneBook = new PhoneInfor[size];
			// sc=new Scanner(System.in);
		}
		
		
		// 기능 : 저장, 검색, 삭제
		
		
		// 저장 기능
		// 사용자로부터 데이터를 받아서 > 인스턴스 생성 > 배열에 생성된 인스턴스 참조값을 저장
		// 배열에 생성된 인스턴스의 참조값을 저장 > 저장 index는 cnt를 이용한다. 저장후에는 cnt++;

		void insertMember() {
			
			System.out.println("★친구 정보 입력을 시작합니다~★");
			
			
			// 이름 입력받기			
			System.out.println("이름을 입력해주세요  : ");
			String name=Util.sc.nextLine();	
			
			// 전화번호 입력받기			
			System.out.println("전화번호를 입력해주세요  : ");
			String pNum=Util.sc.nextLine();		
			
			// 생일 입력받기			
			System.out.println("생년월일을 입력해주세요  : ");
			String birthday=Util.sc.nextLine().trim(); // 공백생략
			
			// 배열에 저장하기 위한 인스턴스의 참조변수
			PhoneInfor infor=null;
			
			
			// 생일이 입력되었는지 여부에 따라 인스턴스 생성을 다르게 처리
			if(birthday!=null && birthday.length()>0) {
				infor = new PhoneInfor(name, pNum, birthday);				
			}else {
				infor = new PhoneInfor(name, pNum);
			}
			
			phoneBook[cnt++]=infor;  // phonebook[0] = 0xlll
			
		}
	


		// 정보 검색
		// 검색하고자 하는 이름을 받고
		// 배열의 요소 (참조값 > 인스턴스 참조)

		void searchMember() {
			
			if(cnt==0) {
				System.out.println("저장된 데이터가 없습니다. 다시 메뉴로 이동합니다.");
				return; // 메서드의 종료
			}
			
			// 찾고자하는 이름을 받는다.
			System.out.println("정보 검색을 시작합니다.");
			System.out.println("찾고자하는 이름을 입력해주세요. ");
			String name=Util.sc.nextLine();
			
			// 이름으로 요소 index 검색을 시작!
			int index= searchIndex(name);
			
			
			/*
			  
			 int index = -1;
			 
			
			// 검색 : index를 찾는다.
			for (int i=0 ; i<=cnt ; i++) {
				if(phoneBook[i].name.equals(name)) {
					index=i;
					break;
				}
			}
			*/
			
			
			if(index<0) {
				System.out.println("찾으시는 이름의 정보가 존재하지 않습니다");
			}else {
				//정보출력
				phoneBook[index].showInfor();
			}
			
		}

		
		// 이름 문자열을 받아서, 배열의 정보와 비교하고  index를 찾아서 반환하는 메서드
		
		int searchIndex(String name) {
			int result=-1;
			
			
			// 검색
			// 검색 : index를 찾는다.
			for (int i=0 ; i<=cnt ; i++) {
				if(phoneBook[i].name.equals(name)) {
					result=i;
					break;
				}
			}
	
			
			return result;
		}
		
		// 정보 삭제
		// 삭제하고자 하는 이름을 사용자로부터 받는다
		// 배열에서 이름으로 검색해서 index를 찾는다.
		// 배열에서 찾은 index의 참조값을 삭제 : 인스턴스는 참조하는 참조변수가 없으면 삭제된다.
		// 참조값에 null을 입력하거나, 다른 주소값을 입력 > 이전값은 사라진다.
		// 삭제 대상의 index부터 왼쪽으로 값을 시프트 처리
		// cnt-1
		
		void deleteMember() {
			
			
			System.out.println("정보 삭제를 진행합니다.");
			System.out.println("삭제하고자 하는 정보의 이름을 입력하세요. ");
			String name=Util.sc.nextLine();
			// 이름으로 요소 index 검색을 시작!
			int index = -1;
			index=searchIndex(name);
			/*
			// 검색 : index를 찾는다.
			for (int i=0 ; i<=cnt ; i++) {
				if(phoneBook[i].name.equals(name)) {
					index=i;
					break;
				}
			}
			
			*/
			if(index<0) {
				System.out.println("삭제하고자 하는 정보가 존재하지 않습니다.");
			} else {
				// 삭제처리 : 삭제해야하는 index 부터 시프트처리
				for(int i=index;i<cnt-1;i++) {
					phoneBook[i]=phoneBook[i+1];
				}
				cnt--;
				System.out.println("삭제되었습니다.");
			}
		}

		
		// 전체 정보 출력
		
		void displayAll() {
			
			if(cnt==0) {
				System.out.println("등록된 정보가 없습니다.");
				return;
			}
			
			
			System.out.println("★전체 정보를 출력합니다★(" + cnt + ")");
			
			System.out.println("------------------");
			for (int i=0; i<cnt ;i++) {
				phoneBook[i].showInfor();
				System.out.println("------------------");
			}
			
		}
		
}
		


	
