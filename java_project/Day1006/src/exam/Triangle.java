package exam;

public class Triangle {



	
	// 변수 : 밑변, 높이
	
	float width; // 삼각형의 밑변
	float height; // 삼각형 높이
	
	// 변수의값을 변경하는 메서드 [반환이 없으니까 void]
	void setDate (float w, float h) {
		width=w;
		height=h;
	}
	
	//삼각형의 넓이를 구하는 메서드 : 밑변*높이/2 => 결과는 실수타입으로
	float area() {
		float result = 0.0f; // 초기화안해도되지만 그냥함
		
		result = width * height / 2 ;
				
		return result;
	}
	
	public static void main(String[] args) {
		
		Triangle t= new Triangle();
		
		t.setDate(4, 5);
		System.out.println(t.area());
	}
}
