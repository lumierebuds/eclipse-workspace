package com.kh.practicec.chap02_abstractNInterface.controller;

import com.kh.practicec.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practicec.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practicec.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	private String[] result = new String[2];

	public String[] method() {
		Phone[] phone = new Phone[2];
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		int index = 0;
		// instanceof 활용하기
		for (Phone p : phone) {
			if (p instanceof GalaxyNote9) {
				result[index++] = ((GalaxyNote9) p).printinformation();

			} else if (p instanceof V40) {
				result[index++] = ((V40) p).printinformation();
			}
		}

		return result;

	}
}
