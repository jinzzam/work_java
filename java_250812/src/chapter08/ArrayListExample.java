package chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// List 컬렉션에서 ArrayList 클래스로 객체 생성(제네릭 타입파라미터를 String)
		// upcasting
		List<String> list = new ArrayList<>(); // List에 커서위치하고 ctrl+t
		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
//		list.add("Database");
		list.add(2, "Database"); // 2번 인덱스에 삽입되어서 2번이 밀려남 => 3: Servlet/JSP
		list.add("Spring");

		int size = list.size();
		System.out.println("총 list 개수 : " + size);

		String skill = list.get(2);
		System.out.println("2번째 인덱스: " + skill);

//		for (int i = 0; i < size; i++) {
//			String str = list.get(i);
		list.remove(2);
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
			/*
			 * 총 list 개수 : 5 2번째 인덱스: Database 0 : JAVA 1 : JDBC 2 : Database 3 :Servlet/JSP
			 * 4 : Spring
			 * 
			 */

		}
		list.remove("Spring");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
			System.out.println();
		}
	}
}
