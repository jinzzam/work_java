package chapter04;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}

	public static void main(String[] args) {
//		new Rectangle();  //구성 : 멤버3개(필드 2개, 메소드 1개)
//		new 연산자로 Rectangle 객체를 생성하면서, Rectangle 클래스 타입의 참조변수 rect가 가리킴
		Rectangle rect = new Rectangle();  //구성 : 멤버3개(필드 2개, 메소드 1개)
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
//		객체의 멤버변수로 접근해서 스캐너에서 입력받은 정수가 저장
		rect.width = sc.nextInt();
		rect.height= sc.nextInt();
		System.out.println("사각형의 면적은 "+rect.getArea());
		
		sc.close();
	}
}
