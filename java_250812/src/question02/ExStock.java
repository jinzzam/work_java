package question02;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kospi;
		int rate;

		System.err.print("코스피 지수를 입력하세요(1800~2500) : ");
		kospi = sc.nextInt();
		System.err.print("환율을 입력하세요(1100~1200): ");
		rate = sc.nextInt();
		if (kospi < 2000) {
			System.out.println("하락장");
		} else {
			if (rate >= 1150) {
				if (kospi >= 2200) {
					System.out.println("상승장");
				} else {
					System.out.println("횡보장");
				}
			} else {
				if (kospi >= 2300) {
					System.out.println("상승장");
				} else {
					System.out.println("횡보장");
				}

			}

		}

		sc.close();
	}
}
