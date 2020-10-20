package Oct17;

public abstract class Player {
		// 추상 클래스 : 클래스의 멤버 메서드 중에 하나라도 추상 메서드를 가지면 추상클래스가 된다.
	
	
	// 추상메서드는 : 구현하는 {} 구현부가 없는 클래스, 메서드 정의부에 abstract 키워드를 써준다
	// 문장 마지막은 ;로 종료한다.
	abstract void play(int num);
	abstract void stop();

}
abstract class VideoPlayer extends Player{
	// 추상 클래스를 상속해서 추상메서드 play와 stop을 가진다.
	// videoplayer 클래스도 추상클래스가 된다.
	
}

class AudioPlayer extends Player{

	void play(int num) {
		// 추상클래스(상위클래스) void play(int num)의 메서드를 오버라이딩 : 구현한다.
		
		
	}

	void stop() {
		// TODO Auto-generated method stub
	}
	
}
