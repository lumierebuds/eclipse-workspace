package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {
	public static void main(String[] args) {
		Circle circle = new Circle();
		// 반지름 1 증가 전
		circle.getAreaOfCircle();
		circle.getSizeOfCircle();
		circle.incrementRadius();
		// 반지름 1 증가 후
		circle.getAreaOfCircle();
		circle.getSizeOfCircle();
		circle.incrementRadius();
		// 반지름 1 증가 후
		circle.getAreaOfCircle();
		circle.getSizeOfCircle();

	}
}
