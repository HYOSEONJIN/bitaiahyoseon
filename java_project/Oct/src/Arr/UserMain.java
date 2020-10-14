package Arr;

public class UserMain {

	public static void main(String[] args) {
		
		
		// 여러명의 사용자(User)를 생성해서  처리

//		User u1 = new User(1, "김태형");
//		User u2 = new User(1, "민윤기");
//		User u3 = new User(1, "박지민");
//
		
		// 10명의 사용자를 저장할 수 있는 배열을 만들자.
		// 배열은 여러개의 변수를 만드는 것
		// User user; // 참조변수 : 객체의 주소값 저장
		
		User[] users = new User[10]; 
		// User 타입의 참조변수 10개를 만들고 묶음으로 관리.
		
		users[0]= new User(1, "김석진"); // 참조변수 users[0] 참조값을 저장한다.
		users[1]= new User(2, "민윤기");
		users[2]= new User(3, "김남준");
		users[3]= new User(4, "정호석");
		users[4]= new User(5, "박지민");
		users[5]= new User(6, "김태형");
		users[6]= new User(7, "전정국");
		users[7]= new User(8, "BTS");
		users[8]= new User(9, "Army");;
		users[9]= new User(10, "방탄짱");;
		
		
		for(int i=0;i<users.length;i++){
			users[i].showData();
		}
		
		
		
		
		
		
		
	}

}
