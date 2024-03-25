package com.kh.array;

import java.util.Scanner;

public class A_Array {

	/*
	 * 
	 * 변수: 하나의 공간에 하나의 값만 담을 수 있었다.
	 * 
	 * 배열: 하나의 공간에 여러개의 값을 담을 수 있다. (단, "같은 자료형의 값"으로만 담을 수 있음) 
	 * 	    배열의 각 인덱스 자리에 실제 값들을 한개씩 담을수 있음. 
	 * 		(인덱스는 0부터 시작) 
	 * 		ex) int[] arr = new int[배열의 길이];	// int형 자료가 들어갈 수 있는 배열을 생성 
	 * 		// 만약 배열의 길이가 3이다? [0], [1], [2] 
	 * 		// 배열의 크기 = 3, 마지막 인덱스 = 2 
	 * 		// 배열의 크기 = n, 마지막 인덱스 = n-1 
	 * 			
	 */

	public void method1() {
		// 배열을 사용하면 왜 좋은지 ??
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		// 각각의 값을 별도의 변수로 나눠서 보관함.

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);

		/*
		 * 배열을 가지고 정수값들을 관리한다면? 
		 * 1. [표현법] 
		 * 
		 * 자료형 [] 배열명; 
		 * 자료형 배열명[]; 
		 * 
		 *  int a; 변수선언
		 *  int[] a; 배열선언
		 *  int a[]; 배열선언
		 *  
		 *  2. 배열할당 
		 *  선언한 배열에 몇개의 값들을 보관할건지 배열의 "크기"를 지정하는 과정.
		 *  지정한 갯수만큼 값이 들어갈 공간이 할당된다. 
		 * 
		 *  배열명 = new 자료형[배열크기];
		 *  
		 *  배열 선언 및 할당 
		 *  int[] arr = new int[5];
		 *  0 1 2 3 4의 인덱스가 존재한다. 
		 */

		// 배열의 큰 장점: 반복문 사용
		int[] num = new int[5];

		for (int i = 0; i < 5; i++) { // 0 1 2 3 4
			num[i] = i;
			System.out.println(num[i]);
		}
		System.out.println(num);

		/*
		 * [I@626b2d4a
		 * [ => [배열]
		 * I = int형 자료형
		 * @구문자 
		 */
	}

	public void method2() {
		int[] arr; // stack 영역에 저장

		arr = new int[3];
		// new 키워드가 붙은 배열은 항상 heap 영역안에 생성.
		// heap 영역안에 크기 3짜리 저장공간 할당
		// 생성된 주소값을 arr에 저장

		// 단, heap 메모리 영역안에서 빈값은 존재할 수 없으므로,jvm은 생성된 각 저장공간에
		// 해당 자료형에 맞는 기본값을 넣은 상태로 생성시킨다.

		System.out.println("arr: " + arr); // 주소값;
		System.out.println("arr의 0번 인덱스에 들어가 있는 값 : " + arr[0]); // 인덱스에 들어있는 값

		System.out.println("arr의 십진수 :" + arr.hashCode());
		// 해시코드: 주소값을 10 진수 형태로 변환

		double[] dArr = new double[2];
		// dArr[0] = 0.0

		String[] sArr = new String[3];
		// sArr[0] = null

		char[] cArr = new char[2];
		// cArr[0] = \0

		System.out.println("dArr[0] : " + dArr[0]);
		System.out.println("sArr[0] : " + sArr[0]);
		System.out.println("cArr[0] : " + cArr[0]);

	}

	public void method3() {
		int[] iArr = new int[3]; // 0, 1, 2

		/*
		for (int i = 0; i < 4; i++) {
			System.out.println(iArr[i]); // iArr[3] 인덱스에 접근시 에러가 발생
		}
		*/

		// 배열의 크기를 얻어오는 방법.
		System.out.println("iArr배열의 크기 : " + iArr.length);
		System.out.println("문자열의 크기 : " + "abcdef".length());
		for (int i = 0; i < iArr.length; i++) {
			// x번째 인덱스에 들어가 있는 값: x
			System.out.printf("%d번째 인덱스에 들어가 있는 값: %d\n", i, iArr[i]);
		}
	}

	public void method4() {
		int[] arr = new int[5];

		/*
		 * arr[0] = 1; 
		 * arr[1] = 2; 
		 * arr[2] = 3; 
		 * arr[3] = 4; 
		 * arr[4] = 5; 
		 * int 형 arr 변수에 값을 넣어 초기화 
		 */

		/* 반복문을 통해 초기화 */

		for (int index = 0; index < arr.length; index++) {
			arr[index] = index + 1;
			System.out.print(arr[index] + " ");
		}

		System.out.println();
		/*
		 * arr[0] = 2;
		 * arr[1] = 4; 
		 * arr[2] = 6; 
		 * arr[3] = 8;
		 * arr[4] = 10; 
		 * 
		 */

		int value = 2;
		for (int i = 0; i < arr.length; i++) {
			// arr[i] = (i + 1) * 2;
			arr[i] = value;
			value += 2;
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		/* 
		 * 배열의 단점: 한번 지정한 크기는 변경이 불가능하다. 
		 * => 배열의 크기를 변경하고자 한다면 새로운 배열을 다시 생성해줘야한다. 
		 * 
		 */

		System.out.println("변경전 주소값: " + arr.hashCode());
		arr = new int[7]; // 크기 7짜리 배열을 다시 선언(새로운 주소가 생성 )

		/*
		 * 
		 * 기존에 참조하고 있던 주소값은(배열데이터) heap 영역 내부를 점유하다가, 일정시간이
		 * 지나면 가비지 컬렉터(GC)가 삭제시켜준다. : 자동 메모리 관리
		 * 자바의 자동메모리 관리때문에, 개발자는 코드 작성에만 신경 쓸 수 있게 해준다. 
		 * 
		 */

		System.out.println("변경후 주소값: " + arr.hashCode());

		System.out.println(arr[0]); // 이전 데이터 유지가 안된다.

		// 현재 연결고리를 강제로 끊고자 한다면?
		arr = null; // null: 존재하지 않음을 의미

		System.out.println(arr[0]);
		// NullPointerException
		// null 값을 가진 상태에서 함수호출, 특정 인덱스에 접근시 에러발생

	}

	public void method5() {
		// 배열의 선언과 할당 => 배열의 크기 지정
		int[] arr = new int[4]; // 크기 지정
		arr[0] = 1; // 각 인덱스에 값 초기화
		arr[1] = 2;

		// 배열 선언 및 할당과 동시에 초기화까지 한방에 끝내는 방법
		// 방법1.
		int[] arr1 = new int[] { 1, 2, 3, 4 };

		// 방법2. (권장)
		int[] arr2 = { 1, 2, 3, 4 }; // 배열생성 단축구문
		System.out.println(arr1 == arr2);
		// == 주소값과 주소값간의 동등비교를 수행하므로
		// false가 나옴
	}

	public void method6() {
		// 사용자에게 문자열 하나 입력받은 후,
		// 각 각의 문자들을 char 배열에 옮겨담기

		// ex) apple -> {'a', 'p', 'p', 'l', 'e'}

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");

		String str = sc.nextLine();

		// char 배열 생성
		// 입력받은 문자열의 크기로 char 배열 생성
		char[] ch = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			// char 배열에 인덱스별로 문자열에서 값을 추출해 대입

		}

		for (char character : ch) {
			System.out.print(character + "  ");
		}

		// str.toCharArray();
	}

	public void method7() {
		// 1. 직접 배열의 길이를 입력한 후, 그 크기만큼의 정수배열을 선언
		// 2. 반복문을 활용하여 0번 인덱스 ~ 마지막 인덱스 까지 순차적으로 값 대입
		// (랜덤값 1~100 사이)
		// 3. 반복문을 활용하여, 0~마지막 인덱스까지 배열에 담긴값을 출력함과 동시에,
		// 4. 담긴값이 짝수인 경우 짝수의 총합 구하기.

		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이를 입력해주세요: ");

		int length = sc.nextInt();
		int[] iArr = new int[length];

		int sum = 0;

		for (int i = 0; i < iArr.length; i++) {
			int random = (int) (Math.random() * 100 + 1);
			iArr[i] = random;
		}

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
			if (iArr[i] % 2 == 0) {
				sum += iArr[i];
			}
		}
		System.out.println("짝수의 합: " + sum);

	}
}
