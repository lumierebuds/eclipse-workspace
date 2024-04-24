package com.kh.chap01_constant.model._enum;

public abstract class CarColor {

	public static final CarColor BLACK = new CarColor("BLACK") {
		public void printTest() {
			System.out.println("저는 블랙입니다.");
		}
	};

	public static final CarColor RED = new CarColor("RED") {
		public void printTest() {
			System.out.println("저는 레드입니다.");
		}
	};

	public static final CarColor BLUE = new CarColor("BLUE") {
		public void printTest() {
			System.out.println("저는 블루입니다.");
		}
	};

	private String name;

	public abstract void printTest();

	public CarColor() {

	}

	public CarColor(String name) {
		this.name = name;
	}
}

