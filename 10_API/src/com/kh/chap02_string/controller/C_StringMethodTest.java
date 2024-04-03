package com.kh.chap02_string.controller;

import java.util.Scanner;

public class C_StringMethodTest {

	// 문자열과 관련된 메서드들
	public void method() {
		String str1 = "Hello world";

		// 1. 문자열.charAt(int index) : char
		// 문자열에서 전달받은 index위치의 문자 하나만 뽑아서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);

		// 2. 문자열.concat(String str) : String
		// 문자열과 전달된 다른 문자열을 하나로 합쳐서 리턴.
		String str2 = "!!!".concat(str1).concat("!!!"); // 메서드 체인: 메서드를 연속해서 출력할때
		// str2 = "!!!"+str1+"!!!";
		System.out.println("str2 : " + str2);

		// 3. 문자열.substring(int beginIndex) : String
		// => 문자열의 beginIndex에서 마지막까지의 문자열을 추출하여 반환.
		// 문자열.substring(int beginIndex, int endIndex) : String
		// => 문자열의 beginIndex에서 endIndex까지의 문자열을 추출하여 반환
		// beginIndex <= x <= endIndex

		System.out.println(str1.substring(0, 5).concat("!!!"));

		System.out.println(str1.substring(6));

		// 4. 문자열.length(); 배열.length;
		// 문자열의 길이를 반환.
		System.out.println("str1의 길이 : " + str1.length());

		// 5. 문자열.replace(char old, char new) : String
		// => 문자열에서 old문자를 new문자로 변환한 문자열 리턴
		String str3 = str1.replace('l', 'c');
		System.out.println(str3);

		// 6. 문자열.trim() : String
		// => 문자열의 앞, 뒤 공백을 제거한 문자열 리턴.
		String str4 = "     J A V A       ";
		System.out.println("str4 : " + str4.trim());
		// 로그인, 회원가입시 앞뒤 공백이 있어도 로그인되는기능을 구현할때
		// 사용되는 메서드

		// 7. 문자열.toUpperCase() : String
		// => 문자열 모두 대문자로 변경
		// 문자열.toLowerCase() : String
		// => 문자열 모두 소문자로 변경후 리턴
		// ** 원본 문자열에 영향을 끼치지 않는다. **
		System.out.println("upper : " + str1.toUpperCase());
		System.out.println("lower : " + str1.toLowerCase());

		Scanner sc = new Scanner(System.in);
		System.out.print("종료하시겠습니까?(Y/N) : ");
		char a = sc.nextLine().toUpperCase().charAt(0);
		if (a == 'Y')
			System.out.println("종료합니다.");
		else
			System.out.println("종료하지 않습니다.");

		// 8. 문자열.toCharArray() : char[]
		// => 문자열의 각 문자들을 char[] 배열에 옮겨 담은후 배열 리턴.
		char[] arr = str1.concat("1234").substring(0, 5).toCharArray();
		// Hello world => Hello world1234 => Hello => ['H', 'e', 'l', 'l', 'o']
		System.out.println(arr);

		// 9. static valueOf(char[] data) : String
		// => 전달된 char[]에 담긴 문자들을 하나의 문자열로 합쳐 리턴
		System.out.println(String.valueOf(arr));

	}

}
