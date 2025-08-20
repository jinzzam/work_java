package chapter04;

import java.util.Scanner;

/*
 * static 사용 (필드, 메소드)
 * 클래스 이름으로 static 멤버 접근
 * 환율을 입력받아 100만원 몇달러?
 * 환율-> 100달러가 몇원?
 * */

class CurrencyConverter{
	private static double rate;
//	jsp, sping 할 때도 많이 사용
//	메소드를 사용해서 멤버변수를 접근해서 사용(직접적인 값 수정을 막음->보안)
//	getter(ex.getAbc: 값을 가져올때)
//	setter(ex.setAbc : 값을 지정할 때)
//	메소드 사용해서 멤버변수 사용
	public static void setRate(double rate) {
//		매개변수를 static(클래스)멤버로 저장
		CurrencyConverter.rate = rate;
	}
//	1300원, 환율:1300->1300원/환율 1300->1달러
	public static double toDollar(double won) {
		return won/rate;
	}
//	환율 1300 *1달러 = 1300원
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
}

public class StaticMember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("환율(1달러)>>");
		double rate = sc.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000)+"입니다.");
		System.out.println("100$는 " + CurrencyConverter.toKWR(100)+"원입니다.");
		
		sc.close();
	}
}
