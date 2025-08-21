package chapter05_01;

// 추상클래스에 추상메소드가 없어도 됨(객체 생성 안 됨)
abstract public class Bird extends Animal{
	public int wing=2;
	public void walk() {
		System.out.println("walk");
	}
	public void eat() {
		System.out.println("eat");
	}
}
