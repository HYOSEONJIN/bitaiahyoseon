package generic;

public class FruitBoxMain2 {

	public static void main(String[] args) {

		
		FruitBox2 box1 = new FruitBox2();
		box1.store(new Apple(100));
		Apple apple = (Apple)box1.PullOut();
		apple.showWeight();
		
		FruitBox2 box2 = new FruitBox2();
		box2.store("Apple"); // Apple 타입만 들어가야 한다. (아무거나 들어가도 ㅇㅋ인게 문제점..)
		Orange orange = (Orange)box2.PullOut();//형변환
		orange.showsugarContent();
		
	}

}
