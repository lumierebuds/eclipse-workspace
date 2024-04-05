package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;
import com.kh.chap04_assist.part02_object.model.dao.ObjectsDao;

public class Run {

	public static void main(String[] args) {
		// 객체단위로 입출력 할 수 있는 기능을 제공하는 보조스트림.
		ObjectDao od = new ObjectDao();
		// od.fileSave(); // 클래스를 외부로 내보내는것을 캡슐화 원칙에 의해 막고 있다.
		// od.fileRead();

		ObjectsDao ods = new ObjectsDao();
		ods.fileRead();

	}
}
