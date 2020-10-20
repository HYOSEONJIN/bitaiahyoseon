package Oct17;

public class interfaceMark {

	public static void main(String[] args) {

		PointOne pos1 = new PointOne(1, 1);
		PointTwo pos2 = new PointTwo(2, 2);
		PointOne pos3 = new PointOne(3, 3);
		PointTwo pos4 = new PointTwo(4, 4);
		String test = "test";
		
		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
		ClassPrinter.print(pos3);
		ClassPrinter.print(pos4);
		ClassPrinter.print(test);
	}

}

interface UpperCasePrintable {
	// 마킹하려고하는 건 거의 ~able로 이름을 만듦

}

class PointOne implements UpperCasePrintable {
	private int xPos;
	private int yPos;

	PointOne(int x, int y) {
		this.xPos = x;
		this.yPos = y;

	}

	@Override
	public String toString() {
		return "[x pos: " + xPos + ", y pos : " + yPos + "]";
	}
}

class PointTwo {
	private int xPos;
	private int yPos;

	PointTwo(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public String toString() {
		return "[x pos: " + xPos + ", y pos : " + yPos + "]";
	}

}

class ClassPrinter {
	public static void print(Object obj) {
		String str=obj.toString();
		
		// UppercasePrintable 형변환가능여부를 확인 > 대문자로 변경
		if(obj instanceof UpperCasePrintable) {
			str = str.toUpperCase();
		}
		
		System.out.println(str);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}