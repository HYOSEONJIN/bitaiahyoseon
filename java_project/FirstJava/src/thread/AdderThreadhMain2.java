package thread;

public class AdderThreadhMain2 {

	public static void main(String[] args) {

		Sum sum = new Sum();
		AdderThread1 t1 = new AdderThread1(sum, 1, 5000);
		AdderThread1 t2 = new AdderThread1(sum, 5001, 10000);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1-100합 "+ sum.getNum());
	}

}
