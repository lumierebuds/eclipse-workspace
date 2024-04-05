package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class Run {

	/* 
	 * 보조 스트림
	 * 기반 스트림(외부매체와의 연결이 가능한 스트림)의 부족한 기능을 확장시킬 수 있는 스트림
	 * 보조 스트림은 단독으로 사용 불가(단독으로 객체 생성 불가)
	 * 
	 * [표현법] 
	 * 보조스트림 변수명 = new 보조스트림(new 보조스트림(new 기반스트림 객체));
	 * 
	 * 속도 성능 향상 목적의 보조 스트림 : BufferedXXX
	 * ==> 버퍼 공간을 제공해서(8byte) 데이터를 버퍼에 몰아두었다가, 버퍼공간에 데이터가 꽉차면
	 * 한번에 입/출력을 진행.
	 * 
	 * 기반스트림을 통해 스트림을 열고, 보조스트림을 통해 성능을 개선한다. 
	 * 추가성능) 속도 성능 향상, 문자 변환, 객체 변환 ...
	 * 
	 */

	public static void main(String[] args) {
		BufferedDao bd = new BufferedDao();
		bd.fileRead();
	}
}
