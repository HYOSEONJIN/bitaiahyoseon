package exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test {
public static void main(String[] args) {
	 
	// HashSet 인스턴스 생성 : 인스턴스를 저장하기 위한 저장 공간 생성
	// set : 집합, 저장순서 유지하지않는다.

	boolean check = false;
	
	Set<Integer> set = new HashSet<Integer>();
	

	set.add(1);
	set.add(2);
	set.add(3);
	set.add(4);   // 중복이라 저장되지 않는다.


	System.out.println("set 요소의 개수 : "+ set.size());

	Iterator<Integer> itr=set.iterator();
	while(itr.hasNext()) {
		if(itr.next()==1){
			check=true;
		}
			}
	
	System.out.println(check);


}


}