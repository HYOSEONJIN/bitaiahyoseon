package card;

public class Number {

	int num;
	
	Number(int number){ // 초기화! 생성자! 이름이같아야한다 (public class랑)
		num=number;
		System.out.println("생성자가 실행되었습니다");
	}
	
	int getNumber() {
		return num;
	}

}
