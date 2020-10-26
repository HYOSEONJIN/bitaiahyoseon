package Basic;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		

		System.out.println("-----------------------1번");
		String a = "11:22:33:44:55";
		StringTokenizer t = new StringTokenizer(a, ":"); // ":"가 true이면 출력
		while (t.hasMoreTokens()) {
			System.out.println(t.nextToken());
		}
		
		
		System.out.println("-----------------------2번");
		String s = "11:22:33:44:55";
		StringTokenizer st = new StringTokenizer(s, ":", true); // ":"가 true이면 출력
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		

		System.out.println("-----------------------3번");
		String pNum = "Tel 82-010-1234-5678";
		StringTokenizer st1 = new StringTokenizer(pNum);

		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		
		System.out.println("-----------------------4번");
		StringTokenizer st2 = new StringTokenizer(pNum, " -"); // 구분자는 "-" " " 로 처리
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

		
		System.out.println("-----------------------5번");
		StringTokenizer st3 = new StringTokenizer(pNum, "- ", true);
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}

	}

}
