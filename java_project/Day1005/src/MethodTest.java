
public class MethodTest {

	public static void main(String[] args) {

		
		MyMeth my= new MyMeth();
		
		System.out.println(my.add(1,5));
		
		my.sayhello();
		
		my.plus(3, 4);
		
		System.out.println(my.check());
		
		he();
		
		my.div(10,2);
		my.div(10,0); // 예외처리가없으면 0으로는 못나눠서 에러~! by zero
		
		
		
	}

	static void he(){
		System.out.println("안녕하세요");
		
	}
}
