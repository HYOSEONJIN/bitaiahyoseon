package thread;

// 쓰레드 클래스 정의할 때 상속이 필요한 경우 Runnable 인터페이스를 구현해서 스레드를 생성할 수 있다.
public class ShowRunnable implements Runnable {

	
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("러너블스레드");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
		System.out.println("★끝★");
	}

}
