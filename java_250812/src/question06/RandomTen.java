package question06;

import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum=0;
		Random rand = new Random();
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1;
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n평균은 " + (double)sum/arr.length);
		
		
	}
}
