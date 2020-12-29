package guestbook_exception;

public class MessageNotfoundexception extends Exception {

	public MessageNotfoundexception() {
		super("게시물을 찾을 수 없습니다");
	}

}
