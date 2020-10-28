package network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class memojang {

	public static void main(String[] args) {
		
		try {
			URL java = new URL("https://javappo.tistory.com/");
			URLConnection uc=java.openConnection();
			//url에 대한 새로운 URLConnection 객체/인스턴스를 생성한다.			
		} catch (MalformedURLException e) { // new URL() 실패
			e.printStackTrace();
		} catch (IOException e) {    // openConnection() 실패
			e.printStackTrace();
		}

}

}