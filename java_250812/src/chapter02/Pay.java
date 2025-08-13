package chapter02;

import java.util.Scanner;

/*
 * 시간을 입력 받아서 임금 계산
 * */
public class Pay {
	public static void main(String[] args) {
		final int RATE = 10000;	//1시간 임금
		int hour;
		int pay;	//급여
		
		System.out.print("시간을 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		
		if (hour > 8) {	//8시간 초과 : 1시간 임금 * 시간 * 1.5
			pay = (int)(RATE* 8 + (RATE * (hour-8) * 1.5));
		} else {	//8시간 이하 : 1시간 임금 * 시간
			pay = RATE * hour;
		}
		System.out.println("급여는 "+pay+"입니다.");
		sc.close();
	}
}
