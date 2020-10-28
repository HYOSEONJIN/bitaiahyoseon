package thread;

public class threadMain {

	public static void main(String[] args) {

		// Thread 생성

		showThread st1 = new showThread("1번 스레드");
		showThread st2 = new showThread("2번 스레드");

		// Runnable 인터페이스를 이용한 스레드
		Runnable target = new ShowRunnable();
		Thread st3 = new Thread(target);

		// 우선순위 설정 1-10 : 기본5
		st1.setPriority(Thread.MAX_PRIORITY);
		st2.setPriority(Thread.MIN_PRIORITY);

		st1.start();
		st2.start();

	}
}
