package com.kh.operator;

// 증감 연산자(단항 연산자) 
// 전위 연산: 먼저 연산 후 다른 연산 실행 (선증감, 후처리)
// 후위 연산: 다른 연산 우선 실행 후 연산 (선처리, 후증감)
public class B_InDecrease {

	public void method() {
		// 전위 연산

		int num = 10;
		System.out.println("전위연산 전 num: " + num); // 10
		++num;
		System.out.println("1회 수행후 결과: " + num); // 11
		System.out.println("2회 수행후 결과: " + (++num)); // 12
		System.out.println("2회 수행후 결과: " + (++num)); // 13

		System.out.println("최종 결과값 num: " + num); // 13
		System.out.println("=====================");

		// 후위 연산

		int num2 = 10;
		System.out.println("후위연산 전 num2: " + num2); // 10
		num2++;
		System.out.println("1회 수행후 결과: " + num2); // 11
		System.out.println("2회 수행후 결과: " + (num2++)); // 11
		System.out.println("2회 수행후 결과: " + (num2++)); // 12

		System.out.println("최종 결과값 num2: " + num2); // 13
		System.out.println("=====================");

	}

	public void method2() {

		int a = 10;
		int b = ++a;

		// a = 11, b = 11
		System.out.printf("a: %d, b: %d\n", a, b);

		int c = 10;
		int d = c++;

		// c = 11 , d = 10
		System.out.printf("c: %d, d: %d\n", c, d);

		int num1 = 20;
		int result1 = num1++ * 3;

		// num1 = 21, result1= 60
		System.out.printf("num1 :%d, result1: %d\n", num1, result1);

		int e = 10;
		int f = 20;
		int g = 30;

		System.out.println(e++); // 10 -> e는 11이 된다.
		System.out.println((++e) + (f++)); // 12 + 20 => 32 , f는 21이 된다.
		System.out.println((e++) + (--f) + (--g)); // 12 + 20 + 29 => 61, e는 13이된다.

	}

}
