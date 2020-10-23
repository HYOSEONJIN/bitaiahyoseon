package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteraorTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("First");
		list.add("second");
		list.add("Third");
		list.add("Fourth");
		
		// Iterator<E> 인스턴스 생성 : Iterator 메서드 호출
		System.out.println("요소 출력");
		
		Iterator<String> itr=list.iterator();
		
		//hasNext(), Next(), remove();
		while(itr.hasNext()) {
			String str=itr.next(); // hasNext(있다면)  str(받아서)
			System.out.println(str); // print(출력)
			
			if(str.compareTo("Third")==0) {
				itr.remove();
				
			}
		}
		
		System.out.println("요소 삭제 후 요소 출력");
		
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
