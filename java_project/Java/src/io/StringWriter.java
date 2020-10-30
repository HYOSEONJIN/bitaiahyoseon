package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {

	public static void main(String[] args) throws IOException {

		int a= -100;
		
		String point= ""+a;
		
		System.out.println(point);
		
//		// 필터스트림 : 기본 스트림 writer가 필요하다.
//		Writer writer = new FileWriter("String.txt");  // 기본스트림
//		BufferedWriter out = new BufferedWriter(writer); // 필터스트림
//		
//		out.write("Cos ah ah I’m in the stars tonight");
//		out.newLine();
//		out.write("So watch me bring the fire and set the night alightv");
//		out.newLine();
//		out.write("Shining through the city with a little funk and soul");
//		out.newLine();
//		out.write("So I’mma light it up like dynamite, woah");
//		out.newLine();
//		out.newLine();
//		out.write("BTS - Dynamite");
//		
//		// 스트림닫기
//		out.close();
//		
	}

}
