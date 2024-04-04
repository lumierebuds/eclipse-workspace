package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		NumberController numberController = new NumberController();

		System.out.print("정수 1 : ");
		int num1 = scanner.nextInt();

		System.out.print("정수 2 : ");
		int num2 = scanner.nextInt();

		try {
			boolean result = numberController.checkDouble(num1, num2);
			System.out.println(num1 + "은 " + num2 + "의 배수인가? : " + result);
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
	}
}
