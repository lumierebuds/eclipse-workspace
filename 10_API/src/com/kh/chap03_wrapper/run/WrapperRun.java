package com.kh.chap03_wrapper.run;

public class WrapperRun {

	/*
	 * Wrapper 클래스 
	 * => 기본 자료형(8개)을 객체로 포장해주는 클래스들. 
	 * 
	 * 기본 자료형		<----------> Wrapper 클래스
	 * boolean					Boolean
	 * char						Character
	 * byte   					Byte
	 * short					Short
	 * int  					Integer
	 * long						Long
	 * float					Float
	 * double					Double 
	 * 
	 */

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 15;
		// 기본 자료형에서 객체 자료형의 메서드를 활용하고 싶다면
		// Wrapper 클래스로 변환해준다.

		// 자동 형변환 기본 자료형 => Wrapper (Boxing)
		Integer i1 = num1;
		Integer i2 = num2;

		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i1.compareTo(i2)); // 10 15
		// a.compareTo(b) : 두 값을 비교해서 a가 b보다 크면 1, a가 b보다 작으면 -1 반환
		// 같다면 0

		// Wrapper => 기본 자료형 (UnBoxing)

		int num3 = i1;
		int num4 = i2;

		System.out.println("=====================================");

		// 기본자료형 <--------> String
		// 문자열 자료형을 기본 자료형으로 변환

		String str1 = "10";
		String str2 = "15.3";

		System.out.println(str1 + str2); // 1015.3

		// 1. String --> 기본자료형 : 파싱한다.
		// 바꾸고자 하는 자료형의 Wrapper.parseXXX(변환할문자열);

		int i = Integer.parseInt(str1); // "10" => 10
		double d = Double.parseDouble(str2); // 정말 많이 사용하는 메서드에 해당!

		System.out.println(i + d); // 25.3

		// 2. 기본 자료형 --> String
		// String.valueOf(변환할 기본자료형값)
		// "" + 기본자료형값

		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
	}
}
