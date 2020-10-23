package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Person implements Comparable<Person>{

	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return name+"("+age+")";
	}

	
	public int compareTo(Person o) {
//		if(age>o.age) {
//			return 1; // 양수반환 : 전달받은 객체의 값이 작을 때
//		}else if (age<o.age) {	
//			return -1; // 음수반환
//		}else {
		 // return age-o.age; // 작은수 > 큰수
		return o.age-age; // 큰수 > 작은수
	}
	
	

	

	public static void main(String[] args) {
		
		TreeSet<Person> tSet = new TreeSet<Person>();
		
		tSet.add(new Person("김태형", 24));
		tSet.add(new Person("박지민", 24)); // 그와중에 age가 같아서 중복이라 지워진
		tSet.add(new Person("전정국", 23));
		tSet.add(new Person("김석진", 27));

		Iterator<Person> itr = tSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
}
}
