package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {

	}

	public int countAlpha(String s) throws CharCheckException {
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		char[] arr = s.toCharArray();
		int count = 0;
		for (char ch : arr) {
			if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) { // 아스키코드값으로 영문자에 해당한다면?
				count++;
			} else if (ch == ' ') { // 문자열 중 공백이 존재하면?
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다."); // 예외발생
			}
		}
		return count;
		// 문자열에 공백이 있다면 CharCheckException 발생 에러메시지는 출력 값 참고
	}
}
