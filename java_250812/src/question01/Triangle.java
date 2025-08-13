package question01;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		System.out.print("정수 3개를 입력하시오 >>");
		int a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (((a + b) <= c) || ((b + c) <= a) || ((c + a) <= b)) {
			System.out.println("삼각형이 안댐.");
		} else {
			System.out.println("삼각형이 됩니다.");
		}
		sc.close();
	}
}
