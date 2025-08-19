package chapter04;

public class Circle2 {
//public class Circle 같은 패키지 내에 Circle이라는 클래스가 존재해서 안된다.
//public class Circle {
	
//	4. 멤버변수가 1
	int radius;
	String name;
	public double getArea() {
		return 3.14*radius*radius;
	}
//	2. 생성자 호출됨
	public Circle2() {
//		3. 반지름이 1
		radius = 1;
		name = "";
	}
//	2. 생성자 호출됨(매개변수를 받음)
	public Circle2(int radius, String n) {
//		매개변수와 멤버변수가 같을 때 this 사용하면 경고창 없애줌
//		3. 매개변수 값이 저장
		this.radius = radius;
		this.name = n;
	}
	
	public static void main(String[] args) {
//		래퍼런스(참조)변수 선언
//		Circle2 pizza;
//		객체 생성하면서 생성자 호출(기본 생성자 없으면 자동으로 생성해서 호출)
//		기본 생성자 외에 다른 생성자가 있으면 생성하지 못해서 컴파일 오류
//		new Circle2();
		
//		1. 객체 생성하면서 생성자 호출
		Circle2 pizza = new Circle2(); // 반지름이 1이고 이름(name)은 없는 피자 생성
		double area = pizza.getArea();
		System.out.println(area);
		
//		매개변수 1개를 가지는 생성자가 없어서 오류
//		new Circle2(10);
		
//		1. 객체 생성하면서 생성자 호출(매개변수 10, "자바피자" 2개를 들고감
		Circle2 pizza2 = new Circle2(10, "자바피자"); // 반지름이 10이고 이름(name)은 자바피자인 피자2 생성
		area = pizza2.getArea();
		System.out.println(area);
		System.out.println(pizza2.name +"의 면적은 " + area );
		
		Circle2 donut = new Circle2(10, ""); // 반지름이 10이고 이름(name)은 자바피자인 피자2 생성
		donut.name="자바도넛";
		area = donut.getArea();
		System.out.println(donut.name +"의 면적은 " + area );
	}
}
