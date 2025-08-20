package question06;

import java.util.Scanner;

public class Grade {
	int math;
	int science;
	int english;
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public double average() {
		int sum=0;
		sum = this.math+this.science+this.english;
		return sum/3;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = sc.nextInt();
		int science= sc.nextInt();
		int english = sc.nextInt();
	
		Grade me = new Grade(math, science, english);
		
		System.out.println("평균은 " + (double)me.average());
		sc.close();
	}
}
