package thread;

import javax.swing.JOptionPane;

public class ThreadTestMain1 {

	// 다른 스레드에서도 참조가 가능한 클래스 변수 
	public static boolean check = false; // 10초 지나면 꺼지게하려고 만듦 (안에서사용하려고)
	
	public static void main(String[] args) {

//		String age= JOptionPane.showInputDialog("나이를 입력해주세요");		
//		int ageNumber=Integer.parseInt(age);		
//		System.out.println("저의 나이는 " + age + "세 입니다.");		
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}                       // 나이쓰는 창뜨고 > 숫자셈
		
		InputAgeThread iat= new InputAgeThread();
		CountDownThread cdt=new CountDownThread();
		
		iat.start();
		cdt.start();
	}

}

class InputAgeThread extends Thread{

	@Override
	public void run() {
		System.out.println("10초 안에 입력하세요.");
		String age= JOptionPane.showInputDialog("나이를 입력해주세요");
		System.out.println("저의 나이는 " + age + "세 입니다.");
		ThreadTestMain1.check=true;
		
	}
	

	

}

class CountDownThread extends Thread {

	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			if(ThreadTestMain1.check) {
				break;                    // 입력되면 숫자세기 STOP
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.exit(0);
	}
	
	
}