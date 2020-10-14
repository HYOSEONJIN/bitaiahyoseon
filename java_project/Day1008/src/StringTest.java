
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="My string";
		String str2="My string";
		String str3="your string";
		String str4= new String("My string")
		;
		
		if (str1==str2){
			System.out.println("같은 인스턴스를 참조");
				}
		else {
			System.out.println("다른 인스턴스를 참조");
		}
		
		if(str1==str3) {
			System.out.println("같은 인스턴스를 참조");
				}
		else {
			System.out.println("다른 인스턴스를 참조");
		}
	
		
		if (str1==str4){
			System.out.println("같은 인스턴스를 참조");
				}
		else {
			System.out.println("다른 인스턴스를 참조");
		}
		
		System.out.println(str1.equals(str4));
	}

}
