package FirstJava;

import java.text.SimpleDateFormat;

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Date today= new java.util.Date();
		
		System.out.println(today);
		SimpleDateFormat date=null;
		
		// yyyy > 년도	MM(대문자) > 월	dd > 일
		// hh > 시긴		mm(소문자) > 분	ss > 초
		// a > 오전/오후
		
		
		//2020.10.14. 10:56
		date=new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss ");
		String now= date.format(today);
		System.out.println(now);
	}

}
