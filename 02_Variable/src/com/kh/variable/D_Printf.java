package com.kh.variable;

public class D_Printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.printf("출력하고자 하는 형식", 출력하고자 하는 값);
		// => f는 format(형식)을 의미
		// => 형식에 맞춰서 값들을 출력하고 끝(개행x)

		int i = 10;
		int j = 20;
		System.out.printf("i는 %d, j는 %d\n", i, j);

		D_Printf.printfTest();

	}

	public static void printfTest() {
		int iNum1 = 10;
		int iNum2 = 20;
		int result = iNum1 + iNum2;

		System.out.printf("iNum: %d, iNum2: %d\n", iNum1, iNum2);

		System.out.printf("%d + %d = %d\n", iNum1, iNum2, result);
		System.out.printf("%5d + %5d = %5d\n", iNum1, iNum2, result); // 5칸의 공간을 확보후 오른쪽 정렬
		System.out.printf("%-5d + %-5d = %-5d\n", iNum1, iNum2, result); // 5칸의 공간을 확보후 왼쪽 정렬

		// 실수형식

		double dNum = 4.27546789;
		System.out.printf("dNum: %f\n", dNum);
		// %f: 소수점 아래 7번째 줄에서 반올림 처리되서 6째 까지만 출력
		System.out.printf("dNum: %.1f\n", dNum);
		// %.1f: 소수점 2째줄에서 반올림 처리되서 1째까지 출력

		// 문자와 문자열 형식

		char ch = 'A';
		String str = "hello";

		System.out.printf("%c %s\n", ch, str);
		System.out.printf("%C %S\n", ch, str);
		// %C, %S: upperCase 적용되어 문자와 문자열이 대문자가 된다.

		// ** printf 주의점 **
		// 지정한 포맷의 갯수와 종류, 뒤따라오는 변수의 갯수와 종류가 같아야 한다.

	}
}
