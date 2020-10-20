package Oct15;

public class CarMain {

	public static void main(String[] args) {
		
		//클래스멤버도 상속의 대상이다. 클래스 멤버는 한번만 생성/ 자손클래스의 이름으로도 참조, 호출이가능하다.
		System.out.println(Car.name);
		System.out.println(HybridCar.name);
		
		Car car1 = new Car(100);
		HybridCar car2 = new HybridCar(100,50);
		HybridWaterCar car3 = new HybridWaterCar(100,50,20);

		car3.showCurrentGauge();
	}

}

class Car {
	static String name="뽀카";
	int gasolinegauge;
	// car(){}
	
	Car(){
		
	}
	Car(int gasolinegauge){
		this.gasolinegauge=gasolinegauge;
	}
}

class HybridCar extends Car {

	int electronicGauge;
	/*
	  HybridCar(){
	   super();
	    }
	 */                              // 상위클래스 생성자에 필요한 것을 넣어줘야함
	
	HybridCar(int gasolinegauge, int electronicGauge){
		// 조상 클래스의 멤버를 초기화하는 생성자 호출
		// super(gasolinegauge);  // 조상클래스super는 꼭 첫줄에!
		super();
		// 새롭게 정의한 Hybrid 클래스의 멤버를 초기화해줌
		this.electronicGauge=electronicGauge;
		
	}

	
}

class HybridWaterCar extends HybridCar {
	/*
	  
	  HybridWaterCar()
	  { super(); 
	  }
	 
	 */
	HybridWaterCar(int gasolinegauge, int electronicGauge, int watergauge){
		super(gasolinegauge, electronicGauge);
		this.waterGauge=watergauge;
	}
	
	
	int waterGauge;

	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasolinegauge);
		System.out.println("잔여 전기 : " + electronicGauge);
		System.out.println("잔여 water : " + waterGauge);
	}
}