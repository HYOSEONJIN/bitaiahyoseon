package Oct16;

public class BaseEnSpeaker extends Speaker{

	private int baseRate;
	
	public void setBaseRate(int base) {
		this.baseRate=base;
	}
	
	// 오버라이딩 : 상속관계에서 상속받은 메서드를 선언부는 동일하게 하고 처리부를 재구성하는 것
	@Override
	void showCurrentState() {
		super.showCurrentState();
		System.out.println("베이스의 크기 " + baseRate);
	}

}
