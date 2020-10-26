package io;

import java.io.Serializable;

public class Circle implements Serializable{
	
	//implements Serializable : 직렬화의 대상이다. 인스턴스 저장이 가능하다.
	// 직렬화를 하기 위해서는 반드시 해줘야함..
	
	int x;
	int y;
	double rad;
	
	public Circle(int x, int y, double r) {
		this.x=x;
		this.y=y;
		this.rad=r;
	}
	

	public void showCircleInfo() {
		System.out.printf("[%d,%d]", x,y);
		System.out.println("rad : " +  rad);
		
	}

}
