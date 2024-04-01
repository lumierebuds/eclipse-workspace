package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class Run {
	public static void main(String[] args) {

		// 다형성
		// = 기준으로 왼쪽과 오른쪽의 자료형이 같아야함.

		System.out.println("1. 부모타입 참조변수로 부모 객체를 다루기.");
		Parent p1 = new Parent();
		p1.printParent();

		System.out.println("2. 자식타입 참조변수로 자식타입 객체 다루기.");
		Child1 c1 = new Child1();
		((Parent) c1).printParent(); // 부모객체의 메서드 사용 가능
		c1.printChild1();
		// c1 참조변수로 Parent, Child1 주소값에 접근 가능
		// Parent 클래스의 메서드에 접근시, 자동으로 형변환 되면서 진행됨.
		// 즉, 자식에서 부모클래스 자료형으로 자동형변환이 이루어짐.

		System.out.println("3. 부모타입 참조변수로 자식 객체를 다루는 경우");
		Parent p2 = new Child1();
		// 양쪽의 자료형이 다름에도 불구하고 오류 발생 x.
		// 자식 객체인 Child1이 부모 Parent 자료형으로 "자동형변환" 이 되고 있기 때문
		// 상속구조에서는 클래스간의 형변환이 가능

		p2.printParent();
		((Child1) p2).printChild1();
		// 자동형변환 x - 부모에서 자식으로 넘어갈때는, 자식이 많을 수 있어서
		// 어떤 자식의 메서드를 호출할지를 고르지 못해서

		/*
		 * 클래스간에 형변환 가능(단, 상속구조일때만) 
		 * 
		 * 1. 자동형변환(UpCasting)
		 * - 자식타입에서 부모타입으로 형변환시
		 * - 생략가능(자동형변됨)
		 * - ex) 자식객체.부모메서드(); => (/* (부모자료형) *\/ 자식객체).메서드();
		 * -     부모타입변수 = /* (부모자료형) *\/ 자식객체()
		 * 
		 * 2. 강제형변환(DownCasting) 
		 * - 부모타입에서 자식타입으로 형변환이 필요한 경우 수행.
		 * - 생략 불가능(부모타입변수가 실제로 어떤 자식객체를 가지고 있는지 알수 없으므로)
		 * - ex) ( (자식클래스) 부모 ).자식메서드(); 
		 * 
		 * 
		 * 
		 */

		// 다형성을 모를때
		// Child1 객체 배열, Child2 객체 배열 2개를 관리해야할때

		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(6, 8, 10);

		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5, 7, 2);
		arr2[1] = new Child2(10, 11, 12);

		// 위 코드는 자식 클래스 n개라면 n개의 객체배열이 필요함.
		// 단, 다형성을 안다면 자식클래스가 몇개는 1개의 객체배열로 모두 관리할 수 있음.
		System.out.println("==== 다형성 접목한 객체배열 ====");
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(5, 7, 2);
		arr[2] = new Child1(6, 8, 10);
		arr[3] = new Child2(10, 11, 12);

		// 하나의 부모 타입으로 여러 자식 객체들을 받을 수 있음
		// => 코드 길이 감소, 관리해야할 객체 감소, 생산성 증대, 유지보수 성능이 증대된다.

		// Object x = new Child1(6,8,10); // 자동형변환됨
		System.out.println(new Child1(6, 8, 10)); // Child1 객체는 Object 형변환

		System.out.println("==== 반복문 이용해서 메서드 호출 ====");
		for (Parent p : arr) {

			// 부모타입 참조변수가 실제로 참조하고 있는 자식클래스가 뭔지 알아내는 방법
			// instanceof 연산자로 체크 => true/false
			// => 현재 참조변수가 "실제로" 어떤 클래스타입을 참조하고 있는지 확인할 수있음
//			if (p instanceof Child1) { // p 가 실제로 참조하고 있는 클래스가 Child1인가?
//				((Child1) p).printChild1();
//			} else if (p instanceof Child2) {
//				((Child2) p).printChild2();
//			}
			// ClassCastException: 클래스 형변환이 잘못되었을 경우 발생하는 에

			p.print();
			// 오버라이딩을 이용하면 형변환 없이, 자식클래스에서 재정의된 메서드 호출

			/*
			 * 동적 바인딩 : 프로그램 실행되기전에 컴파일시에는 Parent 타입의 메서드를 가리키나.
			 * 실제 실행시에는 참조하고 있는 자식클래스에 오버라이딩된 메서드를 찾아가서 실행.
			 * (정적으로는 Parent.print() 실행하는 것처럼 보이지만, 실제로 실행될때는 Child.print()
			 * 가 실행됨 
			 */
		}

	}
}
