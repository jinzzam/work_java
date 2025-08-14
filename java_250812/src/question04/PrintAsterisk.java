package question04;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String star = "";
		System.out.print("정수를 입력하시오>>");
		n = sc.nextInt();
		for (int k = n; k > 0; k--) {
			for (int i = k; i > 0; i--) {
				star += "*";
			}
			System.out.println(star);
			star = "";
		}
		sc.close();
	}
}
