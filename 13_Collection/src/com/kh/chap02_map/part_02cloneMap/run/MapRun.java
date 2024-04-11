package com.kh.chap02_map.part_02cloneMap.run;

import com.kh.chap02_map.part_01hashMap.model.vo.Snack;

public class MapRun {

	class Entry {
		String key;
		Snack value;
		Entry next;

		public Entry(String key, Snack value, Entry next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	private Entry[] table;
	private int capacity;
	private int size;

	public MapRun(int capacity) {
		this.capacity = capacity;
		table = new Entry[capacity];
	}

	public static void main(String[] args) {

		MapRun mr = new MapRun(10);
		mr.put("다이제", new Snack("초코맛", 1500));
		mr.put("다이제", new Snack("초코맛", 1500));
		mr.put("칸쵸", new Snack("단맛", 600));
		mr.put("새우깡", new Snack("짠맛", 500));
		mr.put("포테이토칩", new Snack("짠맛", 3000));
		mr.put("칸쵸", new Snack("단맛", 700));

		System.out.println(mr);
		System.out.println(mr.size());
		System.out.println(mr.get("칸쵸"));
		System.out.println(mr.get("포테이토칩"));
		System.out.println(mr.get("새우깡"));
		System.out.println(mr.get("새"));
		System.out.println(mr.get("포테"));
		System.out.println(mr.get("까마"));
		System.out.println(mr.containsKey("포테이토칩"));
	}

	public int getIndex(String key) {
		// 매개변수로 전달받은 key값을 hashCode()로 변환시킨후
		// 객체의 총 저장공간 수(capacity)만큼 나눈 결과값을 반환하는 함수.
		// return key.hashCode() % capacity;

		return Math.abs(key.hashCode()) % capacity;
	}

	public void put(String key, Snack value) {

		// getIndex함수 호출후 반환값으로 table의 index에 접근
		int index = getIndex(key);
		Entry e = table[index];

		Entry newEntry = new Entry(key, value, null);
		if (e == null) {
			// 접근시 내부의 값이 null이라면 Entry매개변수 있는 생성자를 이용하여
			table[index] = newEntry;
			// 객체생성후 비어있는 저장공간에 Entry객체 추가하기.
			// ex) 최초 Entry 객체 생성시 : new Entry(key, value , null)
		} else {

			// 값이 null이 아니라면 , entry에 저장된 key값과 새롭게 추가하려는 entry의
			// key값이 동일한지 검사후 동일하다면 , 중복값이므로 value값만 덮어씌우고
			if (e.key.equals(newEntry.key)) {
				e.value = newEntry.value;
				return; // size 추가 `안되게 종료.
			} else {
				while (true) {
					if (e.next == null) {
						e.next = newEntry;
						break;
					}
					// next로 뽑은 entry값도 key값이 일치하는지 비교.
					if (e.key.equals(newEntry.key)) {
						e.value = newEntry.value;
						return; // size 추가 `안되게 종료.
					}

					e = e.next; // 현재 entry에 next값을 저장. 계속 다음 주소에 존재하는지 확인하기 위해서 작성한 코드
				}

			}
			// key값이 다르다면 현재 entry의 next요소에 entry객체 저장.
			// 만약 next에도 이미 값이 존재하는경우, next가 없는 entry를 찾을때까지 반복
			// 중복값을 제외하고, 값이 새롭게 추가된경우 size 증가
		}

		size++;

	}

	public Snack get(String key) {

		// getIndex함수 호출후 반환값으로 table의 index에 접근
		int index = getIndex(key);
		Entry e = table[index];

		if (e == null) {
			return null;
		}
		// 접근시 내부의 값이 null이라면 null값 반환

		// 객체가 있다면 저장된 객체의 key값과 매개변수로 전달받은 key값 확인
		// 동일하다면 객체에 저장된 value값 반환.
		if (e.key.equals(key)) {
			return e.value;
		}

		// 동일하지 않다면 노드드의 next 값을 찾아 다시한번 검사 (next가 존재하지
		// 않을때까지 반복). 다음 노드들 중에서 key값이 일치하는 값이 존재한다면
		// 노드 내부의 value값 반환. 일치하는 key값이 없었다면 null값 반환
		else {
			while (e.next != null) {
				if (e.key.equals(key)) {
					break;
				}
				e = e.next;
			}
		}

		return e.value;

	}

	public boolean containsKey(String key) {
		// getIndex함수 호출후 반환값으로 table의 index에 접근
		int index = getIndex(key);
		Entry e = table[index];
		boolean result = false;

		// 접근시 내부의 값이 null이라면 null값 반환 - false 일듯
		if (e == null) {
			result = false;
		}
		/* [내가 짠 코드] 
		else {
			if (e.key.equals(key)) {
				result = true;
			} else {
				while (e.next != null) {
					if (e.key.equals(key)) {
						result = true;
					}
					e = e.next;
				}
			}
		}
		*/
		// [강사님 코드]
		else {
			do {
				if (e.key.equals(key)) {
					result = true;
				}
				e = e.next;
			} while (e != null);
		}

		return result;

		// 객체가 있다면 저장된 객체의 key값과 매개변수로 전달받은 key값 확인
		// 동일하다면 true반환, 일치하지 않는다면 node의 next값을 찾아 일치하는 것을
		// 찾을때까지 검사. 일치하는 값을 찾았다면 true/ 찾지 못했다다면 false 반환
	}

	public void remove(String key) {
		// getIndex함수 호출후 반환값으로 table의 index에 접근
		int index = getIndex(key);
		Entry e = table[index];

		// 접근시 내부의 값이 null이라면 메소드 종료;
		if (e == null) {
			return;
		}

		// 첫번째 entry라면
		if (e.key.equals(key)) {
			table[index] = null;
		}

//		do {
//			if (e.key.equals(key)) {
//				// 내가 찾고자하는 key값이라면 삭제.
//				// 현재 entry에 next값이 존재한다면,
//				//
//				while (e.next != null) {
//					e = e.next;
//				}
//
//				size--;
//				return;
//			}
//			e = e.next;
//		} while (e != null);

		// 객체가 있다면 저장된 객체의 key값과 매개변수로 전달받은 key값 확인
		// 동일하다면 현재 Node삭제

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (Entry e : table) {
			if (e == null) {
				continue;
			}
			sb.append("{").append(e.key).append(" : ").append(e.value).append("}").append(",");

			do {
				Entry next = e.next;
				if (next != null) {
					sb.append("{").append(next.key).append(" : ").append(next.value).append("}").append(",");
					next = next.next;
				}

			} while (e.next != null);
		}

		// sb.append(Arrays.toString(table));
		sb.append("}");
		return sb.toString();

	}

}
