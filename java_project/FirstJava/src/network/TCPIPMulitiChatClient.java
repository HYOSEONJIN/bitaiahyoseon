package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import thread.threadMain;

public class TCPIPMulitiChatClient {

	public static void main(String[] args) {
	
		String serverIp = "192.168.0.32"; // localhost > 호스트자신의 주소
		
		//Socket연결
		try {
			Socket socket = new Socket(serverIp, 7777);
			
			// 메세지를 받는 스레드
			Thread receiver = new ClientReceiver(socket);
			
			// 메세지를 보내는 스레드
			Thread sender = new ClientSenderThread(socket, "포그바");
			
			sender.start();
			receiver.start();
			
		} catch (UnknownHostException e) {
	
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}
		
	}

}

class ClientSenderThread extends Thread{
	
	
	// 보내기 스레드는 Socket, OutputStream, name도 필요하다.
	
	Socket socket;
	DataOutputStream out;
	String name;
	
	public ClientSenderThread(Socket s, String name) {
		this.socket = s;
		
		try {
			out = new DataOutputStream(s.getOutputStream());
			this.name = name;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		 Scanner sc = new Scanner(System.in);
		 
			try {
				// 접속하면 이름을 서버에 전송 
				if(out != null) {
				out.writeUTF(name);
				}
				
				while(out!=null) {
					out.writeUTF("["+name+"]"+sc.nextLine());
					
			}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

class ClientReceiver extends Thread {
	// 메세지를 받아서 콘솔에 출력
	// Socket, InputStream, 필요
	
	Socket socket;
	DataInputStream in;
	
	public ClientReceiver(Socket socket) {
		this.socket = socket;
	
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while (in != null){
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {

			}
		}
	}
	
	
}
