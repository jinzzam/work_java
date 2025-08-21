package question07;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		System.out.print("금액을 입력하시오>>");
		int money, res;

		Scanner sc = new Scanner(System.in);
		money = sc.nextInt();
		for (int i = 0; i < unit.length; i++) {
			res = money / unit[i];
			money = money % unit[i];
			if (res > 0) {
				System.out.println(unit[i] + "원 짜리 : " + res + "개");
			}
		}
		sc.close();
	}
}
