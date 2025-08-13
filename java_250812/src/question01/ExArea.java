package question01;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오 >>");
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if(c==0) {
			System.out.println("삼각형의 넓이는 " + (a*b)/2);
		}else {
			System.out.println("사다리꼴의 넓이는 " + ((a+b)*c)/2);
		}
		sc.close();
	}
}
