package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareTo(o2.getTitle()); // 제목기준 오름차순 정렬;
	}

}
