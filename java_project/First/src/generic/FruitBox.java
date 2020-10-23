package generic;

public class FruitBox<T> { // T > Apple / Orange
	
	T fruit; // Apple fruit
	
	FruitBox(T fruit){   // FruitBox(Apple fruit){
		this.fruit=fruit;
		
	}
	
	public void store(T fruit) { // store(Apple fruit)
		this.fruit=fruit;
	}
	
	public T PullOut() { // public Apple PullOut()
		return fruit;
	}

}
