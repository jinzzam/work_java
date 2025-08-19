package chapter04;

public class Book2 {
	String title;
	String author;
	
	public Book2(String title, String a) {
		System.out.println("생성자1 호출됨");
		this.title = title;
		author = a;
	}
	
	public Book2(String title) {
		//생성자에서 생성자로 호출 : 왜 쓰는거지?..결국 똑같은거 아닌가? => 하나의 파일에 같은 내용이 겹칠 수 있음 (깃에 코드 충돌될 때 생각해보기)
//		this로 생성자 호출 시 가장 첫줄에 와야함
		this(title, "작자미상");		
		System.out.println("생성자2 호출됨");
//		title = t;
//		author = "작자미상";
	}
	
	public Book2() {
		this("", "");
		System.out.println("생성자3 호출됨");
	}
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public static void main(String[] args) {
//		Book2 littlePrince = new Book2("어린왕자", "생텍쥐베리");
//		Book2 loveStory = new Book2("춘향전");
		Book2 emptyBook = new Book2();

//		System.out.println(littlePrince.title + " " + littlePrince.author);
//		System.out.println(loveStory.title + " " + loveStory.author);
//		littlePrince.show();
//		loveStory.show();
		emptyBook.show();
	}
}
