package chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{
	
}
public class HashSetExample {
	public static void main(String[] args) {
		//Set 인터페이스 컬렉션 타입으로 HashSet 클래스 객체 생성
		Set<String> set = new HashSet<String>();	//upcasting
//		Set<AA> set = new HashSet<AA>();	//upcasting
//		Set<Object> set = new HashSet<Object>();	//upcasting
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //Set 컬렉션 중복 객체 추가 불가
		AA a = new AA();	
		//The method add(String) in the type Set<String> is not applicable for the arguments (AA)
//		set.add(a);//<Object> 타입으로 사용 가능
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		//Set 컬렉션은 iterator 메소드 호출해서 Iterator 인터페이스 타입으로 값을 받음
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		System.out.println("총 객체수 : " + set.size());
		/*
		Iterator<String> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			String element = iterator2.next();
			System.out.println("\t" + element);
		}*/
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		if (set.isEmpty()) {	//객체가 하나라도 있는지 확인
			System.out.println("비어 있음");
		} else {
			System.out.println("객체 있음");
		}
		
		set.clear();
		if (set.isEmpty()) {	//객체가 하나라도 있는지 확인
			System.out.println("비어 있음");
		} else {
			System.out.println("객체 있음");
		}
	}
}
