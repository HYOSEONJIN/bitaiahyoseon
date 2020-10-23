package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		
		// Treeset : 트리 구조로 저장하는 자료구조. 2진트리

		// Treeset 인스턴스 생성
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		

		tSet.add(1);
		tSet.add(5);
		tSet.add(2);
		tSet.add(4);
		tSet.add(3);
		tSet.add(2);
		
		System.out.println("Treeset 요소의 갯수 : " + tSet.size());
		
		Iterator<Integer> itr = tSet.iterator();
		
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}


}
