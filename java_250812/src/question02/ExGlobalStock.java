package question02;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int output;
		double tax;
		
		System.out.println("매수금액을 입력하세요 : ");
		input = sc.nextInt();
		System.out.println("매도금액을 입력하세요 : ");
		output = sc.nextInt();
		
		if(output>input) {
			tax = (output-input)*0.22;
		}else {
			tax = 0;
		}
		System.out.println("양도세 : " + tax);
		sc.close();
	}
}
