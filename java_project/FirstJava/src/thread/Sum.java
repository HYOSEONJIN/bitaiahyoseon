
package thread;

public class Sum {
	
	int num;
	
	Sum(){
		num=0;
	}
	
	// 동기화~!
	synchronized void addNum(int n) {
		num+=n;
	}
	
	int getNum() {
		return num;
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

}
