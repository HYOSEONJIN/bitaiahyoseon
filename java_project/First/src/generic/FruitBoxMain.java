package generic;

public class FruitBoxMain {

	public static void main(String[] args) {

		AppleBox appleBox = new AppleBox();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.PullOut();
		
		apple.showWeight();
		
		OrangeBox orangeBox = new OrangeBox();
		orangeBox.store(new Orange(100));
		Orange orange = orangeBox.PullOut();
		
		orange.showsugarContent();
	}

}
