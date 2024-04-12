package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>(); // 추첨자
	private HashSet<Lottery> win = new HashSet<>(); // 당첨자

	public boolean insertObject(Lottery l) {
		// 전달 받은 l을 lottery에 추가 후, 추가 결과인 boolean 값 반환
		return lottery.add(l);
	}

	public boolean deleteObject(Lottery l) {

		// 전달 받은 l을 lottery에서 삭제
		boolean result = lottery.remove(l); // 성공하면 true, 실패하면 false 반환

		// 당첨자 목록(win) 중에 삭제된 추첨 대상자가 존재할 수 있으니
		if (!win.isEmpty() && result) { // 당첨자 목록이 비어있지 않다면
			// 삭제 결과인 boolean 값과 win객체가 비어있지 않을 때에만
			// win에도 해당 추첨 대상자 삭제
			win.remove(l);
		}

		return result;

	}

	public HashSet winObject() {

		// 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록(win)에 넣는 메소드

		ArrayList<Lottery> list = new ArrayList<>();

		// 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,
		list.addAll(lottery);

		if (list.size() < 4) {
			return null; // 추첨자수가 4명보다 적은 경우, 추첨 불가.
		}

		/* [내가 쓴 코드 with GPT] 
		int i = 0;
		while (i < 4) {
			int random = (int) (Math.random() * list.size() + 1);
			Lottery winner = list.get(random);
			if (!lottery.contains(winner)) {
				continue;
			}
			win.add(winner);
			i++;
		}
		*/

		// [강사님 코드]
		// 1) shuffle 함수 이용
		/*
		Collections.shuffle(list);
		for (int i = 0; i < 4; i++) {
			win.add(list.get(i));
		}
		*/

		// 2) Math.random()
		for (int i = 0; i < 4; i++) {
			// 인덱스를 이용해 win에 당첨자 저장
			int randomIndex = (int) (Math.random() * list.size() - 1); // 0 <= x <= size-1
			Lottery l = list.get(randomIndex);

			if (win.size() >= 4) {
				break;
			}

			boolean result = win.add(l);
			if (result == false) { // 값이 중복된 경우
				i--;
			}
		}
		return win;
	}

	public TreeSet sortedWinObject() {
		winObject();

		/*
		class SortedLottery implements Comparator {
		
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		}*/

		// TreeSet<Lottery> ts = new TreeSet(new SortedLottery()); // 메서드 클래스로 정렬기준 설정

		TreeSet<Lottery> ts = new TreeSet(new Comparator<Lottery>() {
			@Override
			public int compare(Lottery o1, Lottery o2) {
				// TODO Auto-generated method stub
				int result = o1.getName().compareTo(o2.getName());
				if (result == 0) {
					result = o1.getPhone().compareTo(o2.getPhone());
				}
				return result;
			} // 익명 클래스로 정렬기준 설정

		});

		ts.addAll(win);

		return ts;

		// 이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는
		// 정렬기준을 가지고 정렬된 결과를 반환

		// 이 때, 미리 만들어진 win을 가지고 정렬하기 때문에
		// 당첨 대상 확인을 꼭 먼저 해야함
	}

	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
