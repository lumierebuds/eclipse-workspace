package com.kh.operator;

public class D_LogicalNegigation {

	public void method() {
		System.out.println("true의 부정: " + !true);
		System.out.println("false의 부정: " + !false);

		boolean b = true; // true
		boolean b2 = !b; // false

		// true나 false값이 반환되는 계산식에 자주 사용된다.

		boolean b3 = !(4 < 3);
		
	}
}
