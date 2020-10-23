package Collection;

public class SimpleNumber {

	int num;

	
	// Set 동등 비교를 위한 Hashcode(), equals() 오버라이딩
	
	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + num;
		return num%3; // 0 or 1 or 2
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 참조 주소값 == 전달받은 참조 주소값
			return true;
		if (obj == null) // 들어오는 객체가 null  ex) set.add(null)인 경우
			return false;
		if (getClass() != obj.getClass()) // 클래스 이름비교, 같은 타입인가
			return false;
		SimpleNumber other = (SimpleNumber) obj;
		if (num != other.num)
			return false;
		return true;
	}

	public SimpleNumber(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
}
