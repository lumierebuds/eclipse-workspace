package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.MethodController1;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodController1 mc1 = new MethodController1();
		mc1.method1();
		int random = mc1.random();
		System.out.println(random);
		mc1.sum(random);

		int result = mc1.multiply(random, 10);
		System.out.println(result);

	}

}
