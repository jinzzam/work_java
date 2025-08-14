package question03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10~99 사이의 정수를 입력하시오 >>");
		int num = sc.nextInt();
		int ten = num/10;
		int one = num%10;
		int count=0;
		
		if(ten==3 ||ten==6 ||ten==9 ) {
			count++;
		}
		if(one==3 ||one==6 ||one==9 ) {
			count++;
		}
		System.out.print("박수");
		if(count==1) {
			System.out.println("짝");
		}else if(count==2) {
			System.out.println("짝짝");
		}else {
			System.out.println("없음");
		}
		
		sc.close();
	}
}
