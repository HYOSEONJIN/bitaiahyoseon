package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import guestbook.dao.MessageDao;
import guestbook.model.Message;
import guestbook.model.MessageListView;
import jdbc.ConnectionProvider;

public class GetMessageListService {
	
	
	final int messageCountPerPage = 3;

	// 싱글톤 패턴 적용
	private GetMessageListService() {}
	private static GetMessageListService service = new GetMessageListService();
	public static GetMessageListService getInstance() {
		return service;
	}
	
	
	// MessageListView 객체를 반환하는 메소드
	// 페이지 번호를 받아서 해당 페이지를 출력할 데이터를 만들어야 한다.
	
	public MessageListView getMessageList(int pageNumber) {
		
		
		
		MessageListView listView =null;
		
		// MessageListView가 가지는 변수의 데이터들을  MessageDao를 이용해서 생성
		Connection conn = null;
		MessageDao dao = null;
		
		
		try {			
			conn = ConnectionProvider.getConnection();
			dao = MessageDao.getInstance();
			
			// 게시물의 전체 개수 > 페이지 개수 구하기
			int totalMessageCount = dao.selectAllcount(conn);
			// 현재 페이지의 메시지 리스트 구하기
			List<Message> messageList = null;
			int firstrow = 0;
			int endrow = 0;
			
			firstrow = (pageNumber-1)*messageCountPerPage;
			endrow = firstrow+messageCountPerPage-1;
			
			messageList = dao.selectList(conn, firstrow, messageCountPerPage);
			
			
			listView = new MessageListView(totalMessageCount, pageNumber, messageList, messageCountPerPage, firstrow, endrow);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listView;
		
	}
	
	
}
