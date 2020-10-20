package myself;

//import java.util.Scanner;

public class PhoneInfor {

	String name;
	String phoneNumber;
	String birthday;
	int count = 0;
	int max = 100;

	PhoneInfor[] pi = new PhoneInfor[max];
//	Scanner sc = new Scanner(System.in);

	
	public PhoneInfor() {

	}

	// 이름, 번호 입력
	public PhoneInfor(String n, String p) {
		this.name = n;
		this.phoneNumber = p;
		this.birthday = null;

	}

	// 이름, 번호, 생일 입력
	public PhoneInfor(String n, String p, String b) {
		this.name = n;
		this.phoneNumber = p;
		this.birthday = b;
	}

	// 입력받는 메서드
	public void setData() {

		// 배열이 다찼는지 확인하기

		if (count == 100) {
			System.out.println("전화번호부가 다 찼어요!");
			return; // 다찼으면 종료
		}

		for (int i = count; i < max; i++) {
			System.out.println("이름을 입력하세요");
			String n = Util.sc.nextLine();
			System.out.println("전화번호를 입력하세요");
			String p = Util.sc.nextLine();
			System.out.println("생년월일 입력하세요");
			String b = Util.sc.nextLine();

			count++;

			if (b.trim().isEmpty()) {
				pi[i] = new PhoneInfor(n, p);
			} else {
				pi[i] = new PhoneInfor(n, p, b);
			}
			System.out.println("추가 입력 (YES=1/NO=2)");
			int a = Util.sc.nextInt();
			Util.sc.nextLine();
			if (a == 2) {
				break;
			} else if (a == 1) {

			} else {
				System.out.println("잘못입력하셨습니다.ERROR");
				continue;
			}
		}

	}

	// 삭제 메서드 수정 
	public void deleteData() {
		
		if(count==0) {
			System.out.println("저장된 데이터가 없는 상태입니다.");
			return;
		}
		
		System.out.println("삭제할 사람의 이름을 입력하세요");
		String name = Util.sc.next();
		int exist = search(name);

		if (exist < 0) {
			System.out.println("존재하지 않습니다.");

		}else {
            for (int i = exist; i < count; i++) {
               	pi[i] = pi[i + 1];
                }
 
                System.out.println("삭제했습니다");
                count--;
                }
	}
		
	// 이름으로 count를 찾는 메서드추가
	int search(String name) {
		int result = -1;

		for (int i = 0; i < count; i++) {
			if (pi[i].name.equals(name)) {
				result = i;
				break;
			}
		}

		return result;
	}

	// 검색 기능 추가
	public void searchInfo() {
		
		if(count==0) {
			System.out.println("저장된 데이터가 없는 상태입니다.");
			return;
		}
		
		System.out.println("검색할 사람의 이름을 입력하세요");
		String name = Util.sc.next();
		int exist = search(name);

		
		
		if (exist < 0) {
			System.out.println("존재하지 않습니다.");

		}else {
			System.out.println("no.\t이름\t전화번호\t\t생년월일");
			System.out.print((exist + 1));
			pi[exist].print();
          }
	}

	// 프린트 
	public void print() {
		if (birthday == null) {
			System.out.println("\t" + name + "\t" + phoneNumber);
		} else {
			System.out.println("\t" + name + "\t" + phoneNumber + "\t" + birthday);
		}
	}

	// 전체 출력 메서드
	public void showData() {
		
		if(count==0) {
			System.out.println("저장된 데이터가 없는 상태입니다.");
			return;
		}
		
		
		System.out.println("no.\t이름\t전화번호\t\t생년월일");
		for (int i = 0; i < count; i++) {
			System.out.print((i + 1));
			pi[i].print();
		}
	}

}
