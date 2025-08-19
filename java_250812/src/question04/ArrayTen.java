package question04;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("10개의 정수를 입력하세요>>");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("합계는 " + sum);
		sc.close();
	}
}
