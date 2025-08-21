package question07;

import java.util.Scanner;

public class ComputeInsert {
	public static void main(String[] args) {
		int years;
		double rate, balance, principal;
		Scanner sc = new Scanner(System.in);
		
		years = 0;
		System.out.print("원금을 입력하세요:");
		principal = sc.nextDouble();
		System.out.print("연이율을 입력하세요:");
		rate = sc.nextDouble();
		System.out.println("연도수\t 원리금");
		balance = principal;
		
		while(balance<=principal*2) {
			years = years + 1;
			balance = balance*(1.0 + rate / 100.0);
			System.out.println(years+"\t "+balance);
		}
		System.out.println("필요한 연도수 = " + years);
		sc.close();
		
	}
}
