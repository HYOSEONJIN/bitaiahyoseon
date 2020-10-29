package Oct17;

import java.util.InputMismatchException;
import java.util.Scanner;

import FirstJava.AgeInputException;

public class test {

	public static void main(String[] args)  {
		
	int a=1;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자입력");
	
	try {
		a = sc.nextInt();
		if (a<=0) {
			Exception e = Exception("강제예외");
			throw e;
		}
	} catch(Exception e) {
		System.out.println("잘못된 입력");
		System.out.println(a);
		return;
	}
	
		
	System.out.println("빵");

	
	
}

	private static Exception Exception(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	}
