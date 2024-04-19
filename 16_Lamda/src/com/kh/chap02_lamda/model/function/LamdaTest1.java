package com.kh.chap02_lamda.model.function;

/* @FunctionalInterface
 * - 함수형 인터페이스를 선언할때 사용하는 어노테이션
 * - 내부적으로 딱 1개의 추상 메서드만 가질수 있음. 
 * - 람다식에서 사용할 인터페이스가 반드시 FunctionalInterface를 써야하는건 아니나, 
 *   추가해두면 추후 컴파일에러를 방지할 수 있음.  
 */

@FunctionalInterface
public interface LamdaTest1 {
	int add(int x, int y); // 실제 코드구현은 람다식으로 구현될 예쩡

	// void print(String x); // 에러발생
}
