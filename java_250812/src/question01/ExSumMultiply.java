package question01;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		System.out.print("3자리 수 정수 입력(100~999) >> ");
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		int hundred = num/100;
		int ten = (num%100)/10;
		int one = (num%100)%10;
		System.out.println("100의 자리와 10의 자리의 합은 " + (hundred+ten));
		System.out.println("10의 자리와 1의 자리의 곱은 " + (ten*one));
		sc.close();
	}
}
