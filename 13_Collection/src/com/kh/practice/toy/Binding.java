package com.kh.practice.toy;

public class Binding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent c1 = new Child();

		c1.println();

	}

}

class Parent {
	private String name;
	private int age;

	public Parent() {

	}

	public void println() {
		System.out.println("아빠입니다.");
	}

}

class Child extends Parent {

	private String hobby;

	public Child() {
		System.out.println("자식입니다. 동적바인딩 된거에요.");
	}

	public void println() {

	}

}
