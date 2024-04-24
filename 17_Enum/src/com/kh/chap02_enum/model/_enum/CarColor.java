package com.kh.chap02_enum.model._enum;

import java.util.Arrays;

public enum CarColor {
	BLACK(0) {
		public void printTest() {
			System.out.println("저는 블랙입니다.");
		}
	},
	RED(1) {
		public void printTest() {
			System.out.println("저는 레드입니다.");
		}
	},
	BLUE(2) {
		public void printTest() {
			System.out.println("저는 블루입니다.");
		}
	}; // 생성자를 통해서 값을 정해준다.

	private CarColor(int color) {
		this.color = color;
		System.out.println(this + " 객체 생성됨");
	}
	// enum도 결국 클래스이기 때문에 내가 원하는 메서드를 정의하거나, 오버라이딩이 가능.
	// 단, 상수값들을 관리하기 위한 용도의 메서드를 작성하는것을 권장함.

	private int color;
	
	public int getColor() {
		return color;
	}

	// enum 내부의 값들을 반복문 돌리기
	public static CarColor valueOf(int color) {
		CarColor[] arr = values(); // enum 내부의 상수값들을 모아서 배열로 반환해주는 메서드 
		// [BLACK, RED, BLUE] 
		
		return Arrays.stream(arr)
				.filter(value -> value.color == color)
				.findAny()
				.orElse(null);
	}
	
	// 상수값마다 고유한 메서드(기능)부여하기 - 익명 클래스로 메서드를 정의한다.
	
	public abstract void printTest(); 

}

