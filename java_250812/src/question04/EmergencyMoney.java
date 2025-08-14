package question04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int total = 0;
		int dollar_100;
		int dollar_10;
		System.out.print("가구 수를 입력하시오>>");
		num = sc.nextInt();
		
		if(num == 1) {
			total = 400000;
		}else if (num == 2) {
			total = 600000;
		}else if(num == 3) {
			total = 800000;
		}else if (num >= 4) {
			total = 1000000;
		}
		
		total = total/1200;
		
		dollar_100 = total/100;
		dollar_10 = (total%100)/10;
		
		if(dollar_100!=0) {
			System.out.println("100달러 짜리 : " + dollar_100 + "매");
		}
		if(dollar_10!=0) {
			System.out.println("10달러 짜리 : " + dollar_10 + "매");
		}
		
		sc.close();
	}
}
