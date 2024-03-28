package com.kh.chap02_objectArray.run;

import java.util.Arrays;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {

		Phone[] arr = new Phone[3]; // [null, null, null]

		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0]);
		// 초기화 전
		System.out.println(Arrays.toString(arr));

		arr[0] = new Phone();
		arr[1] = new Phone("갤럭시S", "10", "삼성", 1200000);
		arr[2] = new Phone("갤럭시z플립", "4", "삼성", 1400000);

		arr[0].setName("아이폰");
		arr[0].setBrand("애플");
		arr[0].setSeries("14");
		arr[0].setPrice(1000000);

		// 초기화 후
		System.out.println(Arrays.toString(arr));

		// 핸드폰 배열의 길이만큼 반복하면서
		// 반복중인 핸드폰의 정보를 출력하고,
		// 핸드폰들 가격의 총합과 평균가격을 계산해서 출력하시오.

		System.out.println("---------------------------------");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i].getPrice();
		}

		System.out.println("핸드폰 총 가격 : " + sum);
		System.out.println("핸드폰 평균가 : " + (sum / arr.length));

		///////////////////////////////////////////////////////////

		/*
		 * 향상된 반복문 
		 * 
		 * 이전 for(초기식; 조건식; 증감식) 반복문은 basic loop이라고 부름
		 * 
		 * for each문(향상된 반복문) 
		 * - 배열 또는 컬렉션과 사용됨
		 * - 배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하는게 목적일때 
		 * 	 사용함. 
		 * 
		 * - 초기식, 조건식, 증감식이 없다. 
		 * 
		 */
		System.out.println("=================================");

		int total = 0;
		for (Phone phone : arr) {
			System.out.println(phone);
			total += phone.getPrice();
		}
		System.out.println("핸드폰 총 가격 : " + total);
	}

}
