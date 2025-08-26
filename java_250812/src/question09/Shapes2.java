package question09;

//interface Shape2 {
//	final double PI = 3.14;
//	void draw();
//	double getArea();
//	default public void redraw() {
//		System.out.println("---다시 그립니다");
//		draw();
//	}
//}
class Oval implements Shape{
	int width, height;
	
	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width + "x"+height+"에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		double area = PI*width/2*height/2;
		return area;
	}
	
}
class Rect implements Shape{

	int width, height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width + "x"+height+"크기의 사각형입니다.");
	}

	@Override
	public double getArea() {
		double area = width*height;
		return area;
	}
}


class Circle3 implements Shape{
	int radius;
	public Circle3(int radius) {
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

public class Shapes2{
	public static void main(String[] args) {
		Shape donut = new Circle3(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	
		Shape[] list = new Shape[3];
		list[0] = new Circle2(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("면적은 " + list[i].getArea());
	}
}