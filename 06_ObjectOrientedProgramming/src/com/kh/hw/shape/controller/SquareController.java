package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	private Shape s = new Shape();

	// 둘레값 계산
	public double calcPerimeter(double height, double width) {
		return (width * 2) + (height * 2);
	}

	// 넓이값 계산
	public double calcArea(double height, double width) {
		return width * height;
	}

	public void paintColor(String color) {

	}

	public String print() {
		return s.information() + "\n모양 : " + s.getType();
	}
}
