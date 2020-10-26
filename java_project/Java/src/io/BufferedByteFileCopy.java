package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedByteFileCopy {

	public static void main(String[] args) throws IOException  {

		
		// 읽어올 대상 파일의 InputStream 인스턴스를 생성한다.

			InputStream in = new FileInputStream("org.pdf");
			
		// 출력 대상 파일의 OutpurStream 인스턴스 생성
			
			OutputStream out = new FileOutputStream("org_copy.pdf");

		int copyByte=0; // 복사한 사이즈
		
		byte[] buf = new byte[1024]; // 1kb 버퍼생성
		int readLength = 0; // 얼마만큼 읽어왔는지.
		
		System.out.println("복사를 시작합니다.");
		
		while(true) {

			readLength = in.read(buf);
			
			if(readLength==-1) { 
				break;
			}

			out.write(buf,0,readLength);
			copyByte+= readLength;
		}
		
		in.close(); // 스트림 인스턴스 소멸
		out.close(); 
		System.out.println("복사가 완료되었습니다.");
		System.out.println("복사된 사이즈 : " + copyByte + "byte");
}
}
