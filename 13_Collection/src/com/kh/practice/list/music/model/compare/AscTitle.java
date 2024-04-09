package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Object> {

	/*
	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareTo(o2.getTitle()); // 제목기준 오름차순 정렬;
	}
	*/

	// [수정. Comparable<Object>이기 때문에 변경]
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int result = 0;
		if (o1 instanceof Music && o2 instanceof Music) {
			result = ((Music) o1).getTitle().compareTo(((Music) o2).getTitle());
		}
		return result;
	}

}
