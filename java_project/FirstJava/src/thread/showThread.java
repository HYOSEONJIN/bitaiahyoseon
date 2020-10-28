package thread;

// 쓰레드 클래스의 정의는 thread클래스를 상속해서 정의
public class showThread extends Thread {

	String threadName;
	
	public showThread(String name) {
		this.threadName=name;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<100; i++) {
			System.out.println("안녕하세요" + threadName + "입니다.");
			try {
				// object클래스의 sleep() 메서드 : 현재 스레드를 1/1000초 간격으로 멈춤
				sleep(100);// 100/1000초 > 1/10초 

			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		} System.out.println(threadName + " 종료 ★");
	}

}
