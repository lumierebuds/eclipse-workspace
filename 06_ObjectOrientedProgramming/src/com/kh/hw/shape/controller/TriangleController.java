package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {

	private Shape s = new Shape();

	// 넓이값 계산
	public double calcArea(double height, double width) {
		return (width * height) / 2;
	}

	public void paintColor(String color) {
		System.out.println(s.information() + "\n모양 : " + s.getType());
	}
}
