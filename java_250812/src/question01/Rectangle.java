package question01;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		System.out.println("점(x, y)의 좌표를 입력하시오>>");
		int x, y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		if(x>=100 && x<=200) {
			if(y>=100 && y<=200) {
				System.out.println("("+x+", "+y+")는 사각형 안에 있습니다.");
			}
		}else {
			System.out.println("없음");
			
		}
		sc.close();
	}
}
