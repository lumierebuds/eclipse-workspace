package com.kh.chap01_abstraction.run;

import com.kh.chap01_abstraction.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. 객체지향언어: "객체"를 "지향"하는 언어로 "겍체중심"으로 돌아가는 언어 
		 * 
		 * 2. 객체란 ? 사전적 의미로는 현실세계에 독립적으로 존재하는 모든것.
		 * 			 (유형, 무형, 사물, 개념) 
		 * 			 자바에서의 객체는 new 연산자를 통해 메모리 영역에 생성된 데이터 
		 * 
		 * 3. 객체지향 프로그래밍 : 현실세계에서 독립적인 존재들간의 상호작용을 프로그래밍을 통해 
		 * 	  가상 세계로 구현하는 과정
		 * 
		 * 4. 구현하고자 하는 프로그램에서 필요한 객체를 만들기 위해서는 어떻게 해야하나? 
		 * 	  ex) 쇼핑몰을 만든다고 하면, 브랜드, 상품이라는 객체가 필요함
		 * 	  => 클래스라는 틀을 통해 각 객체가 가지는 공통적인 속성을 추려내야함.
		 *    => 1단계 추상화과정을 진행후, 2단계로 캡슐화과정을 거쳐서 클래스를 생성 
		 *  
		 * 5. 추상화 과정
		 * 	1) 내가 구현하고자 하는 프로그램에서 필요한 객체들이 뭐가 있는지 생각해보기 
		 *     예시) 학생관리 프로그램 => 학생, 생활기록부, 출석부 
		 *    
		 *  2) 그 객체들이 가지고 있는 공통적인 속성, 기능들을 추출해보기 (학생객체기준)
		 *     예시) 이름, 성별, 거주지, 나이, 학년, 전화번호, ....
		 * 	
		 *  3) 추려진 공통적인 속성들을 가지고 구현해야할 프로그램의 "목적"에 맞춰서
		 *     불필요한 속성이나 기능들은 제거하기 
		 *     예시) 
		 *     학생의 “인적사항”을 관리하는 프로그램이라면? 키와 시력은 필요없어보임 
		 *     성적을 관리하는 프로그램이라면? 국어점수, 수학점수등 점수를 이루는 데이터가 
		 *     추가적으로 필요해보임
		 *    
		 *  4) 최종적으로 추려진 속성들을 가지고 어떤 자료형으로, 어떤 변수명으로
		 *     각각의 데이터를 보관할건지 생각해보기 
		 *     이름 => String name;
		 *     나이 => int age; 
		 *     키 => double height; 
		 *     
		 */

		// 학생객체 생성하기

		Student hong = new Student(); // 홍길동 객체 생성
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 180.1;
		System.out.println(hong.name);

		System.out.println(hong);

		Student kim = new Student(); // 김영희 객체 생성
		kim.name = "김영희";
		kim.age = 20;
		kim.height = 165.1;
		System.out.println(kim.name);

		Student jihun = new Student();

		// 본인 학생 객체 생성후, 출력문 출력
		// xxx님의 나이는 xx 살이고, 키는 xxxcm입니다.

		jihun.name = "김지훈";
		jihun.age = 26;
		jihun.height = 167.1;

		System.out.println(jihun.name + "님의 나이는 " + jihun.age + "살이고, 키는 " + jihun.height + "cm입니다.");

		/*
		 * 필드의 접근 제한자를 public 설정시 
		 * 외부에서 값을 변질시키거나, 조회권한이 없음에도 쉽게 값을 확인할 수 있다.
		 * 캡슐화를 통해 직접적인 접근을 막아서, 보안문제를 해결해줘야한다. 
		 */

	}

}
