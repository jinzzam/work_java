package question01;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		System.out.print("원화를 입력하세요(단위 원) >>");
		Scanner sc = new Scanner(System.in);
		int won = sc.nextInt();
		final int RATE = 1100;
		System.out.println(won+ "원은 $" + (float)(won/RATE) + "입니다.");
		sc.close();
	}
}
