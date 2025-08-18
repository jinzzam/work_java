package question04;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		System.out.print("5개의 정수를 입력하세요 >>");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		float sum=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("평균은 " + (float)(sum / arr.length));
		sc.close();
	}
}
