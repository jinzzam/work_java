package area;

public class Circle {
	private int radius;
	private double area;
	public void process() {
		double area = this.radius*this.radius*Math.PI;
		setArea(area);
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
		process();
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
}
