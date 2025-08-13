package question01;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		System.out.println("정수 3개 입력 >>");
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int mid = a;
		if (mid < b && b < c) {
			mid = b;
		} else if (mid < c && c < b) {
			mid = c;
		}
		System.out.println("중간값은 " + mid);
		sc.close();
	}
}
