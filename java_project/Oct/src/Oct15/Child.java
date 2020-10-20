package Oct15;

public class Child extends Parent{

	
	public static void main(String[] agrs){
		Child c= new Child();
		
		System.out.println(c.money); // 아무것도 안했지만 parent를 상속받아서 100이출력됨
		System.out.println(c.getMoney());
	}
}
