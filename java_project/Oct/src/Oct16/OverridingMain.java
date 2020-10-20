package Oct16;

public class OverridingMain {

	public static void main(String[] args) {
		// 다형성
		
		Speaker s = new BaseEnSpeaker();
		// 참조변수 s는 volumeRate와 showCurrentState,setVolume 기능만 가진다
		
		//speaker멤버
		s.setVolume(10);
		
		//baseEnSpeaker가가지는 멤버
		// s.setbaserate(10)
		
		// BaseEnSpeaker 오버라이딩한 메서드출력
		s.showCurrentState();
		
	}

}
