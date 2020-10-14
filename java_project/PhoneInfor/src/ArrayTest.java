
public class ArrayTest {

	public static void main(String[] args) {
		
	
		int[] arr= {1,2,3,4,5}; // 원본데이터 주소값 : 0x100
		int[] ref; 
		ref=addAllArray(arr,7); // addAllArray(0x100, 7)
		if(arr==ref) {
			System.out.println("같은 배열 참조");
		}else {
			System.out.println("다른 배열 참조");
		}
		
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		System.out.println("------------------------");
		for (int i=0; i<ref.length;i++) {
			System.out.print(ref[i] + ", ");
		}
		
		
		
		
		// int 타입의 배열을 받고, 증가시킬 정수값을 받아서
		// 각 배열의 요소에 받은 정수값 만큼 증가시키고
		// 전달 받은 배열을 반환
	}
	
		 static int[] addAllArray(int[]ar, int addValue) {
			 // int[]ar=0x100 , int addValue=7
				 for (int i=0; i<ar.length; i++) {
					 ar[i]=ar[i]+addValue;
				 }
			return ar;				
		 } 
}


