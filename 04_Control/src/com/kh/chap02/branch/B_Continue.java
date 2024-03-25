package com.kh.chap02.branch;

/*
 * continue; : 반복문안에서 사용하는 구문
 *			   continue를 만나게 되면 그 뒤쪽에 어떤 코드가 있던 실행하지 않고
 *			   가장 가까운 반복문으로 돌아간다. 
 * 
 */

public class B_Continue {

	public void method1() {

		// 1 3 5 7 9 홀수만 출력하는 프로그램
		// 방법 1) 증감식을 2씩 증가하게 설정
		// 방법 2) 반복문을 1~10까지 순차적으로 돌리고 홀수인 경우만 출력

		int num = 10;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				// i가 2로 나누어 떨어질때(짝수일 경우)
				// continue로 해당 반복을 무시한다.
				continue;
			}
			System.out.print(i + " ");
		}

	}

	public void method2() {
		// 1부터 100까지의 총 합계
		// 단,6의 배수 값은 빼고 더해보기

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0)
				continue;
			sum = sum + i;
			// 다음 코드도 가능
			// if(i % 6 !=0) sum = sum + i;

		}
		System.out.println("총 합계 ? " + sum);
	}

	public void method3() {

		/*
		 * 2단 ~ 9단 출력하긴 하되,
		 * 
		 * 4의 배수단은 빼고 출력하시오. 
		 * 
		 * 각 구구단을 시작할땐 다음과 같은 출력으로 시작하도록 
		 * 
		 * --- 2단 ---
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ....
		 * 
		 * --- 9단 ---
		 * 9 x 1 = 9
		 * 9 x 2 = 18
		 * 9 x 3 = 27
		 * ...
		 */

		for (int i = 2; i <= 9; i++) {
			if (i % 4 == 0) // 4의 배수단은 건너뛰기.
				continue;
			System.out.printf("--- %d단 ---\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}
	}
}
