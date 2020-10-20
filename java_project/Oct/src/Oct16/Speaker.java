package Oct16;

public class Speaker {

		private int volumeRate; // 볼륨크기
		
		// 현재 불륨의 크기를 출력
		
		
		void showCurrentState() {
			System.out.println("볼륨 크기 : " + volumeRate);
		}
		
		
		public void setVolume(int vol) {
			this.volumeRate=vol;
		}
}
