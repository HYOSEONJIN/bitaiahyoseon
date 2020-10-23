package generic;

public class FruitBox2 {
	
	Object fruit;
	
	public void store(Object fruit) {
		this.fruit=fruit;
	}
	
	public Object PullOut() {
		return fruit;
	}

}
