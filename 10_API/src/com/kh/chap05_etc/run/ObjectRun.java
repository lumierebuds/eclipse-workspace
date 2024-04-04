package com.kh.chap05_etc.run;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectRun {

	/*
	 * 1. Object?
	 * - 모든 클래스의 최상위 클래스
	 * - 모든 클래스는 Object클래스를 상속받음. 따라서 모든 메서드를 사용할 수 있고, 필요에 의해 재정의 할 수 있음.
	 * 
	 * ex) toString()
	 * 		equals() -> Collections 시간에 다뤄볼 예정
	 * 		hashCode() -> Collections 시간에 다뤄볼 예정
	 * 		clone() -> 배열 시간에 사용해봄 
	 * 
	 */

	public static void main(String[] args)
			throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		ObjectRun objectRun = new ObjectRun();
		objectRun.test2();
	}

	public void test1() throws CloneNotSupportedException {
		// clone() 객체의 원본을 복제하는데 사용하는 메서드로, 깊은 복사시 사용.
		// 일반 객체에 clonse 메서드 사용시 클래스에 Cloneable 인터페이스를 명시해줘야함.

		CloneTest ct = new CloneTest();
		CloneTest ct2 = (CloneTest) ct.clone();
		System.out.println(ct == ct2);

	}

	// Class ?
	// 자바의 모든 클래스와 인터페이스들은 컴파일 과정을 거친후 xxx.class 파일로 생성됨.
	// class 파일에는 객체의 정보가 모두 포함되어있음 (필드, 메서드, 생성자 등)
	// Class 클래스는 컴파일된 .class 파일에서 객체의 정보를 가져올때 사용함.

	public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// Class 객체 생성
		// 1) Object 클래스의 getClass() 메서드를 통한 생성
		String string = new String();
		Class c1 = string.getClass();

		// 2) .Class 사용
		Class c2 = String.class;

		// 3) Class.forName("클래스명") 사용
		Class c3 = Class.forName("java.lang.String");

		// 가져온 클래스 정보를 바탕으로 객체 생성.
		String str = (String) c3.newInstance();

		// 가져온 클래스정보를 토대로 멤버변수, 메서드 확인
		Constructor[] cons = c1.getConstructors(); // 가지고 있는 모든 생성자 정보를 가져온다.
		for (Constructor c : cons) {
			System.out.println(c);
		}

		Field[] fields = c1.getFields(); // 가지고 있는 모든 필드정보를 가져온다.
		for (Field f : fields) {
			System.out.println(f);
		}

		Method[] methods = c1.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}

		
		/*
		  Class를 활용한 대표적인 프로그래밍 방식 : reflecton 프로그래밍 
		  Class를 이용하여 클래스의 정보를 가져오고, 인스턴스를 생성하거나,
		  메서드를 호출하는 방식.
		  
		  실제 프로그램이 실행(runtime)중일때, 실행중인 객체의 타입을 알수 없는 경우
		  Class를 통해 객체를 생성하고 객체의 정보를 분석하여, 해당객체의 타입을 알아내는
		  프로그래밍 방식.
		  
		  프레임워크에서 어노테이션을 통한 자동화구조에 사용되었음. 
		 */
		 
	}

}
