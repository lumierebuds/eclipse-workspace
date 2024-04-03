package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {

	}

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");

		String result = "";
		while (st.hasMoreTokens()) {
			result += st.nextToken();
		}
		return result;

	}

	public String firstCap(String input) {

		String[] arr = input.split(""); // a p p l i c a t i o n
		arr[0] = arr[0].toUpperCase();

		String join = String.join("", arr);
		return join;

		// [강사님 코드]
		/*
		char ch = input.toUpperCase().charAt(0); // application => APPLICATION => A
		String str = input.substring(1); // A + pplication
		return ch + str;
		*/

		/* return input.toUpperCase().substring(0, 1) + input.substring(1); */
	}

	public int findChar(String input, char one) {

		String[] arr = input.split("");
		int count = 0;
		for (String s : arr) {
			if (s.charAt(0) == one) {
				count++;
			}
		}

		// [강사님 코드]
		/*
		char[] arr = input.toCharArray();
		int count = 0;
		for (char ch : arr) {
			if (ch == one) {
				count++;
			}
		}
		*/

		return count;

	}

}
