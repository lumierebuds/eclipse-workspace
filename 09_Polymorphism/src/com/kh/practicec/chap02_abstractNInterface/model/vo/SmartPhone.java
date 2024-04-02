package com.kh.practicec.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {

	private String maker; // 제조사 정보

	public SmartPhone() {

	}

	public abstract String printinformation();

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

}
