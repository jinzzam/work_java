package chapter02;

import java.util.Scanner;

/*
 * 점수를 입력받아서 학점 출력
 * */
public class GradingSwitch {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요 (0~100): ");
		char grade;
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		/*
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		}else if (score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		*/
		switch (score / 10) {
		case 10:
//			grade = 'A';			
//			break;
		case 9 :
			grade = 'A';			
			break;
		case 8:
			grade = 'B';			
			break;
		case 7:
			grade = 'C';			
			break;
		case 6:
			grade = 'D';			
			break;
		default:
			grade = 'F';			
			break;
		}
		
		System.out.println("학점은 "+ grade + "입니다.");
		
		sc.close();
	}
}
