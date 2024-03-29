package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	private Shape s = new Shape();

	/*
	// 둘레값 계산
	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width);
		return (s.getWidth() * 2) + (s.getHeight() * 2);
	}
	
	// 넓이값 계산
	public double calcArea(double height, double width) {
		s = new Shape(4, height, width);
		return (s.getWidth() * s.getHeight());
	}
	
	// 색깔 변경
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "사각형" + s.information();
	}
	*/

	// [강사님 코드]

	public double calcPerimeter(double height, double width) {
		this.s = new Shape(4, height, width);
		return (width * 2) + (height * 2);
	}

	public double calcArea(double height, double width) {
		this.s = new Shape(4, height, width);
		return width * height;
	}

	public void paintColor(String color) {
		s.setColor(color);
	}

	public String print() {
		return "사각형 " + s.information();
	}

}
