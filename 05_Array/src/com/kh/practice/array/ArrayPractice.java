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
		// System.out.println(sArr[1]);

		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].equals("귤"))
				System.out.println(sArr[i]);
		}
	}

	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];

		System.out.print("문자 : ");
		char word = sc.nextLine().charAt(0);

		// 문자가 존재하는 개수를 담는 변수
		int count = 0;

		// 문자배열로 문자열의 내용을 복사해온다.
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}

		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, word);

		// 문자배열에서 단어를 검색해서 인덱스 위치와 개수를 증가시킴
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
		if (num < 0 || num > 6) { // 0 과 6 사이의 값을 입력하지 않았을때
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println(days[num] + "요일");

	}

	public void practice7() {

		System.out.print("정수 : ");
		int num = sc.nextInt(); // 배열의 길이를 직접 입력
		int[] arr = new int[num]; // 길이만큼 배열을 생성
		int value = 0; // 인덱스에 넣을 값_ 값을 담고 변경을 반복
		int sum = 0; // 배열을 순회해서 합을 구하는 변수

		for (int i = 0; i < num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
			value = sc.nextInt();
			arr[i] = value;
		}

		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\n총 합 :" + sum);

	}

	public void practice8() {

		// 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는
		// 1부터 1씩 증가하여 오름차순으로 값을 넣고
		// 중간 이후부터 끝까지 1씩 감소해 내림차순으로 값을 넣어 출력

		boolean isOdd = false;
		int num = 0; // 입력값을 받을 변수

		while (!isOdd) { // 입력값이 홀수이지 않고, 3미만 일때 반복
			System.out.print("정수 : ");
			num = sc.nextInt();
			if (num % 2 == 0 || num < 3) {
				System.out.println("다시 입력하세요. ");
				continue;
			}
			isOdd = true;
		}

		// 변수로 정리
		int[] arr = new int[num];
		int middle = (num / 2) + 1; // 배열의 중간지점
		int value = 1;

		// 1번) 방법
		for (int i = 0; i < num; i++) {
			arr[i] = value;
			value += (i <= middle ? 1 : -1); // 3항 연산자를 활용해서 배열에 값을 넣어줌

		}

		// 2번) 방법
		int value2 = 1;
		for (int i = 0; i <= middle; i++) {
			arr[i] = i + 1;
			// arr[i] = value2++;
		}

		for (int i = middle + 1; i < num; i++) {
			arr[i] = arr[i - 1];
			// arr[i] = value2--;
		}

		/*
		for (int i = 1; i <= (num / 2) + 1; i++) {
			System.out.print(i + " , ");
		}
		
		for (int j = (num / 2); j > 0; j--) {
			System.out.print(j + ((j == 1) ? "" : " , "));
		}
		*/

	}

	public void practice9() {
		// 주문할 수 있는 치킨을 메뉴 배열에 저장
		String[] menu = { "양념", "불닭", "뿌링클", "후라이드", "양념", "고추바사삭" };

		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();

		for (int i = 0; i < menu.length; i++) {
			if (menu[i].equals(chicken)) {
				System.out.println(chicken + "치킨 배달 가능");
				return;
			}

		}
		System.out.println(chicken + "치킨은 없는 메뉴입니다.");

	}
}
