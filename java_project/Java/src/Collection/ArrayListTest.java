package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		// 인스턴스 저장을 목적으로 하는 클래스
		// List<E> : 저장 순서 유지 (반복문이용 용이), 중복저장 허용

		//ArrayList<Integer> list = new ArrayList<Integer>();
		//List<Integer> list = new ArrayList(); 
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println("list의 첫번째 요소의 값 : " + list.get(0));
		System.out.println("list 요소의 갯수 : " + list.size());

		System.out.println("list 출력");
		for (Integer i : list) {
			System.out.println(i);
		}
		
		// 삭제
		list.remove(2);
		
		System.out.println("삭제 후 list 출력");
		for (Integer i : list) {
			System.out.println(i);
		}
		
		
	}

}
