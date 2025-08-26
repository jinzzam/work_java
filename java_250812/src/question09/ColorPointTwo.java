package question09;

public class ColorPointTwo extends Point{
	private String color;
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	public void setXY(int x, int y) {
		super.move(x, y);
	}
	public ColorPointTwo(int x, int y) {
		super(x, y);
	}
	public ColorPointTwo() {
		super(0,0);
		this.color = "BLACK";
	}
	
	
	@Override
	public String toString() {
		return color + "색의 (" + super.getX() + ", " + super.getY() + ")의 점";
	}

	public static void main(String[] args) {
		ColorPointTwo zeroPoint = new ColorPointTwo();
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPointTwo cp = new ColorPointTwo(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
		
	}
}
