package OCt13;

public class memojang1013 {

	public static void main(String[] args) {

		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int[] arr1 = {7,8,9,10,11};
		int[] arr2 = new int[6];

		System.arraycopy(original, 0, arr1, 0, arr1.length);
		System.arraycopy(original, arr1.length, arr2, 0, arr2.length);

		for (int i : arr1) {
			System.out.print(i + ", ");
		}

		System.out.println();
		System.out.println("====================");

		for (int i : arr2) {
			System.out.print(i + ", ");
		}

		
//		result
		
//		1, 2, 3, 4, 5, 
//		====================
//		6, 7, 8, 9, 10, 11, 
		
		
	}
}
