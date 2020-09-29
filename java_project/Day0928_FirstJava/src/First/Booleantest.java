package First;

import java.util.Scanner;

public class Booleantest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		boolean b;
		boolean d;
		int a;
		
		System.out.println("1or0");
		 b=(sc.nextInt()==1); // 1이면 true 0이면 false
		 System.out.println(b);
		
		 System.out.println("숫자입력");
		 a=sc.nextInt();
		 		 
		 
		 d=(b&&a>100); // 맞으면 true
		 
		 System.out.println(d);
		 
		 
	}

}
