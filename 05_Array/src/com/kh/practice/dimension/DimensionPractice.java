package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		// 3행 3열 짜리 문자열 배열을 선언 및 할당
		// 인덱스 0행 0열 부터 2행 2열까지 차례대로 접근해 "(0,0)" 과 같은 형식으로 출력
		// "(0, 0)" 같은 형식의 데이터를 넣어준다.

		String[][] sArr = new String[3][3];

		// 초기화와 동시에 출력하기
		for (int row = 0; row < sArr.length; row++) {
			for (int col = 0; col < sArr[row].length; col++) {
				sArr[row][col] = "(" + row + ", " + col + ")";
				System.out.print(sArr[row][col]);
			}
			System.out.println();
		}

		/*
		for (int row = 0; row < sArr.length; row++) {
			for (int col = 0; col < sArr[row].length; col++) {
				System.out.print(sArr[row][col]);
			}
			System.out.println();
		}
		*/
	}

	public void practice2() {
		// 4행 4열짜리 정수형 배열을 선언 및 할당
		// 1 ~16 짜리 값을 차례로 저장
		// 저장된 값을 출력

		// 초기화와 동시에 출력하기
		int num = 1;
		int[][] arr = new int[4][4];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = num++;
				System.out.printf("%2d ", arr[row][col]);
			}
			System.out.println();
		}

		/*
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.printf("%2d ", arr[row][col]);
			}
			System.out.println();
		}
		*/

	}

	public void practice3() {
		// 4행 4열짜리 정수형 배열 선언 및 할당
		// 16~1 짜리 값을 거꾸로 저장
		// 저장된 값을 차례대로 출력

		int[][] arr = new int[4][4];
		// 행과 열의 크기를 이용해 저장할 값 16을 만든다.
		int rowSize = arr.length;
		int colSize = arr[0].length;

		int num = rowSize * colSize;

		// 초기화와 동시에 출력하기
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = num--;
				System.out.printf("%2d ", arr[row][col]);
			}
			System.out.println();
		}

		/*
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.printf("%2d ", arr[row][col]);
			}
			System.out.println();
		}
		*/

	}

	/*
	public void practice4() {
	
		// 4행 4열 2차원 배을 생성
		// 0행 0열 부터 2행 2열까진 1~10 까지임의의 정수 값저장후
		// 보기를 참조해 처리
	
		// 랜덤값을 생성해서 나머지 값을 채우기로 한다.
	
		int[][] arr = new int[4][4];
		int random = 0;
		int sum = 0;
	
		// 2행 2열까지 값을 저장해둔다.
		for (int row = 0; row < arr.length - 1; row++) {
			for (int col = 0; col < arr[row].length - 1; col++) {
				random = (int) (Math.random() * 10 + 1);
				arr[row][col] = random;
			}
		}
	
		// 저장해둔 값을 더해 마지막에 0으로 초기화
		for (int col = 0; col < 3; col++) {
			for (int row = 0; row < 3; row++) {
				sum += arr[row][col];
			}
			arr[3][col] = sum;
			sum = 0;
		}
	
		// 저장해둔 값을 더해 마지막에 0으로 초기화
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				sum += arr[row][col];
			}
			arr[row][3] = sum;
			sum = 0;
		}
	
		// 총합 구하기(행);
		int rowSum = 0;
	
		for (int col = 0; col < 3; col++) {
			rowSum += arr[3][col];
		}
	
		int colSum = 0;
	
		for (int row = 0; row < 3; row++) {
			colSum += arr[row][3];
		}
	
		arr[3][3] = rowSum + colSum;
	
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.printf("%3d ", arr[row][col]);
			}
			System.out.println();
		}
	
	}
	*/

	// [강사님 풀이]
	public void practice4() {

		int[][] arr = new int[4][4];

		// 0행 0열~ 2행 2열까지 값을 넣어 초기화
		/*
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int random = (int) (Math.random() * 10 + 1);
				arr[i][j] = random;
			}
		}
		*/

		// 현재 행의 모든 값을 더해 열에 추가하기
		/*
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				if (j != 3) {
					sum += arr[i][j]; // (0,0), (0,1) (0,2) 와 같은 형태의 값을 더함
				} else {
					arr[i][j] = sum; // (0,3), (1,3), (2,3) 에 sum 값을 대입해준다.
				}
			}
		}
		*/

		/*
		for (int i = 0; i < 4; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				if (j != 3) {
					sum += arr[j][i]; // (0,0), (1,0), (2,0) 와 같은 형태의 값을 더함
				} else {
					arr[j][i] = sum; // (3, 0) ,(3,1), (3,2) (3,3) 에 sum 값을 대입한다.
				}
			}
		}
		*/

		// for문의 반복을 줄이기 위해 하나로 합쳐서 만들어본다.

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int random = (int) (Math.random() * 10 + 1);
				arr[i][j] = random;
				arr[i][3] += arr[i][j]; // 예시) (0, 0) (0,1) (0, 2) 의 값을 더해 (0,3)에 넣는다.
				arr[3][j] += arr[i][j]; // 예시) (0, 0) (1,0) (2, 0) 의 값을 더해 (3,0) 에 넣는다.
				arr[3][3] += arr[i][j] * 2; //
			}
		}

		for (int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

	/*
	public void practice5() {
	
		while (true) {
			System.out.print("행 크기 :");
			int row = sc.nextInt();
	
			System.out.print("열 크기 :");
			int col = sc.nextInt();
	
			if ((row < 0 || row > 10) || (col < 0 || col > 10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야합니다. ");
				continue;
			}
	
			char[][] arr = new char[row][col];
	
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					// (int) Math.random() * (최댓값-최소값+1) + 최소값
					int random = (int) (Math.random() * (90 - 66 + 1) + 64);
					arr[i][j] = (char) random;
				}
			}
	
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			break;
		}
	
	}
	*/

	// [강사님 풀이]

	public void practice5() {

		System.out.print("행 크기 : ");
		int row = sc.nextInt();

		System.out.print("열 크기 : ");
		int col = sc.nextInt();

		if (!(row >= 1 && row <= 10 && col >= 1 && col <= 10)) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			practice5();
			return;
		}

		char[][] arr = new char[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				// 'A' == 65 ~ 90
				// 'Z' == 90
				// 0.0 <= x <1.0
				// 0.0 <= 26.0
				// 65.0 <= x <=90.9999
				// 65 <= x <= 90
				arr[i][j] = (char) ((int) (Math.random() * 26 + 65));
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		/*
		for (int col = 0; col < strArr[0].length; col++) {
			for (int row = 0; row < strArr.length; row++) {
				System.out.print(strArr[row][col] + " "); // (0,0) (1,0), (2,0) ... ()
			}
			System.out.println();
		}
		*/
		// [강사님 풀이]

		for (int row = 0; row < strArr.length; row++) {
			for (int col = 0; col < strArr[row].length; col++) {
				System.out.print(strArr[col][row] + " ");
			}
			System.out.println();
		}

	}

	/*
	public void practice7() {
		System.out.print("행의 크기 :");
		int row = sc.nextInt();
		char[][] arr = new char[row][];
	
		for (int i = 0; i < row; i++) {
			System.out.print(i + "행의 열 크기 : ");
			int sizeRow = sc.nextInt();
			arr[i] = new char[sizeRow]; // 가변 배열: 2차배열의 해당 인덱스에 새로운 배열을 생성
		}
	
		char ch = 'a';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch++;
			}
		}
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	*/

	// [강사님 풀이]
	public void practice7() {
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();

		char[][] arr = new char[row][];
		for (int i = 0; i < row; i++) {
			System.out.print(i + "행의 열 크기 : ");
			// int col = sc.nextInt();
			arr[i] = new char[sc.nextInt()];
		}

		char ch = 'a';
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (ch > 'z') {
					ch = 'a'; // 알파벳을 벗어났을때 다시 a로 초기화
				}
				arr[i][j] = ch++; // a, b, c, d, e ...
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/*
	public void practice8() {
	
		// 1차원 배열에 12명의 학생들을 출석부 순으로 초기화
	
		String[] studentName = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
	
		// 3행 2열으로 2차원 배열 '2개'를 이용해 분단을 나눠서 배치
	
		String[][] one = new String[3][2];
		String[][] two = new String[3][2];
	
		int num = 0;
		for (int row = 0; row < one.length; row++) {
			for (int col = 0; col < one[row].length; col++) {
				one[row][col] = studentName[num++]; // 0, 1, 2, 3, 4, 5, 6 번째 인덱스의 값이 들어감
			}
		}
	
		for (int row = 0; row < two.length; row++) {
			for (int col = 0; col < two[row].length; col++) {
				two[row][col] = studentName[num++]; // 7, 8, 9, 10, 11 번째 인덱스의 값이 들어감
			}
		}
	
		int bundan = 1;
	
		System.out.printf("== %d분단 ==\n", bundan++);
		for (int i = 0; i < one.length; i++) {
			for (int j = 0; j < one[i].length; j++) {
				System.out.print(one[i][j] + " ");
			}
			System.out.println();
		}
		System.out.printf("== %d분단 ==\n", bundan);
	
		for (int i = 0; i < two.length; i++) {
			for (int j = 0; j < two[i].length; j++) {
				System.out.print(two[i][j] + " ");
			}
			System.out.println();
		}
	}
	*/

	// [강사님 풀이]
	public void practice8() {

		String[] arr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		// 2열 3행짜리 두개의 2차원 배열

		String[][] first = new String[3][2];
		String[][] second = new String[3][2];

		for (int i = 0; i < arr.length; i++) {
			// i의 값을 기준으로 값을 넣어준다.
			if (i < 6) {
				// 행 : i / 2 => 0 ,1, 2
				// 열 : i % 2 => 0, 1
				first[i / 2][i % 2] = arr[i];
			} else {
				int j = i - 6;

				second[j / 2][j % 2] = arr[i];
			}
		}

		System.out.println("== 1분단 == ");
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < first[i].length; j++) {
				System.out.print(first[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 == ");
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < second[i].length; j++) {
				System.out.print(second[i][j] + " ");
			}
			System.out.println();
		}

	}

	// [강사님 풀이]
	public void practice9() {
		String[] arr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		// 2열 3행짜리 두개의 2차원 배열

		String[][] first = new String[3][2];
		String[][] second = new String[3][2];

		for (int i = 0; i < arr.length; i++) {
			// i의 값을 기준으로 값을 넣어준다.
			if (i < 6) {
				// 행 : i / 2 => 0 ,1, 2
				// 열 : i % 2 => 0, 1
				first[i / 2][i % 2] = arr[i];
			} else {
				int j = i - 6;

				second[j / 2][j % 2] = arr[i];
			}
		}

		System.out.println("== 1분단 == ");
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < first[i].length; j++) {
				System.out.print(first[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 == ");
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < second[i].length; j++) {
				System.out.print(second[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("============================");
		System.out.print("검색할 학생의 이름을 입력하세요 : ");
		String student = sc.nextLine();

		String 분단 = "";
		String 줄 = "";
		String 방향 = "";

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (first[i][j].equals(student)) {

					분단 = "1";
					줄 = (i == 0) ? "첫" : (i == 1) ? "두" : "세";
					방향 = (j == 0) ? "왼쪽" : "오른쪽";
				} else if (second[i][j].equals(student)) {
					분단 = "2";
					줄 = (i == 0) ? "첫" : (i == 1) ? "두" : "세";
					방향 = (j == 0) ? "왼쪽" : "오른쪽";
				}
			}
		}
		System.out.print("검색하신 " + student + " 학생은 " + 분단 + "분단 " + 줄 + " 번째 줄 " + 방향 + "에 있습니다.");
	}

	// [강사님 풀이]
	public void practice10() {
		// String 2차원 배열 6행 6열을 만들고

		String[][] arr = new String[6][6];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = ""; // 배열의 모든 요소를 "빈문자열로 초기화"
			}
		}

		for (int i = 1; i < 6; i++) {
			arr[0][i] = i - 1 + ""; // (0,0) 을 제외해서 각각의 인덱스를 저장한다.
			arr[i][0] = i - 1 + "";
		}

		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();

		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();

		arr[row + 1][col + 1] = "X";

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2s", arr[i][j]);
			}
			System.out.println();
		}

	}

	public void practice11() {
		// String 2차원 배열 6행 6열을 만들고

		String[][] arr = new String[6][6];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = ""; // 배열의 모든 요소를 "빈문자열로 초기화"
			}
		}

		for (int i = 1; i < 6; i++) {
			arr[0][i] = i - 1 + ""; // (0,0) 을 제외해서 각각의 인덱스를 저장한다.
			arr[i][0] = i - 1 + "";
		}

		while (true) {
			System.out.print("행 인덱스 입력 : ");
			int row = sc.nextInt();
			if (row == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.print("열 인덱스 입력 : ");
			int col = sc.nextInt();

			arr[row + 1][col + 1] = "X";

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("%2s", arr[i][j]);
				}
				System.out.println();
			}
		}

	}

}
