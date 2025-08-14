package question03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dollar_100;
		int dollar_10;
		int buy;
		int total;
		System.out.print("매수 수량을 입력하시오>>");
		buy=sc.nextInt();
		total = buy*520;
		dollar_100 = total/100;
		dollar_10 = (total%100)/10;
		if(dollar_100!=0) {
			System.out.println("100달러 짜리 : " +dollar_100+"매");
		}
		if(dollar_10!=0) {
			System.out.println("10달러 짜리 : " +dollar_10+"매");
		}
		
		sc.close();
	}
}
