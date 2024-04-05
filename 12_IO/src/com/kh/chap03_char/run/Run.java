package com.kh.chap03_char.run;

import com.kh.chap03_char.model.vo.FileCharDAO;

public class Run {

	public static void main(String[] args) {
		/*
		 * "문자 기반 스트림" 
		 *  외부 매체를 지정하고 그 외부 매체와연결되는 “2byte”짜리 스트림을 만드는 클래스
		 *  xxxWriter/xxxReader 형태의 스트림 
		 */

		FileCharDAO fc = new FileCharDAO();
		fc.fileRead();
	}
}
