package generic;

public class FruitBoxMain3 {

	public static void main(String[] args) {

		
		FruitBox<Apple> box1 = new FruitBox<Apple>(new Apple(10));
		box1.store(new Apple(10));
		Apple apple = box1.PullOut();
		apple.showWeight();
		
		FruitBox<Orange> box2 = new FruitBox<Orange>(new Orange(100));
		Orange orange = box2.PullOut(); //형변환도필요없다.
		orange.showsugarContent();
		
	}

}
