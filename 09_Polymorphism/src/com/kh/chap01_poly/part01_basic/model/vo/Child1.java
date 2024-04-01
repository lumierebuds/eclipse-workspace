package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent {

	// 부모클래스의 접근제한자가 public인 필드, 메서드
	private int z;

	public Child1() {
		super();
	}

	public Child1(int x, int y, int z) {
		super();
		setX(x);
		setY(y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void printChild1() {
		System.out.println("자식클래스");
	}

	@Override
	public void print() {
		System.out.println("자식클래스 1번에서 재정의된 메서드");
	}
}
