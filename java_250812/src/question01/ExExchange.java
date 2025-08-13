package question01;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		System.out.print("원화를 입력하세요(단위 원) >>");
		Scanner sc = new Scanner(System.in);
		int won = sc.nextInt();
		final double EUR = 1500;
		final double DOLLAR = 1200;
		System.out.println(won+ "원은 $" + (float)(won/DOLLAR) + "입니다.");
		System.out.println(won+ "원은 E" + (float)(won/EUR) + "입니다.");
		sc.close();
	}
}
