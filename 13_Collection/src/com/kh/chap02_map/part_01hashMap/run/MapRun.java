package com.kh.chap02_map.part_01hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap02_map.part_01hashMap.model.vo.Snack;

public class MapRun {
	public static void main(String[] args) {

		HashMap<String, Snack> hm = new HashMap<>();
		/*
		 * HashMap ? 
		 * 
		 * 많은 양의 데이터를 빠르게 저장하고, 검색하기 위해서 
		 * key, value값을 함께 묶어서 관리하는 
		 * Hash Table 알고리즘을 사용한 자료구조. 
		 * 
		 * 계층구조를 보면 List나 Set계열은 Collection을 구현한 클래스
		 * 데이터 추가시에는 add메서드 사용. 
		 * 단, Map은 다름 => 데이터추가시 put메서드를 사용.(key + value를 동시에 저장함)
		 * 
		 * Map의 특징 
		 * 
		 * 1. key, value 한쌍으로 요소를 구성한다.
		 * 2. key값을 통해서 value에 접근한다. 
		 * 3. key는 중복을 허용하지 않는다. 단, value는 중복되어도 좋다. 
		 * 4. 동일한 key값으로 데이터를 저장하면, 마지막으로 추가된 value로 치환된다. 
		 * 5. 동일한 key값 여부는 hashCode() 함수로 판단한다. 
		 * 
		 */
//		Snack s1 = new Snack("초코맛", 100);
//		Snack s2 = new Snack("초코맛", 200);
//		System.out.println(s1.equals(s2)); // false;
//
//		Snack s3 = new Snack("초코맛", 200);
//		System.out.println(s2.equals(s3)); // true;

		// 1. put(K key, V value) => map 공간에 key + value를 세트로 추가해주는 메서드
		// arr["다이제".hashCode() % length] = new Snack("초코맛" 1200);
		hm.put("다이제", new Snack("초코맛", 1200));
		hm.put("칸쵸", new Snack("초코맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("포테토칩", new Snack("짠맛", 500));

		System.out.println(hm); // 저장순서유지 x, value 값은 중복되어도 상관 없음

		hm.put("새우깡", new Snack("매운맛", 700)); // key값이 중복된 경우 마지막의 value값으로 치환.
		System.out.println(hm);

		// 2. get(Object key) : V => Map에서 key값에 저장된 value값을 돌려주는 메서드
		System.out.println(hm.get("새우깡"));

		// 3. size() => 컬렉션에 담겨있는 갯수
		System.out.println("size : " + hm.size()); // key값이 중복된 경우 counting 안함.

		// 4. replace(K key, V value) => 컬렉션에 해당 key값을 찾아서 새로 전달된 value로 변경시켜주는 메서드
		hm.replace("포테토칩", new Snack("겁나짠맛", 1000));
		System.out.println(hm);

		// 5. remove(Object key) => 컬렉션에 해당 key값을 찾아서 key값과 value값을 동시에 지워주는 메서드
		hm.remove("포테토칩");
		System.out.println(hm);

		System.out.println("----------------------------------------------------");

		/*
		 * HashMap을 통한 반복문 
		 * 
		 * 1. KeySet : Key값만 set에 담기 
		 * 
		 * 2. entrySet : key, value 한쌍을 set에 담기 
		 * 
		 * -> keySet, entrySet을 통해 반복문을 사용해야함. 
		 * -> for문 사용불가. 
		 * 
		 * 
		 */

		// 1. keySet()을 이용하는 방법
		// keySet을 통해 HashMap에 저장된 key 값들만 Set에 담아서 얻어오기.
		// hm.keySet() : Set
		Set<String> keySet = hm.keySet();

		// 2. 1번 과정에서 작업된 set을 Iterator에 담기
		Iterator<String> itKey = keySet.iterator();

		// 3. Iterator 반복문을 통해 내부값 추출
		while (itKey.hasNext()) {
			String key = itKey.next(); // "새우깡" , "칸쵸" , "포테토칩"
			Snack value = hm.get(key);
			System.out.println(key + " : " + value);
		}

		System.out.println("----------------------------------------------------");

		// [entrySet을 이용하는 방법]

		// 1. entrySet() 이용하는 방법
		// 1) hm.entrySet() 호출하여 set으로 반환

		Set<Entry<String, Snack>> entrySet = hm.entrySet();

		// 2) entrySet에 담긴 데이터 Iterator()로 담기
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();

		// 3) 반복문을 활용해서 순차적으로 뽑기
		while (itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("----------------------------------------------------");

		// +) Set은 향상된 반복문 사용 가능

		for (Entry<String, Snack> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}
}
