package exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class test {
	   // 파일 저장 메서드
	ArrayList<Integer> loginInfo = new ArrayList<Integer>();
	
	   void saveLogin() throws FileNotFoundException, IOException, ClassNotFoundException {
	      // 인스턴스 저장을 위한 스트림 생성
	      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("LoginInfo.ser"));   
	      out.writeObject(loginInfo);
	      out.close();
	      // 인스턴스 복원을 위한 스트림 생성
	   }
	   
	    void callLogin() throws IOException{
	      ObjectInputStream in = new ObjectInputStream(new FileInputStream("LoginInfo.ser"));
	      // 복원
	      LoginInfo reInfo = (LoginInfo) in.readObject();
	   }

	    private void addInfo(LoginInfo info) {      
	      loginInfo.add(info);
	      // 외부 파일에 저장 (추가(
	      saveLogin(); 
	   }
	   
}
