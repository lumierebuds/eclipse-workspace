package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void index() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		
		String str = sc.nextLine();
		System.out.println("첫 번째 문자: "+str.charAt(0));
		System.out.println("두 번째 문자: "+str.charAt(1));
		System.out.println("세 번째 문자: "+str.charAt(2));
		
		char ch1 = str.charAt(0);
		System.out.println(str.charAt(0) == ch1);
		
	}

}
