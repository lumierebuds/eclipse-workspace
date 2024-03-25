package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[] iArr = new int[10];
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		}
		for (int j = 0; j < iArr.length; j++) {
			System.out.print(iArr[j] + " ");
		}

	}

	public void practice2() {

		int[] iArr = new int[10];
		int length = iArr.length;
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = length--;
		}

		for (int j = 0; j < iArr.length; j++) {
			System.out.print(iArr[j] + " ");
		}

	}

	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 1; i <= arr.length; i++) {
			System.out.print(i + " ");
		}

	}

	public void practice4() {

		String[] sArr = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(sArr[1]);
	}

	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];

		System.out.print("문자 : ");
		char word = sc.nextLine().charAt(0);

		// 문자가 존재하는 개수를 담는 변수
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}

		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, word);

		for (int j = 0; j < ch.length; j++) {
			if (ch[j] == word) {
				System.out.print(j + " ");
				count++;
			}
		}
		System.out.printf("\n%c 개수 : %d", word, count);

	}

	public void practice6() {
		String[] days = { "월", "화", "수", "목", "금", "토", "일" };
		System.out.print("0 ~ 6 사이 숫자 입력 : ");

		int num = sc.nextInt();
		if (num > days.length - 1) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println(days[num] + "요일");

	}

}
