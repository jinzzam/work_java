package chapter07;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();

		box.set("홍길동");
		String name = (String) box.get();
		System.out.println(name);

		box.set(777);
		int number = (int) box.get();
		System.out.println(number);

		box.set(new Apple());
		Apple apple = (Apple) box.get();
		System.out.println(apple);
		//chapter07.Apple@5ca881b5
		//패키지.클래스@16진수 객체서명
	}
}
