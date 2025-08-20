package chapter05;

/*
 * Point 클래스 : (x, y) 한 점을 표현
 * Point 클래스를 상속받는 ColorPoint 클래스(색을 가진 점)
 * */

class Point {
	private int x, y; //4. (1, 2)

	public void set(int x, int y) { // 2. (1, 2)
		this.x = x;	this.y = y; //3. (1, 2)
	}
	public void showPoint() {
		System.out.println("("+x+", "+y+")");
	}
}

// 서브 클래스 (자식)
class ColorPoint extends Point{	//슈퍼 클래스(부모)
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
//		메소드 안에서 상속받은 메소드 호출
		showPoint();
	}
	
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p  = new Point();	// 객체를 생성, 멤버는 4개, 생성자 호출(기본)
//		1. 메소드 호출
		p.set(1, 2);
		p.showPoint();
		
//		객체를 생성, 멤버는 7개, 생성자 호출(기본) : Point(슈퍼) -> ColorPoint(서브)
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.showPoint();
		cp.setColor("red");
		cp.showColorPoint();
	}
}
