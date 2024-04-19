package com.kh.chap02_lamda.part04_methodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {

	/*
	 * 람다식의 메소드 참조(Method Reference) 
	 *  - 람다식 구분중 메소드 호출 후 값을 바로 반환하는 구문을 더욱 간결하게 표현하기 위해 사용한다. 
	 *    예시) (String str) -> str.length();
	 *  
	 *  - 람다식을 통해 구현한 기능이 이미 정의되어있는 클래스의 다른 메서드와 일치하는 경우, 전체 코드작성을 직접하지 않고 
	 *    그 다른 메서드의 이름만 추가시키는 형태로 작성하는 구문. 
	 *    (String str) -> str.length(); 메서드 참조로 변경시  (String str) -> str.length(); ===> String::length
	 * 
	 *  - 메서드 참조 사용방법 및 종류 
	 *    1. static 메서드 참조 
	 *    2. 일반 메서드 참조
	 *    3. 객체 메서드 참조 
	 *    4. 생성자 참조 
	 *    
	 *  - 메서드 참조문은 별도의 실행기능이 있는것은 아니고 컴파일러에 의해 class 파일로 저장될때 해당 메서드를 참조하여 다시한번 람다식으로 변환
	 *    String::length --> (String str) -> str.length();
	 *  - 메서드 참조문 사용시 람다식을 더 간결하게 볼수 있고, 메서드 재사용성을 증가시킬 수 있음.
	 *  
	 */

	public static void main(String[] args) {
		// Consumer<String> printer = s -> System.out.println(s);
		Consumer<String> printer = System.out::println;
		printer.accept("java is fun");

		// 1. static 메서드 참조
		// Function<String, Integer> intParser = (str) -> Integer.parseInt(str);
		Function<String, Integer> intParser = Integer::parseInt;
		System.out.println(intParser.apply("123456789"));

		// 2. 일반 메서드 참조
		// 1) String length() : 문자열의 길이를 구하는 함수
		// Function<String, Integer> strLength = str -> str.length();
		Function<String, Integer> strLength = String::length;
		String str = "자바는 재밌어";
		System.out.println(strLength.apply(str));

		// 2) String.equals() : s1.equals(s2)
		BiFunction<String, String, Boolean> strEquals = String::equals;

		// 3) 객체 메서드 참조
		String title = "소나기";
		// Predicate<String> equalsToTitle = s -> title.equals(s);
		Predicate<String> equalsTotitle = title::equals;
		System.out.println(equalsTotitle.test("소나기"));

		// 4) 생성자 메서드 참조
		class Person {
			private String name;
			private int age;

			public Person() {

			}

			public Person(String name) {
				this.name = name;
			}

			public Person(String name, int age) {
				this.name = name;
				this.age = age;
			}

			@Override
			public String toString() {
				return "Person [name=" + name + ", age=" + age + "]";
			}

		}

		// Supplier<Person> personConstr = () -> new Person();
		Supplier<Person> personConstr = Person::new;

		System.out.println(personConstr.get());
		// 매개변수가 2개이면서 Peroson 객체를 생성해서 반환해주는 람다식
		// BiFunction<String, Integer, Person> personCounst2 = (name, age) -> new
		// Person(name, age);
		BiFunction<String, Integer, Person> personCounst2 = Person::new;
		System.out.println(personCounst2.apply("지훈", 25));

		Function<String, Function<Integer, Person>> personConsrt3 = (String name) -> {
			return (Integer age) -> {
				return new Person(name, age);
			};
		};

		Function<String, Function<Integer, Person>> personConsrt4 = name -> age -> new Person(name, age);

		// 컬렉션 내부에 적용된 람다식들
		List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println(list);

		// 컬렉션 내부에서 특정요소를 삭제해주는 메서드
		list.removeIf((n -> n % 2 == 0));
		System.out.println(list);

		// 컬렉션의 특정 요소를 변경
		list.replaceAll(n -> n * 100); // 원본값에 곱하기 100을 한값을 반환해준다.
		System.out.println(list);

		// 컬렉션의 모든 요소 순회
		list.forEach(System.out::println);
		// list.forEach((i) -> System.out.println(i));

	}
}