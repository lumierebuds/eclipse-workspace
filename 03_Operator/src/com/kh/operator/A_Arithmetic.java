package com.kh.operator;

// 산술 연산자(이항 연산자) - 두개의 값을 가지고 연산

// +, -, *, /, %

public class A_Arithmetic {

	public void method() {
		int num1 = 10;
		int num2 = 3;

		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));

		double a = 35;
		double b = 10;

		System.out.println(a / b); // 3.5
		System.out.println(a % b); // 5.0

	}

	public void quiz() {

		int a = 5;
		int b = 10;

		int c = (++a) + b; // 6+10 => '16' | a=6, b =10, c= 16
		int d = c / a; // 16 / 6 => '2' | a=6, b=10, c =16, d=2
		int e = c % a; // 16 % 6 => '4' | a=6, b=10, c =16, d=2, e=4

		int f = e++; // '4' | a=6, b=10, c =16, d=2, e=5, f=4
		int g = (--b) + (d--); // 9 + 2 | a=6, b=9, c =16, d=1, e=5, f=4, g=11
		int h = 2; // a=6, b=9, c =16, d=1, e=5, f=4, g=11, h=2

		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);

		// a=7, b=9, c=15, d=1, e=6, f=4, g=10, h=2, i=12

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		System.out.println("f: " + f);
		System.out.println("g: " + g);
		System.out.println("h: " + h);
		System.out.println("i: " + i);

		System.out.printf("a=%d, b=%d, c=%d, d=%d, e=%d, f=%d, g=%d, h=%d, i=%d", a, b, c, d, e, f, g, h, i);

	}

}
