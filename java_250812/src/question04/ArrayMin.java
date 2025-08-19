package question04;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요>>");
		int[] integer = new int[7];
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < integer.length; i++) {
			integer[i] = sc.nextInt();
			
			if(min>integer[i]) {
				min = integer[i];
			}
		}
		System.out.println("가장 작은 수는 " + min +"입니다.");
		sc.close();
	}
}
