package FirstJava;

public class ExceptionCase {
	
	public static void main(String[] args) {
		
	
	try {
	int[] arr= new int[3]; //
	arr[10]=20;
	} catch(ArrayIndexOutOfBoundsException a) {
		System.out.println(a.getMessage());
		
	}
}
	
}