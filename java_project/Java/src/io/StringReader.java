package io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;

public class StringReader {

	public static void main(String[] args) throws IOException{
		
	
	// 문자 기반 기본 스트림 인스턴스 생성
	Reader reader = new FileReader("String.txt");
	// 필터스트림
	BufferedReader in = new BufferedReader(reader);
	
	// 한행의 문자열을 담을 변수
	
	String str=null;
	while(true) {
		//한줄씩 읽어 문자열을 반환, 없으면 null
		str=in.readLine();
		if(str==null) {
		break;
	}
		System.out.println(str);
	
	}
}
}
