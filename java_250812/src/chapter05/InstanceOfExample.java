package chapter05;

public class InstanceOfExample {
	public static void method1(Parent parent) {
//		Parent parent = new Child(); =>child 객체를 판단
//		instanceof : 객체가 해당 클래스 타입인지 판단(참/거짓)
		if (parent instanceof Child) {
//			down casting
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환 실패");
		}
	}
	
	public static void main(String[] args) {
//		upcasting
		Parent parentA = new Child();
		method1(parentA);
		Parent parentB = new Parent();
		method1(parentB);
	}
}
