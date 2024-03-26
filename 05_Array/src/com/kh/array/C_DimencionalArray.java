package com.kh.array;

import java.util.Arrays;

public class C_DimencionalArray {

	// 이차원 배열: 자료형이 같은 일차원 배열 여러개를 하나로 묶는 것이 2차원 배열

	public void method1() {

		/*
		 * 이차원 배열 선언 
		 * [표현법] 
		 * 자료형 배열명 [][]; -- 권장 방법 
		 * 자료형 [][] 배열명;
		 * 
		 */

		int arr1[][];
		int[][] arr2;
		int[] arr3[];

		/*
		 * 이차원 배열 할당(크기 저장) 
		 * 배열명 = new 자료형[2차원배열크기][1차원배열크기];
		 * 
		 */

		arr3 = new int[2][3];

		/*
		 * [ 
		 *   [0, 0, 0] 
		 *   [0, 0, 0]
		 * ]
		 * 
		 */

		int[][] arr = new int[2][3];
		System.out.println(arr); // 2차원 주소값
		System.out.println(arr[0]); // 1차원 주소값
		System.out.println(arr[0][0]); // 0번째 행의 0번째 열의 값

		// 2차원 배열의 길이를 알아내는 방법
		System.out.println("2차원 배열의 길이(행의 길이) : " + arr.length);

		// 1차원 배열의 길이를 알아내는 방법
		System.out.println("1차원 배열의 길이(열의 길이) : " + arr[0].length);

		// 외부반복문 (행반복) => 행 => 2차원 배열

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

	public void method2() {

		// 순서대로 1, 2, 3, 4....... 15 값을 대입하기
		int[][] arr = new int[3][5]; // 3 * 5 = 15개의 값을 넣음
		int num = 1;

		for (int row = 0; row < arr.length; row++) {
			System.out.print(row + "행 : ");
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = num++;
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

	public void method3() {
		int[] iArr = { 1, 2, 3, 4, 5 };

		// 2차원 배열의 선언 및 초기화

		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		// [3][5] 크기의 2차원 배열

		for (int i = 0; i < arr.length; i++) {
			// 2차원 배열안에 있는 1차원 배열의 값을 출력
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	public void method4() {
		/*
		 * 가변 배열
		 * 행(2차원 배열)의 크기는 정해져있나, 
		 * 행 별 열(1차원배열)의 갯수는 정해지지 않은 상태 
		 * 
		 * 행 크기는 생략 불가, 반드시 지정해야하지만 
		 * 열 크기는 생략이 가능하다, 각 행의 열의 길이 변경 가능
		 */

		int[][] arr = new int[3][]; // 1차원 배열의 크기(열)는 생략 가능하다.
		System.out.println(arr); // 2차원 배열의 주소값

		// null, 1차원 주소값 중 'null' 값이 나온다.
		// 가변배열일때는 null 값이 된다.
		System.out.println(arr[0]);

		// null 이 되지 않기 위해서는 2차원 배열내에 1차원 배열을 넣어줘야한다.
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];

		/*
		 * [
		 * 		[0, 0],
		 * 		[0],
		 * 		[0, 0, 0] 
		 * 
		 * ]
		 */

		int value = 1;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = value++;
				System.out.printf("%03d ", arr[row][col]);
			}
			System.out.println();
		}
	}
}
