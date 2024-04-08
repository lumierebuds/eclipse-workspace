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
	}

	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}

	public List printAll() {
		return list;
	}

	public Music searchMusic(String title) {
		Music music = null;
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
				music = m;
			}
		}
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
