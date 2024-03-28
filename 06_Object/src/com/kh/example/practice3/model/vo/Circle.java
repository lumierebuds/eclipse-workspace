package com.kh.example.practice3.model.vo;

public class Circle {

	private static double PI = 3.14;
	private static int radius = 1;

	public Circle() {

	}

	public void incrementRadius() {
		radius++;
	}

	public void getAreaOfCircle() {
		System.out.println("원의 넓이 : " + (radius * radius * PI));
	}

	public void getSizeOfCircle() {
		System.out.println("원의 둘레 : " + (2 * PI * radius));
	}

}
