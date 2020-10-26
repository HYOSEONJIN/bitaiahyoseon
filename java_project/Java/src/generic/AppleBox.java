package generic;

public class AppleBox {
	
	Apple apple;
	
	public void store(Apple apple) {
		this.apple=apple;
	}
	
	public Apple PullOut() {
		return apple;
	}
}
