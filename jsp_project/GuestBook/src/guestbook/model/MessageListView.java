package guestbook.model;

import java.util.List;

public class MessageListView {
	
	private int messageTotalcount; // 게시물의 전체 갯수 : 페이지 갯수
	private int currentPageNumber; // 현재 페이지 번호 : List<message> 구하기 위해
	private List<Message> MessgeList; // 페이지 번호에 맞는 게시물의 리스트 3개씩
	private int pageTotalCount; // 페이지의 갯수
	private int messageCountPerpage; // 한 페이지에 출력할 메시지의 수
	private int firstRow; // 시작 : DB에서 테이블의 시작 행
	private int endRow; // 얘는 오라클에서만 필요
	
	public MessageListView(int messageTotalcount,
							int currentPageNumber,
							List<Message> messgeList,
							int messageCountPerpage,
							int firstRow,
							int endRow) {
		this.messageTotalcount = messageTotalcount;
		this.currentPageNumber = currentPageNumber;
		MessgeList = messgeList;
		this.messageCountPerpage = messageCountPerpage;
		this.firstRow = firstRow;
		this.endRow = endRow;
		calculatePageTotalCount();
	}
	
	
	// 페이지  갯수 구하는 메서드
	private void calculatePageTotalCount(){
		if(messageTotalcount==0) {
			pageTotalCount=0;
		}else {
			pageTotalCount = messageTotalcount/messageCountPerpage;
			if(messageTotalcount%messageCountPerpage!=0) {
				pageTotalCount++;
			}
		}
	}

	
	public boolean isEmpty() {
		return messageTotalcount==0;
	}
	
	
	
	// DB에서 정보를 가져올 것이므로 getter만 생성
	public int getMessageTotalcount() {
		return messageTotalcount;
	}


	public int getCurrentPageNumber() {
		return currentPageNumber;
	}


	public List<Message> getMessgeList() {
		return MessgeList;
	}


	public int getPageTotalCount() {
		return pageTotalCount;
	}


	public int getMessageCountPerpage() {
		return messageCountPerpage;
	}


	public int getFirstRow() {
		return firstRow;
	}


	public int getEndRow() {
		return endRow;
	}
	
	
	

}
