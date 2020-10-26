package io;

import java.io.Serializable;

public class Circle2 implements Serializable {

	// implements Serializable : 직렬화의 대상이다. 인스턴스 저장이 가능하다.
	// 직렬화를 하기 위해서는 반드시 해줘야함..

	// transient Point p; 직렬화대상에서 제외
	Point p;
	double rad;

	public Circle2(int x, int y, double r) {
		p = new Point(x, y);
		this.rad = r;
	}

	public void showCircleInfo() {
		System.out.println("rad : " + rad);

	}

}
