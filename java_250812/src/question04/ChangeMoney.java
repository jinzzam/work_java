package question04;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		System.out.print("금액을 입력하시오>>");
		
		Scanner sc = new Scanner(System.in);
//		int money = sc.nextInt();
		
//		int five = money/50000;
//		if ((money / 50000) > 0) {
//			System.out.println("5만원권 " + (int)(money/50000));
//		}
//		int man = five%10000;
//		if ((man/50000)>0) {
//			System.out.println("만원권 " + (int)(money/10000));
//		}
//		int choen = man%10000;
//		if ((choen/1000)>0) {
//			System.out.println("천원권 " + (int)choen/1000);
//		}
//		int hundred = choen%100;
//		if ((hundred/50)>0) {
//			System.out.println("백원"  + (int)hundred/50);
//		}
//		int hundred5 = hundred%100;
//		if ((hundred5/50)>0) {
//			System.out.println("오십원"  + (int)hundred5/50);
//		}
//		int ten5 = hundred%50;
//		if ((ten5/10)>0) {
//			System.out.println("오십 " + (int)ten5/10);
//		}
//		int ten = ten5%50;
//		if ((ten/10)>0) {
//			System.out.println("십원 " + (int)ten/10);
//		}
//		int one = ten%10;
//		if ((one/1)>0) {
//			System.out.println("일원 " + (int)one/1);
//		}
		
		System.out.print("금액을 입력하시오>>");
		
		final int 오만원 = 50000;
		final int 만원 = 10000;
		final int 천원 = 1000;
		final int 오백원 = 500;
		final int 백원 = 100;
		final int 오십원 = 50;
		final int 십원 = 10;
		final int 일원 = 1;
		
		int res, money;
		
		money = sc.nextInt();
		
		
		money = money/오만원;
		res = money;
		if(res > 0) {
			System.out.println("오만원권 " + res + "매");
		}
		money = money%오만원;
		if(res > 0) {
			System.out.println("만원권 " + res + "매");
		}
		res = money/만원;
		money= money/만원;
		if(res > 0) {
			System.out.println(" 천원권 " + res + "매");
		}
		res = money/만원;
		money = money/오백원;
		if(res > 0) {
			System.out.println("오백원 " + res + "개");
		}
		res = money/만원;
		money = money/백원;
		if(res > 0) {
			System.out.println("십원 " + res + "개");
		}
		res = money/만원;
		money = money/오십원;
		if(res > 0) {
			System.out.println("오십원 " + res + "개");
		}
		res = money/만원;
		money = money/일원;
		if(res > 0) {
			System.out.println("일원 " + res + "개");
		}
		
		

		sc.close();
	}
}
