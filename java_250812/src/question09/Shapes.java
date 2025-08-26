package question09;

interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("---다시 그립니다");
		draw();
	}
}

class Circle2 implements Shape{
	int radius;
	public Circle2(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 " + this.radius + "인 원입니다.");
	}
	@Override
	public double getArea() {
		double area = this.radius * this.radius * PI;
		return area;
	}
}

public class Shapes{
	public static void main(String[] args) {
		Shape donut = new Circle3(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}