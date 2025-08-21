package chapter06;

class Point3 {
	private int x, y;

	public Point3(int x, int y) { this.x = x;	this.y = y; }
	@Override
	public boolean equals(Object obj) {
		Point3 p = (Point3) obj;
		if (x==p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}
public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = new Point3(3, 4);

		//a!=b
		if(a==b) {	//객체 비교
			System.out.println("a==b");
		}else {
			System.out.println("a!=b");
		}
		
		//equals : 기본은 객체 비교
		//a is not equal to b
		//  값을 비교하면 a is equal to b
		if(a.equals(b)) {	//객체 비교
			System.out.println("a is equal to b");
		}else {
			System.out.println("a is not equal to b");
		}
		
		//a is not equal to c
		if(a.equals(c)) {	//객체 비교
			System.out.println("a is equal to c");
		}else {
			System.out.println("a is not equal to c");
		}
	}
}
