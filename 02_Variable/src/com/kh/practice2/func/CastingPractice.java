package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {

	Scanner sc = new Scanner(System.in);

	public void operator() {

		System.out.print("국어: ");
		double korean = sc.nextDouble();
		System.out.print("영어: ");
		double english = sc.nextDouble();
		System.out.print("수학: ");
		double math = sc.nextDouble();

		int sum = (int) (korean + english + math);
		int avg = (int) ((korean + english + math) / 3);

		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);

	}
}
