package chapter08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("임영웅", 31);
		map.put("영탁", 38);
		map.put("이찬원", 25);
//		map.put("임영웅", 30);	//키는 중복 안 됨. 값이 30으로 바뀜.
		map.put("김호중", 31);	//값은 중복 허용됨

		System.out.println("총 entry수 : " + map.size()); 	//Map.Entry 구조로 키/값 으로 구정
		System.out.println("임영웅 : " + map.get("임영웅"));	//키에 해당하는 값 출력
		System.out.println();
		
		Set<String> keySet = map.keySet();	//map 컬렉션의 모든 키들을 Set컬렉션으로 받음
		Iterator<String> keyIterator = keySet.iterator();
		
		//Map 컬렉션 키/값을 가져오는 1번째 방식
		while (keyIterator.hasNext()) {	//컬렉션 객체가 있으면 참
			String key = keyIterator.next();	//컬렉션 객체를 가져옴
			Integer value= map.get(key);	//get() 메소드로 Map컬렉션의 키를 가지고 값을 가져옴
			System.out.println("\t" + key + " : "+ value);	//출력 순서는 랜덤으로 발생됨
		}
		System.out.println();
		
		map.remove("임영웅");
		System.out.println("총 entry수 : " + map.size()); 	//Map.Entry 구조로 키/값 으로 구정
		
		//Map.Entry 구조로 키/값으로 객체를 받음
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		//Set 컬렉션 방식으로 객체 처리(키, 값을 가져옴)
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		//Map 컬렉션 키/값을 가져오는 2번째 방식
		while (entryIterator.hasNext()) {	//컬렉션 객체가 있으면 참
			Map.Entry<String, Integer> entry = entryIterator.next();	//컬렉션 객체를 가져옴
			String key = entry.getKey();	//키를 가져옴
			Integer value = entry.getValue();	//키를 가져옴
			System.out.println("\t" + key + " : "+ value);	//출력 순서는 랜덤으로 발생됨
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 entry수 : " + map.size()); 	//Map.Entry 구조로 키/값 으로 구정
	}
}
