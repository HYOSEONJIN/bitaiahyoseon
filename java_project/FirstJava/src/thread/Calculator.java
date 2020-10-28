package thread;

public class Calculator {

	int opplCnt=0; // 몇번의 연산을 했나요?
	int opmiCnt=0;
	
	
	public int add(int n1, int n2) {
		synchronized (this) { // key
			opplCnt++;			
		}
//		opCnt++;	
		return n1+n2;
	}
	
	
	public int min(int n1, int n2) {
		synchronized (obj) { // 참조값이 달라서 다르다.
			opmiCnt++;
		}
//		opCnt++;
		return n1-n2;
	}
	
	Object obj = new Object(); // 새로운 동기화 키 생성
}
