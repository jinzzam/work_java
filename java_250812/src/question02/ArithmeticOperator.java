package question02;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		int second;
		int hour, min, sec;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		second = sc.nextInt();
		hour = second/360;
		min = (second-(hour*60))/60;
		sec = min-(min*60);
		System.out.println(second+"초는 "+hour+"시간, "+min+"분, "+sec+"초입니다.");
	
		sc.close();
	}
}
