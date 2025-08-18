package chapter03;

import java.util.Scanner;

/*
 * 나눗셈(분자, 분모 입력 받음)
 * 몫을 출력(분모가 0인 경우 불능)
 * */
public class DivideByZero {
	public static void main(String[] args) {
		int dividen;
		int divisor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("분자를 입력하세요>>");
		dividen = sc.nextInt();
		System.out.print("분모를 입력하세요>>");
		divisor = sc.nextInt();
		
		
//		분자를 입력하세요>>10
//		분모를 입력하세요>>0
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//			at chapter03.DivideByZero.main(DivideByZero.java:21)
		System.out.println(dividen+ "를 " + divisor + "로 나누면 몫은 " + dividen/divisor + "입니다.");
		
		sc.close();
	}
}
