package thread;

public class threadMain2 {

	public static void main(String[] args) {

				
		// Runnable 인터페이스를 이용한 스레드
		Runnable target = new ShowRunnable();
		Thread st3 = new Thread(target);
		
		st3.start();
		
	
		
		for(int i=0; i<100; i++) {
			System.out.println("메인스레드");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
		System.out.println("★끝★");
	}

}
