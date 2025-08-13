package question01;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		System.out.println("2자리 수 정수 입력(10~99)>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if((num/10) == (num%10)) {
			System.out.println("Yes");
		}else {
			System.out.println("no");
		}
	}
}
