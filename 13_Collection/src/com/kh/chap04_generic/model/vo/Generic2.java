package com.kh.chap04_generic.model.vo;

// 제네릭의 extends
// 제네릭의 extends는 클래스간의 상속의 개념이 아닌, 저장할 자료형을 “제한” 시키는데 사용한다.

// <T extends Parent> : Parent 본인이나, Parent 클래스를 상속받은 자료형만 올 수 있다는 뜻.
public class Generic2<T extends Parent> {

	private T generic; // = new T(); 제네릭타입변수로는 객체생성불가.

	public void printing() {
		generic.doPrinting(); // Parent에 존재하는 doPrinting() 호출 가능
	}

	public T getGeneric() {
		return generic;
	}

	public void setGeneric(T generic) {
		this.generic = generic;
	}

	public static void main(String[] args) {
		// --------------------------------------------
		// 타입제한
		Generic2<Parent> parent = new Generic2<>();
		Generic2<Child1> child1 = new Generic2<>();
		Generic2<Child2> child2 = new Generic2<>();
		// Generic2<String> etc = new Generic2<>(); // 컴파일 에러
		// Generic2<Object> etc = new Generic2<>(); // 타입을 제한한 클래스 위로 더 올라갈 수는 없다.

		parent.setGeneric(new Parent());
		parent.printing();

		child1.setGeneric(new Child1());
		child1.printing();

		/*
		 * 와일드카드 사용하기 
		 * Generic2에 들어가야할 자료형을 모르는 경우 ? 로 대체가 가능
		 * 단 ?(와일드카드)의 경우 들어가야할 자료형을 모르는 타입(unknown)으로 지정되기 때문에 
		 * 여러가지 문제점이 있음. 
		 */

		Generic2<?> unknown = new Generic2<>();
		// unknown.setGeneric(new Parent());
		// ? 는 자료형의 범위가 정해져있지 않은 상태임. 따라서 논리적인 값이 들어갔는지 논리적으로 검사가 불가능함.
		// ?의 값의 범위가 무한하기 때문. 따라서 ?의 범위를 제한함으로써 추가적인 사용가능하다.

		// 1) extends 를 통한 와일드 카드 범위제한.(상한 경계 설정)
		// ? : Parent or Child1 or Child2 or 미지의 Parent 자식들
		Generic2<? extends Parent> unknown2 = new Generic2<>();
		// unknown2.setGeneric(new Parent());
		// unknown2.setGeneric(new Child1());
		// 즉 ? 사용시 제네릭에 값을 대입하기 위한 용도로 extends를 통해 제한하는 것은 좋은 방법이 아님.
		Parent p = unknown2.getGeneric(); // 값을 추출하는데 있어서는 문제없다.

		// 2) super를 활용한 와일드카드 범위 제한(최소 클래스 지정하는 방법) : 하한 경계 설정
		// ?의 범위는 Parent, Parent의 조상들로 제한
		// ? : Parent 의 조상클래스, Object
		Generic2<? super Parent> unknown3 = new Generic2<>();
		unknown3.setGeneric(new Parent());
		unknown3.setGeneric(new Child1());
		unknown3.setGeneric(new Child2());
		// ? 가 Parent든, Parent의 조상이든, Object든 다형성이 발생 즉, 다형성의 특징(업캐스팅)을 이용
		// 자료형이 가지는 최소 클래스를 부모 클래스로 설정함.

		// Parent p2 = unknown3.getGeneric(); // Parent 보다 상위클래스도 ?의 범위에 들어가므로 문제발생.

	}
}

class Parent {

	public void doPrinting() {
		System.out.println("부모 함수");
	}

	public String toString() {
		return "부모";
	}
}

class Child1 extends Parent {

	public void doPrinting() {
		System.out.println("자식1 함수");
	}

	public String toString() {
		return "자식1";
	}
}

class Child2 extends Parent {
	public void doPrinting() {
		System.out.println("자식2 함수");
	}

	public String toString() {
		return "자식2";
	}
}