package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {

	private Shape s = new Shape();

	// 넓이값 계산
	public double calcArea(double height, double width) {
		s = new Shape(3, height, width);
		return (s.getWidth() * s.getHeight()) / 2;
	}

	// 색깔 변경
	public void paintColor(String color) {
		s.setColor(color);
	}

	public String print() {
		return "삼각형" + s.information();
	}
}
