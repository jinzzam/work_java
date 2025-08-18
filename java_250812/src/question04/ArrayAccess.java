package question04;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		System.out.println("양수 5개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int integer[] = new int[5];
		for (int i = 0; i < integer.length; i++) {
			integer[i] = sc.nextInt();
			if (max < integer[i]) {
				max = integer[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		sc.close();
	}
}
