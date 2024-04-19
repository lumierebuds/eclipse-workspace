package com.kh.chap02_lamda.part01_basic;

import com.kh.chap02_lamda.model.function.LamdaTest1;

public class Lamda {

	/*
	 * 함수형 프로그래밍 && 람다식 
	 * 
	 * 객체지향 프로그래밍(OOP) ? 객체를 기반으로 객체간의 상호작용을 통해 동작하는 프로그램을 만드는 프로그래밍 방식.
	 * 						  OOP에서 내가 필요로하는 기능(메서드)이 있다면 반드시 클래스를 만들고 그 내부에 메서드를 정의
	 * 						  한 후 필요한 위치에서 객체를 생성하여 메서드를 호출해야함.
	 * 
	 * 함수형 프로그래밍(FP) ?   함수를 기반으로 코드를 작성하고 함수를 호출하여 동작하는 프로그래밍 방식 
	 * 					     OOP방식에 비해 작성해야하는 코드수가 줄어듬으로써 빠른 개발이 가능하다. 
	 * 
	 * 자바에서도 FP의 편리성때문에 JDK 8 버전부터 지원하게 되었고, 자바에서의 함수형 프로그래밍 방식을 람다식이라고 부름.
	 * (참고로 FP도 OOP기반이다.) 
	 * 
	 * 
	 * 람다식 ? 
	 * - 자바에서 FP를 위해 함수를 간결하게 표현하는 방법. 
	 * - 함수이지만 함수이름이 없는 익명함수의 구조를 가지고 있음. 
	 * - 1회용으로 사용할 함수에서 불필요한 부분을 걸러낸 후 최대한 간결하게 표현함. 
	 * - 사용방법이 여러가지 있으므로 사용방법별 숙지(연습)이 필요하다. 
	 * 
	 * [표현법] 
	 * (매개변수) -> { 구현코드 }
	 * 
	 * [적용예시] 
	 * 1. 일반함수 
	 * int add(int x, int y) {
	 * 		return x + y;
	 * }
	 * 
	 * 2. 람다식 
	 * (int x, int y) -> {return x + y};  
	 *  
	 */

	int add(int x, int y) {
		return x;
	}

	// (int x, int y) -> {return x+y};

	/*
	 * 람다식은 원래 구현해야하는 반환형, 메서드명, 매개변수의 자료형, 반환값, {} 등의 정보를 생략한 형태이지만
	 * 어딘가에서 메서드 선언을 해야하고, 메서드 선언을 위해선 클래스가 먼저 선언되어 있어야함. 
	 * 기본적인 정보가 존재해야 불필요한 부분을 생략할 수 있는것.
	 * 
	 * 인터페이스안에 구현해야할 메서드 1개만 정의해두고, 실제 코드 구현은 람다식을 통해 구현하게 한다. 
	 * 
	 */

	public static void main(String[] args) {

		// 람다식은 인터페이스의 추상메서드의 코드 구현시 사용된다.

		LamdaTest1 lamda1 = new LamdaTest1() {
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};

		int result = lamda1.add(1, 2);
		System.out.println(result);

		// LamdaTest1 변수에 들어갈 수 있는 객체는 LamdaTest1 인터페이스를 구현한 객체뿐임.
		// 이걸 익명클래스로 표현하면 항상 (무조건) new LamdaTest1() {} 이기 때문에 생략가능.
		// 함수형인터페이스 내부에는 항상 추상메서드가 1개만 존재하기 때문에 불필요한 접근제한자, 반환명, 메서드명등이
		// 생략 가능함.
		
		LamdaTest1 lamda2 = (int x, int y) -> {
			return x + y;
		}; // 익명 내부클래스의 객체로 보면된다.

		int result2 = lamda2.add(3, 4); // LamdaTest1 인터페이스의 추상메서
		System.out.println(result2);

		int local = 5;
		// local = 6; // final 로 동작하기 때문에 값을 변경하면 안된다.
		LamdaTest1 lamda3 = (int x, int y) -> {

			return x + y + local;
		};

	}

}
