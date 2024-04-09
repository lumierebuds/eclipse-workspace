package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList<>();

	public int addList(Music music) {
		list.add(music);
		return 1;

		// [강사님 코드]
		/*
		try {
			list.add(music);
			return 1;
		}
		catch(Exception e) {
			return 0;
		}
		*/
	}

	public int addAtZero(Music music) {
		list.add(0, music); // 0 번째 위치의 값을 바꾸면, 많은 요소가 존재하는 리스트라면 연산의 효율이 좋지 않다.
		return 1;
	}

	public List printAll() {
		return list;
	}

	public Music searchMusic(String title) {
		// 곡명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null 리턴
		Music music = null;
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
				music = m;
			}
		}
		// 객체 검색, 찾으면 해당객체의 정보를 대입
		return music;
	}

	public Music removeMusic(String title) {

		Music remove = null;
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
				remove = m;
			}
		}
		list.remove(list.indexOf(remove));
		return remove;
	}

	public Music setMusic(String title, Music music) {
		Music edit = null;
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
				edit = m;
				list.set(list.indexOf(m), music);
			}
		}
		return edit;
	}

	public int ascTitle() {
		Collections.sort(list, new AscTitle());
		return 1;
	}

	public int descSinger() {
		Collections.sort(list);
		return 1;
	}

}
