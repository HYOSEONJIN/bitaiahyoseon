import java.util.Scanner;

public class memojang {

	public static int[] addAllArray(int[] ar, int addVal){
		for(int i=0; i<ar.length; i++)
		ar[i]+=addVal;
		return ar;
		}
	
	
		public static void main(String[] args) {
		int[] arr={1, 2, 3, 4, 5};
		
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + ", ");
		}
		
		
		int[] ref;
		ref=addAllArray(arr, 7);
		
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		System.out.println("------------------------");
		for (int i=0; i<ref.length;i++) {
			System.out.print(ref[i] + ", ");
		}
		
		if(arr==ref)
		System.out.println("동일 배열 참조");
		else
		System.out.println("다른 배열 참조");
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		System.out.println("------------------------");
		for (int i=0; i<ref.length;i++) {
			System.out.print(ref[i] + ", ");
		}
		
		}
		}
