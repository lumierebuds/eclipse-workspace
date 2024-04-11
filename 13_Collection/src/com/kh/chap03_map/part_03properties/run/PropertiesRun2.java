package com.kh.chap03_map.part_03properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
		Properties prop = new Properties();

		// 1. load(InputStream) - properties 파일에 있는 내용을 읽어오기

		try {
			prop.load(new FileInputStream("test.properties"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(prop);
		String list = prop.getProperty("List"); // 속성에 해당하는 값을 가져올 수 있다.
		System.out.println(list);

		// 2. 전체열람 메서드

		Enumeration<?> en = prop.propertyNames();
		// System.out.println(en.nextElement());
		// System.out.println(en.nextElement());
		// System.out.println(en.nextElement());
		// System.out.println(en.nextElement());
		// System.out.println(en.nextElement());
		// System.out.println(en.nextElement());

		while (en.hasMoreElements()) {
			String name = (String) en.nextElement();
			String value = prop.getProperty(name);
			System.out.println(name + " = " + value);
		}

		/*
		 * properties 사용하는 이유 ? 
		 * 내부의 데이터가 모두 (key,value) 문자열이기 때문에 개발자가 아닌 일반관리자가 문서를 다루기 쉬움. 
		 * 프로그램이 가져야하는 기본적인 정보들을 .properties로 저장해두면 데이터를 쉽게 가져올 수 있다. 
		 * 
		 * .xml 사용하는 경우는, 다른 프로그래밍 언어, 다른 프로그램간에 호환성이 좋기 때문에 좀더 자주 사용된다. 
		 * 
		 * 
		 */
	}
}
