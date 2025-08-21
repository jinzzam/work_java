package question07;

import java.util.Scanner;

public class Trapezoid {
	int down;
	int up;
	int height;
	
	
	public Trapezoid(int down, int up, int height) {
		this.down = down;
		this.up = up;
		this.height = height;
	}
	
	public double getArea() {
		double area = (this.down+this.up)*this.height/2;
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		int down = sc.nextInt();
		int up= sc.nextInt();
		int height= sc.nextInt();
		Trapezoid t = new Trapezoid(down, up, height);
		System.out.println("사다리꼴 면적은 " + t.getArea());
		
		sc.close();
	}
}
