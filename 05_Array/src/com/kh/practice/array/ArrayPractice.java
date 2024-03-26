package com.kh.practice.array;

import java.util.Arrays;
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

		boolean isTrue = true;
		for (int i = 0; i < menu.length; i++) {
			if (menu[i].equals(chicken)) {
				isTrue = false;
				System.out.println(chicken + "치킨 배달 가능");
				// return; // 메서드 종료시켜서 아래 출력이 안뜨게
			}

		}

		// 메뉴찾기 프로세스 이후 진행해야 될 사항이 있을때
		if (isTrue) {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}

	}

	public void practice10() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		char[] origin = new char[str.length()];
		char[] copy = new char[origin.length];

		for (int i = 0; i < str.length(); i++) {
			origin[i] = str.charAt(i);
		}

		for (int i = 0; i < copy.length; i++) {
			if (i >= 8) {
				copy[i] = '*';
				continue;
			}
			copy[i] = origin[i];
		}

		for (char ch : copy) {
			System.out.print(ch);
		}

	}

	public void practice11() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 10 + 1);
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 10 + 1);
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		// 배열 전체 값과 그 값중에서 최대값과 최소값을 출력

		// 최소값과 최대값을 저장하는 변수
		int min = arr[0]; // 초기값을 0번째 요소로 줘서 이후 인덱스의 값과 비교를 해서 값을 넣음
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

	public void practice13() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			// 0 ~ 9 인덱스까지

			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--; // 현재 위치에서 다시 랜덤값을 넣어준다.
					break;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		// [10, 3, 5, 5 ... 6, 7]
	}

	public void practice14() {

		int[] arr = new int[6]; // (int) (Math.random() * 45 + 1)
		int[] random = new int[45]; // [0, 0, 0, 0, ----,0];

		for (int i = 0; i < arr.length;) {
			int ran = (int) (Math.random() * 45 + 1);

			if (random[ran - 1] == 0) {
				arr[i] = ran;
				random[ran - 1] = 1; // 사용중인 인덱스임을 확인_인덱스 번호를 통해 중복된 수를 확인
				i++;
			}
		}

		Arrays.sort(arr); // 오름차순 정렬 - "이를 응용해서 최소, 최대값을 출력할 수 있다.."
		System.out.println(Arrays.toString(arr)); // 출력

	}

	public void practice15() {

		System.out.print("문자열 : ");
		String str = sc.nextLine(); // application 이라는 문자열로 가정

		char[] origin = str.toCharArray(); // 문자열을 char 배열로 변환해주는 함수
		// a p p l i c a t i o n
		char[] copy = new char[origin.length];
		// , , , , , , ... 아무런 값도 없는 상태
		int copyIndex = 0;

		for (int i = 0; i < origin.length; i++) {

			copy[copyIndex] = origin[i];
			for (int j = 0; j < copyIndex; j++) { // 값이 중복되었는지 확인한다.
				if (copy[j] == origin[i] /* copy[i] */) { // 중복값 찾기 완료.
					copyIndex--;
					break;
				}

			}
			// 중복값이 있는 경우 copy[i] 에는 값추가 x
			copyIndex++;
		}
		System.out.println(Arrays.toString(copy));
		int count = 0;

		// 값 출력을 위한 반복문
		System.out.print("문자열에 있는 문자 :");
		for (int i = 0; i < copy.length; i++) {
			if (copy[i] == '\0') {
				continue;
			}
			System.out.print(copy[i] + ((i != copy.length - 1) ? ", " : ""));
			count++;
		}
		System.out.println("\n문자 개수 : " + count);

	}

	public void practice16() {

		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 개행 문자 제거
		String[] str = new String[size];

		for (int i = 0; i < str.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			String word = sc.nextLine();
			str[i] = word;
		}

		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				// 값을 더 추가할 수 있다.
				System.out.print("더 입력하고 싶은 개수: ");
				int moreSize = sc.nextInt();
				sc.nextLine();

				// 새로운 배열을 선언 - 원래 배열보다 더 입력하고 싶은 개수를 추가해 새로운 배열을 만든다.
				String[] newStr = new String[str.length + moreSize];

				// 새로운 배열에 깊은 복사해줌
				for (int i = 0; i < str.length; i++) {
					newStr[i] = str[i];
				}

				for (int i = str.length; i < newStr.length; i++) {
					// if (newStr[i] != null) continue;
					// 비어있는 인덱스 위치에서부터 값을 초기화
					System.out.print((i + 1) + "번째 문자열 : ");
					newStr[i] = sc.nextLine();
				}
				str = newStr; // 얕은 복사로 주소값을 이전해준다.

			} else {
				// 값을 출력
				System.out.println(Arrays.toString(str));
				break;
			}
		}

	}

}
