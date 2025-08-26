package question09;


public class PositivePoint extends Point {

	public PositivePoint(int x, int y) {
		this.move(x, y);
	}
	
	public PositivePoint() {
		super();
	}

	@Override
	protected void move(int x, int y) {
		if(x>=0 && y>=0) super.move(x, y);
		else return;
	}

	@Override
	public String toString() {
		return "(" + super.getX() + ", " + super.getY() +")의 점";
	}

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
}
