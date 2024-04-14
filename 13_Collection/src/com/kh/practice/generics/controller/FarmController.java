package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.practice.generics.model.vo.Farm;

public class FarmController {
	private HashMap<Farm, Integer> hMap = new HashMap<>();

	private ArrayList<Farm> list = new ArrayList<>();

	public boolean addNewKind(Farm f, int amount) {
		// 전달 받은 f가 hMap 안에 key로 존재하지 않을 때
		if (hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
		}
		return false;
		// f와 amount를 각각 키와 값으로 저장 후 true 반환, 존재할 경우 false 반환.

	}

	public boolean removeKind(Farm f) {

	}

	public boolean changeAmount(Farm f, int amount) {

	}

	public boolean removeFarm(Farm f) {

	}

	public ArrayList<Farm> printBuyFarm() {

	}

}
