package com.kh.practice.array;

public class ArrayPractice {

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

}
