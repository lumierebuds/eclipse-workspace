package com.kh.practicec.chap02_abstractNInterface.run;

import com.kh.practicec.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String[] arr = pc.method();
		for (String str : arr) {
			System.out.println(str);
		}
	}
}
