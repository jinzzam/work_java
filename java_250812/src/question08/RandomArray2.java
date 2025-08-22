package question08;

import java.util.Random;
import java.util.Scanner;

public class RandomArray2 {
//	난수의 중복체크하는 메소드
	public static boolean exist(int a[], int to, int r) {
		for (int i = 0; i < to; i++) {
			//중복인 경우
			if(a[i] == r) return true;
		}
		//중복이 아닌 경우
		return false;
	}
	
	public static void main(String[] args) {
//		System.out.print("정수 몇개?");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = 0, j;
//		int[] arr = new int[n];
		Random random = new Random();
//		for (int i = 0; i < arr.length; i++) {
//			m = random.nextInt(100) + 1;
//			if(i==0) {arr[0] = m;continue;}
//			for (j = i-1; j > 0; j--) {
//				if (arr[j] == m) continue;
//			}
//			arr[i] = m;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//			if (i % 10 == 0 && i!=0) {
//				System.out.println();
//			}
//		}
//		sc.close();
		
		
		System.out.print("정수 몇개?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0, j;
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			int r = random.nextInt(100) + 1;
			if(exist(arr, i, r)) {
				i--;
				continue;
			}
			arr[i] = r;
			//첫번째는 엔터 안 친다.
			if(i==0) {
				System.out.print(arr[i]+" ");
			}
		}
		
		sc.close();
	}
}
