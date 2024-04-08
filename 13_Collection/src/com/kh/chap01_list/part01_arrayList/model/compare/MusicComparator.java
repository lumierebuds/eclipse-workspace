package com.kh.chap01_list.part01_arrayList.model.compare;

import java.util.Comparator;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class MusicComparator implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		// o1 vs o2 => 오름차순 정렬
		// o2 vs o1 => 내림차순 정렬

		return o2.getTitle().compareTo(o1.getTitle()); // 제목기준 내림차순
	}

}
