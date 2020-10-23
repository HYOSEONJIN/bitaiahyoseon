package Collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {

		// Map : key-Value 형식으로 저장하는 객체
		// 대표적인 형식이 HashMap이다. HashMap<K, V>
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		// 요소 추가 : put(T e)
		map.put(1, "김남준");
		map.put(2, "김석진");
		map.put(3, "민윤기");
		map.put(4, "정호석");
		map.put(5, "박지민");
		map.put(6, "김태형");
		map.put(7, "전정국");

		// NavigableSet<Key Type>
		Set<Integer> set = map.keySet();
		
		System.out.println("오름차순 출력...");
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext())
			System.out.println(map.get(itr.next()));

	}

}
