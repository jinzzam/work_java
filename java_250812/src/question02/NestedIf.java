package question02;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		int step;
		System.out.println("점수를 입력하세요(0~100): " );
		score = sc.nextInt();
		System.out.println("학년을 입력하세요(1~4): " );
		step= sc.nextInt();
		
		if(step==4) {
			if(score>=70) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			if(score>=60) {
				System.out.println("합격");
				
			}else {
				System.out.println("불합격");
				
			}
		}
		sc.close();
	}
}
