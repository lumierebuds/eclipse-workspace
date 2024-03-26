package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	public void method1() {

		// 원본 배열

		int[] origin = { 1, 2, 3, 4, 5 };
		System.out.println("===== 원본 배열 출력 =====");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}

		// 1 2 3 4 5

		// 얕은 복사
		int[] copy = origin; // origins의 주솟값 대입
		System.out.println("\n===== 복사본 배열 출력 =====");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}

		copy[2] = 9999;

		System.out.println("\n===== 복사본 배열 수정후 =====");

		System.out.println("===== 원본 배열 출력 =====");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}

		System.out.println("\n===== 복사본 배열 출력 =====");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}

		System.out.println("\norigin 과 copy는 동일합니까? " + (origin == copy));

	}

	public void method2() {

		// 1. for 문을 통한 복사
		// 새로운 배열을 생성한 후 인덱스 별 요소를 출력한다.

		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = new int[origin.length];

		for (int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
		}

		System.out.println("===== 원본 배열 출력 =====");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}

		System.out.println("\n===== 복사본 배열 출력 =====");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}

		copy[2] = 9999;

		System.out.println("\n===== 복사본 배열 수정후 =====");

		System.out.println("===== 원본 배열 출력 =====");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}

		System.out.println("\n===== 복사본 배열 출력 =====");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}

		System.out.println("\norigin 과 copy는 동일합니까? " + (origin == copy));
	}

	public void method3() {
		// 2. System 클래스의 arraycopy 메서드를 활용한 깊은 복사

		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[10];
		// System.arraycopy(원본배열명, 원본배열의 복사를 시작할 인덱스, 복사본배열명, 복사본
		// 배열의 복사될 시작 인덱스, 복사할 갯수)

		System.arraycopy(origin, 0, copy, 0, origin.length /* 5 */);
		/*
		System.arraycopy(origin, 2, copy, 9, 2); 
		// 마지막 인덱스부터 원본배열의 값을 넣으면
		// ArrayIndexOutOfBoundsException 예외가 발생한다. 
		*/

		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}

	public void method4() {
		// 3. Array 클래스에서 제공하는 copyof 메소드를 이용한 복사
		int[] origin = { 1, 2, 3, 4, 5 };

		// 복사본 배열 = Arrays.copyof(원본배열명, 복사할갯수);
		int[] copy = Arrays.copyOf(origin, 7); // 복사할 갯수 == copy 배열의 크기 (배열의 크기가 넘어가면 0으로 채워진다.)

		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println("\n----------------------------------");
		copy(origin, 7);

	}

	// 직접 메서드를 만들어서 복사할 수 있다.
	public void copy(int[] origin, int size) {
		int[] copy = new int[size];
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}

	}

	public void method5() {
		// 4. clone 메서드를 통한 복사
		int[] origin = { 1, 2, 3, 4, 5 };

		// 복사본 배열 = 원본배열.clone();
		int[] copy = origin.clone(); // 주소값만 다르고, 원본배열과 완전 동일한 배열을 반환

		System.out.println(Arrays.toString(copy));
		// Arrays.toString(배열)
		// => 앞과 뒤에 [] 붙이고 사이에는 각 인덱스의 값을 , 을 찍어가면서 보여준다.

		// toString 함수 구현

		System.out.print("[");
		for (int i = 0; i < copy.length; i++) {
			if (i != copy.length - 1) { // 마지막 인덱스가 아니라면
				System.out.print(copy[i] + ", ");
			} else {
				System.out.print(copy[i]);
			}
		}

		System.out.print("]");
	}

}