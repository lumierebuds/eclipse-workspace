package com.kh.chap01_list.part01_arrayList.model.vo;

public class Music implements Comparable<Music> {
	private String title;
	private String artist;

	public Music() {

	}

	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public int compareTo(Music o) {
		// TODO Auto-generated method stub
		// 값과 값간의 비교, 현재 객체(this)와 매개변수로 들어온 객체(Music o) 중 뭐가 더 큰지?

		/*
		 * 양수 : 자리유지 
		 * 0   : 자리유지
		 * 음수 : 자리바꿈 
		 */
		int result = this.title.compareTo(o.title); // -음수, 0, +양수
		if (result == 0) { // 제목이 같다면?
			result = this.artist.compareTo(o.artist); // 아티스트기준 오름차순 정렬
			// this(현재객체가 앞에오면) 오름차순, 매개변수로 들어가면 내림차순
		}
		o.title.compareTo(this.title); // 내림차순 정렬됨.
		return result;
	}

}
