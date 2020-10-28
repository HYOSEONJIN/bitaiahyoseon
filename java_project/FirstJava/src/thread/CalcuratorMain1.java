package thread;


public class CalcuratorMain1 {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		AddThread at = new AddThread(cal);		
		MinThread mt = new MinThread(cal);
		
		at.start();
		mt.start();
		
		try {
			mt.join();
			at.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("연산의 횟수 : " +  cal.opplCnt);
		System.out.println("연산의 횟수 : " +  cal.opmiCnt);
		
	}

}

class AddThread extends Thread {
	Calculator cal;
	
	AddThread(Calculator c){
		cal=c;
	}
	
	public void run() {
		System.out.println("1+2 = " + cal.add(1,2));
		System.out.println("2+3 = " + cal.add(2,3));		
	}
}
	
class MinThread extends Thread{
	Calculator cal;

	public MinThread(Calculator c) {
		this.cal = c;
	}
	
	public void run() {
		System.out.println("2-1 = " + cal.min(2,1));
		System.out.println("4-2 = " + cal.min(4,2));		
	}
	
	
	
}
	
