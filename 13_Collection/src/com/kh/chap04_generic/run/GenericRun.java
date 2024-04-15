package com.kh.chap04_generic.run;

import com.kh.chap04_generic.model.vo.Generic;

public class GenericRun {

	public static void main(String[] args) {
		/*
		 * 제네릭? 
		 * 변수의 선언이나 메서드의 매개변수를 하나의 참조 자료형이 아닌, 여러 자료형으로 변환 될 수 있도록 프로그래밍 하는 방식.
		 * 
		 * 실제 사용되는 참조 자료형으로의 변환은 컴파일러에 의해 검증되므로 안정적인 프로그래밍 방식.
		 * 
		 * 컬렉션에서는 제네릭이 없을때 다양한 객체를 담을 수 있었는데 저장할 객체의 종류를 제한할 수 있는게 제네릭이었음.
		 * ArrayList<Music>; // 컬렉션에는 Music만 담을 수 있음. 
		 * 
		 * 
		 */

		Generic<String, Integer> g = new Generic<>();
		g.setGe(10);
		g.setT("String");
		System.out.println(g.test(1));

		Generic<Integer, String> g2 = new Generic<>();
		g2.setGe("10");
		g2.setT(12);
		System.out.println(g2.test("30"));

	}
}
