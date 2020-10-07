public class Method {

	boolean result = false;

	boolean prime(int a) {
		if (a == 1 || a == 2) {
			result = true;
		} else {
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					result = false;
					break;
				} else {
					result = true;
				}
			}
		}
		return result;
	}

/*
	void result(int a, int b) 
	{ for (int i =a; i < (b + 1); i++) { 
		if((prime(i))==true) {
			System.out.print(i + ", ");
		}
	 }
	}  */
	
	public static void main(String[] args) {

		Method m = new Method();

		System.out.println(m.prime(6));
		
		for (int i=1; i<101 ; i++) {
			if(m.prime(i)==true) {
				System.out.print(i+ ", ");
				
			}
		}
		// m.result(1, 100);
	}

}