package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Object> {

	private String title;
	private String singer;

	public Music() {

	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	/*
	@Override
	public int compareTo(Music o) {
		// TODO Auto-generated method stub
	
		int result = o.singer.compareTo(this.singer);
		return result; // 가수명 기준 내림차순 정렬
	}
	*/

	@Override
	public String toString() {
		return singer + " - " + title;
	}

	// [수정. Comparable<Object>이기 때문에 변경]
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub

		/*
		int result = 0;
		if (o instanceof Music) {
			result = ((Music) o).singer.compareTo(this.singer);
		}
		
		return result; 
		*/

		// [강사님 코드]
		Music m = (Music) o;

		return m.singer.compareTo(this.singer);

	}

}
