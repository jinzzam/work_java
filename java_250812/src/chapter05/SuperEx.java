package chapter05;

/*
 * super()를 사용
 * */
class Point2 {
	private int x, y; //4. (1, 2)
	
	public Point2() {
//		super();
		this.x = this.y = 0;
	}
	public Point2(int x, int y) {
//		super();
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+", "+y+")");
	}
}

class ColorPoint2 extends Point2{	//슈퍼 클래스(부모)
	private String color;
	
	public ColorPoint2(int x, int y, String color) {
	super(x, y);
	this.color = color;
}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5, 6, "blue");
		cp.showColorPoint();
	}
}
