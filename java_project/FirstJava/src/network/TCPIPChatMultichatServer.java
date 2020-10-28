package network;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TCPIPChatMultichatServer {

	// 접속 사용자 정보를 저장 : 메세지를 전체에게 보내기 위해서
	// 저장정보 : name, OutputStream
	// Map<String, Object>로 저장
	HashMap<String, Object> clients;

	public TCPIPChatMultichatServer() {
		clients = new HashMap<String, Object>();
		Collections.synchronizedMap(clients); // 스레드 동기화에 안전한 상태로 해주는메서드
	}

	public void start() throws IOException {

		// Server Socket 생성
		// 사용자의 요청이 있으면 Socket 생성해서 연결 > Clients 사용자 정보를 저장
		// 연결 > Clients 사용자 정보를 저장 스레드로 처리

		ServerSocket serverSocket = new ServerSocket(7777);
		System.out.println("Chatting Server Start!");

		Socket socket = null;
		
		while(true) {
		// 요청이 들어올 때까지 대기 하다가 요청이 들어오면 새로운 소켓을 생성해서 반환
		socket = serverSocket.accept();
		// map에 정보저장, 접속한 사람들에게 메세지를 전송
		
		System.out.println("["+socket.getInetAddress()+socket.getPort()+"] 사용자 접속");
		
		ServerReceiver receiver = new ServerReceiver(socket);
		receiver.start();
			
		}

	}

	void SendToAll(String msg) {
		// 일괄처리 - Map은 순서가 없다 - Map이 가지고 있는 key를 Set으로 만든다.
		Set<String> keys = clients.keySet();
		Iterator<String> itr = keys.iterator();

		while (itr.hasNext()) {
			DataOutputStream out = (DataOutputStream) clients.get(itr.next()); // 키값가져오기
			try {
				out.writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	// 내부클래스 : 데이터 받아서 저장, 메시지 전체 발송
	private class ServerReceiver extends Thread {
		// Socket, InputStream, OutputStream
		Socket socket;
		DataOutputStream out;
		DataInputStream in;

		public ServerReceiver(Socket socket) {
			this.socket = socket;

			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		@Override
		public void run() {
		 String name=null; // 접속한 사용자 이름
		 try {
			name= in.readUTF();		// 이름을 스트림을 통해 받는다
			clients.put(name, out); // map에 사용자 정보 저장
			SendToAll(">>>>>>>>>> " +name+"님이 접속하셨습니다.");// 내부클래스에서는 외부 클래스의 멤버를 참조할 수 있다.
			
			while(in !=null ) {
				SendToAll(in.readUTF());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			clients.remove(name);
			System.out.println(name+"님이 나가셨습니다.");
			
		}
		}

	}

	public static void main(String[] args) throws IOException {
		new TCPIPChatMultichatServer().start();

	}
}
