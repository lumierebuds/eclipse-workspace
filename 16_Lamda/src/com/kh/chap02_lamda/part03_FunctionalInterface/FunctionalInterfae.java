package com.kh.chap02_lamda.part03_FunctionalInterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfae {

	/*
	 * 함수형 인터페이스 
	 * - 람다식을 통해 구현되는 추상메서드를 가지고 있는 인터페이스로 내부에 오직 1개의 추상메서드만 가지고 있다. 
	 * - 람다식을 작성하고 호출하기 위한 베이스가되는 함수형 인터페이스들을 자바에서 기본적으로 제공하고 있다. 
	 * 
	 * 람다식을 사용하기 위한 작성
	 * 1) 인터페이스를 작성 -> 추상메서드 1개 작성
	 * 2) 람다식을 작성 -> 익명구현객체를 생성 
	 * 3) 람다식이 적용된 익명구현객체의 메서드 호출 
	 * 
	 * 1)번과정에서 인터페이스를 작성해야하는 번거로움을 줄이기 위해 기본적으로 자바에서 제공하는 함수형 인터페이스들이 있음. 
	 * * 제네릭을 사용해서 람다식 작성에 확장성을 높였다. 
	 * 
	 * 자바 대표 함수형인터페이스등
	 * 	   인터페이스			| 		추상 메서드 
	 * --------------------------------------------
	 *	1. Runnable			| 	run() : void 
	 *  2. Supplier<R>		|	get() : R      // 제네릭
	 *  3. Consumer<T>		| 	accept(T) : void 
	 *  4. Function<T, R>  	| 	apply(T) : R
	 *  5. Predicate<T>		|	test(T) : boolean
	 *  ....
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Runnable
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(new Date());
			}
		};
		r.run();

		// 2. Supplier : 매개변수 x, 리턴값이 있는 람다식을 구현할때 사용함.
		Supplier<Long> supplier = () -> new Date().getTime();
		System.out.println(supplier.get());

		// 랜덤값을 추출하는 람다식
		Supplier<Integer> random = () -> (int) (Math.random() * 100 + 1); // 1~100 사이의 랜덥값.
		Supplier<Integer> random2 = () -> new Random().nextInt(100) + 1; // 1~100 사이의 랜덤값

		// 3. Consumer : 매개변수가 존재하고, 리턴값은 없는 람다식을 구현시 사용함.
		Consumer<String> consumer = name -> System.out.println("이름 : " + name);
		consumer.accept("지훈");

		// 4. Function<T, R> (T) : R : 매개변수도 있고, 리턴값도 있음.
		Function<String, Integer> function = str -> str.length();
		System.out.println("안녕하세요의 길이는? " + function.apply("안녕하세요"));

		// 5. Predicate : 매개변수가 존재하고, 리턴타입이 boolean(조건식을 만들때 자주 사용된다)
		Predicate<Integer> predicate = n -> n % 3 == 0; // true or false 값이 나올것을 생각하고 작성
		int randomNo = random.get();
		int randomNo2 = random2.get();

		System.out.println(randomNo + "은 3의 배수입니까 ? " + predicate.test(randomNo));
		System.out.println(randomNo2 + "은 3의 배수입니까 ? " + predicate.test(randomNo2));

		/*
		 * 실습문제 
		 * 
		 * 위에서 배운 함수형 인터페이스를 활용하여 람다식을 구현해보는 실습
		 * 단, 불필요한 매개변수나 사용되지 않는 반환값이 없도록 인터페이스를 선택. 
		 * - 작업순서 - 
		 * 1) 사용할 인터페이스 선택(매개변수 및 반환형 체크하여 선택) 
		 * 2) 인터페이스 변수 선언 및 랍다식을 통해 익명객체구현
		 * 3) 변수를 통해 추상메서드 실행 
		 * 
		 * 
		 * 
		 * 
		 */

		// 문제 1.현재시각 출력 람다식
		// 출력예시 : 2024-04-19 12:50:00
		// Runnable

		Runnable date = () -> {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String today = sdf.format(new Date());
			System.out.println(today);
		};

		date.run();

		// 문제 2. 오름차순 정렬이 되는 TreeSet객체를 활용하여 6자리 로또번호(1~45)를 생성후 반환해주는 람다식 작성
		// 생성후 반환받은 로또번호를 출력하시오.
		// 출력예시 : [1, 11, 13, 23, 29, 44]
		// Supplier

		Supplier<TreeSet<Integer>> lottery = () -> {
			TreeSet<Integer> set = new TreeSet<>();
			for (int i = 0; i < 6; i++) {
				int num = (int) (Math.random() * 45 + 1);
				boolean result = set.add(num);
				if (!result)
					--i;
			}
			return set;
		};

		TreeSet<Integer> lotteSet = lottery.get();
		System.out.println(lotteSet);

		// 문제 3.환율계산기 : 원화값(정수)을 입력시 달러값(실수)를 리턴해주는 함수
		// (1달러는 1400원 이라고 가정)
		// 출력예시 : xxxx원은 달러로 xxxx.x$입니다.
		// Function

		Function<Integer, Double> exchange = (won) -> {
			double dollar = (double) won / 1400; // 원화를 1400 원으로 나누면 현재환률로 변환된다.
			System.out.print(won + "을 환전하면");
			return dollar;
		};

		Double dollar = exchange.apply(500);
		System.out.printf(" %.6f 달러입니다.", dollar);

	}
}
