package question08;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		System.out.print("정수 몇개?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		sc.close();
	}
}
