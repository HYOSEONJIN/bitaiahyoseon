package Basic;

import java.util.Random;

public class RandomnumberGenerator {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		System.out.println(r.nextBoolean());	// 논리값두개랜덤출력 t/f
		System.out.println(r.nextInt());		// Integer범위안의 랜덤
		System.out.println(r.nextLong());
		
		System.out.println(r.nextInt(45)); // 범위설정 랜덤 0~44
		System.out.println("이번주 번호예상");
		for(int i=0; i<6; i++) {
			System.out.print(r.nextInt(46)+"\t");
		}
		
		
		Random r2=new Random(10); //seed가잇어서 한번 나온 랜덤수가 계속 똑같이 출력됌
		System.out.println("이번주 번호예상");
		for(int i=0; i<6; i++) {
			System.out.print(r2.nextInt(46)+"\t");
		}
		
		System.out.println();
		
		System.out.println("System.currentTimeMillis()  : "+ System.currentTimeMillis()); // 바뀜
		System.out.println("System.nanoTime()  : " +System.nanoTime());
		Random r3=new Random(System.currentTimeMillis());
		System.out.println("이번주 번호예상");
		for(int i=0; i<6; i++) {
			System.out.print(r3.nextInt(46)+"\t");
		}
	
	}

}
