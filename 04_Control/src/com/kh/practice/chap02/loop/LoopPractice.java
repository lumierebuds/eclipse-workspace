package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				// 다시 사용자가 입력을 할 수 있도록 만드세요.
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			// else 문을 안써도 된다.
		}
	}

	public void practice2() {

		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if (num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");
				}
				break;
			} /* else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
				}*/

			System.out.println("1 이상의 숫자를 입력해주세요.");

		}
	}

	public void practice3() {
		// 1부터 사용자에게 입력받은 수까지의 정수들의 합을 출력

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;

		// 1 ~ num 총 합계
		for (int i = 1; i <= num; i++) {
			// System.out.print(i);
			sum += i;
			// i 가 num이랑 같으면
			// 피연산자가 8개 있으면 총 7개의 + 를 붙여주고
			// 마지막에 (i==8)이면 '='을 붙여준다.
			/*
			if (i == num) {
				System.out.print(" = ");
			} else {
				System.out.print(" + ");
			}
			*/

			// 삼항 연산자로 출력
			// 다섯줄 짜리 코드를 한줄로 압축했다. 로직은 동일하다.
			System.out.print(i + (i != num ? " + " : " = "));
		}
		System.out.println(sum);
	}

	public void practice4() {

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice4();
			return;
		}

		// 3항 연산자로 실행
		// 해당 값을 for 문에서 활용
		int start = num1 < num2 ? num1 : num2;
		int end = num1 > num2 ? num1 : num2;

		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		/*
		 while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
		
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			if (num1 >= 1 && num2 >= 1) {
		
				// 첫번째 입력한 수가 더 클때
				if (num1 > num2) {
					for (int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}
		
				}
				// 두번째 입력한 수가 더 클때
				else {
					for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
					}
				}
			System.out.println();
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			continue;
			}
		}*/

	}

	public void practice5() {

		while (true) {
			System.out.print("숫자: ");
			int dan = sc.nextInt();

			if (dan > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			}
			for (int i = dan; i <= 9; i++) {
				System.out.printf("===== %d단 =====\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d x %d = %d\n", i, j, (i * j));
				}
			}
			break;
		}
	}

	public void practice6() {
		System.out.print("시작 숫자 :");
		int first = sc.nextInt();

		System.out.print("공차 : ");
		int differ = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(first + " ");
			first = first + differ;
		}
	}

	public void practice7() {

		// 정수 두개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력
		// 해당 프로그램은 연산자 입력에 'exit'이라는 값이 들어올때까지 무한 반복

		while (true) {

			// 가독성을 위해 줄을 나누어줌
			System.out.println("==============");
			System.out.print("연산자(+, -, *, /, %) :");

			String op = sc.nextLine();

			// 연산자 입력 exit 들어오면 종료
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다. ");
				break;
			}

			System.out.print("정수1: ");
			int num1 = sc.nextInt();

			System.out.print("정수2: ");
			int num2 = sc.nextInt();

			// 연산결과를 저장하는 변수
			int result = 0;

			switch (op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				// 0 으로 나눌때 "나눌수 없음을 알려줌"
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					sc.nextLine();
					continue;
				} else {
					result = num1 / num2;
					break;
				}
			case "%":
				// 문제 조건엔 없지만 나머지 연산도 0으로 나눌때 "오류가 발생할 수 있다."
				result = num1 % num2;
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				sc.nextLine();
				continue;
			}

			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);

			sc.nextLine();
		}

	}

	public void practice8() {
		// 다음과 같은 실행예제 구현

		/*
		    정수 입력 : 4 
			*
			** 
			*** 
			****
		 */

		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice9() {

		// 다음과 같은 실행 예제 구현

		/*
			 정수 입력 : 4 
			 ****
			 *** 
			 ** 
			 *
		 */
		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/* 내가 풀었던 방법 - 잘못된 방법 
	public void practice10() {
		// 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.” 를 출력하세요
	
		// ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
	
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다");
			return;
		}
	
		// 1 ~ num 까지 num을 나눠본다.
		// 1과 num을 제외한 다른 수로 num이 나누어지면 소수가 아니다.
		for (int i = 1; i < num; i++) {
	
			if (i != 1 && i != num) { // i가 1이 아니고 num이 아닐때, 2는 어떻게 할까?
				if (num % i == 0) {
					System.out.println("소수가 아닙니다.");
					break;
				} else {
					System.out.println("소수입니다.");
					break;
				}
			}
		}
	
	}
	*/

	public void practice10() {

		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		// 소수는 1~n까지로 나누었을때 나누어 떨어지는 수가 1과 n뿐인 수
		// n = 6
		// 1 , 2, 3, 6

		// 모든 정수는 당연히 1 과 자기 자신으로는 나누어 떨어진다.
		// 그렇기에 1과 자기자신을 제외하고 반복을 시킨다. (2 ~ n-1)
		// 이 반복에서 해당 수가 나누어 떨어진다면 '소수' 가 아니다.

		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}

		// boolean 값을 활용해서 소수인지 아닌지를 출력한다.
		if (isPrime)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");

	}

	public void practice11() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다");
			return;
		}

		/* 
		// (에라토스테네스의 체)
		// 소수를 찾는 방법중 하나 - 복잡한 코드가 됨
		for (int i = 2; i <= num; i++) {
			if (i == 2) {
				System.out.print(i + " ");
			} else if (i == 3) {
				System.out.print(i + " ");
			} else if (i == 5) {
				System.out.print(i + " ");
			} else if (i == 7) {
				System.out.print(i + " ");
			} else {
				if (i % 2 == 0) {
					continue;
				} else if (i % 3 == 0) {
					continue;
				} else if (i % 5 == 0) {
					continue;
				} else if (i % 7 == 0) {
					continue;
				} else {
					System.out.print(i + " ");
				}
			}
		}
		*/

		// 입력한 수 까지의 소수와 개수를 출력
		// 입력한 수: num
		// 소수 개수: count
		// 입력한 수 범위내에서 이 범위에 해당하는 값들의 소수를 판별한다.

		int count = 0;
		for (int i = 2; i <= num; i++) {
			// 초기에는 소수 - 2로 시작했기 때문에
			boolean isPrime = true;
			// i 값이 소수인지 아닌지 검증
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					// 소수가 아니면 반복을 나옴
					isPrime = false;
					break;
				}
			}
			// 소수일때
			if (isPrime) {
				System.out.print(i + " ");
				count++;
			}

		}
		System.out.printf("\n2부터 %d까지 소수의 개수는 %d개입니다.", num, count);

	}

	public void practice12() {
		// 2와 3의 배수를 모두 출력하고
		// 2와 3의 공배수의 개수를 출력하세요.

		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {
			// 2와 3의 배수 출력
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			// 2와 3의 공배수 개수 출력
			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}

		}

		System.out.println();
		System.out.println("count : " + count);
	}

}
