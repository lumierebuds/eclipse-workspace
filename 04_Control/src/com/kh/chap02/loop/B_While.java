package com.kh.chap02.loop;

public class B_While {

	public void method1() {

		// while 문으로 만드는 "안녕하세요" 5번 출력

		int i = 0;
		while (i < 5) { // 0, 1, 2, 3, 4, 5
			System.out.println("안녕하세요.");
			i++;
		}
		// i의 값은 5가 된다.
	}

	public void method2() {
		// 1 2 3 4 5 출력하기

		int i = 1;
		while (i < 6) { /* i<=5 도 가능 */
			System.out.print(i + " ");
			i++;
		}

	}

	public void method3() {

		// 1부터 10 사이의 홀수만 출력

		// 조건을 두가지 방법으로
		// 2로 나눴을때 나누어 떨어지지 않는다면
		int i = 1;
		while (i < 11) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}

		System.out.println();

		// 2로 나눴을때 나머지가 1이 된다면
		int j = 1;
		while (j < 11) {
			if (j % 2 == 1) {
				System.out.print(j + " ");
			}
			j++;
		}

		System.out.println();

		// 초기식 해당하는 변수를 2씩 증가시켜서 출력하기
		int k = 1;
		while (k < 11) {
			System.out.print(k + " ");
			k += 2;
		}
	}

	public void method4() {
		// 1 부터 랜덤값 까지의 총 합계를 구하기
		// 랜덤값 범위 : 1 ~ 100

		// while 문 형식으로 만들기.

		int i = 0;
		int sum = 0;
		int random = (int) (Math.random() * 100 + 1);

		while (i <= random) { // random == 50, 0 ~ 50 까지 차례차례 더해 sum에 저장
			sum += i;
			i++;
		}

		System.out.printf("1부터 %d까지의 합 : %d\n", random, sum);

		// 또 다른 방법) random값을 하나씩 감소시켜서 더해준다.
		sum = 0;
		System.out.printf("1부터 %d까지의 합: ", random);
		while (random > 0) {
			sum += random;
			random--;
		}
		System.out.printf("%d", sum);

	}

	public void method5() {

		int i = 1;

		do {
			System.out.println("한번은 무조건 수행한다.");

		} while (i == 0);
	}

}
