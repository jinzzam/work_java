package chapter04;

public class Book {
//	4. 멤버 저장
	String title;
	String author;
	
//	2. "어린왕자", "생텍쥐베리" 2개를 매개변수로 받는다.
	public Book(String t, String a) {
//		3. 매개변수를 멤버로 저장
		title = t;
		author = a;
	}
	
	public Book(String t) {
		title = t;
		author = "작자미상";
	}
	
	public static void main(String[] args) {
//		생성자가 하나라도 존재하면 자동으로 기본생성자를 만들지 못해서 오류
//		new Book();
//		1. 매개변수 가지고 생성자 호출
		Book littlePrince = new Book("어린왕자", "생텍쥐베리");
		Book loveStory = new Book("춘향전");

		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
