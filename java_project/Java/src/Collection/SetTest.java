package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		// HashSet 인스턴스 생성 : 인스턴스를 저장하기 위한 저장 공간 생성
		// set : 집합, 저장순서 유지하지않는다.
		
		Set<String> set = new HashSet<String>();
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("First");   // 중복이라 저장되지 않는다.
		

		System.out.println("set 요소의 개수 : "+ set.size());
		
		// Set<e>는 저장하는 순서를 가지지 않기 때문에 
		// 일괄처리를 위해서는 Iterator<E> 인스턴스를 이용해서 처리한다.
		// Collection<E>에는 Iterater() 메서드를 가지고 있고 Iterator<E>를 반환한다

		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
