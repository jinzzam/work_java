package question01;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로, 세로 길이를 입력하세요>>");
		int width = sc.nextInt();
		int height = sc.nextInt();
		System.out.println("사각형의 면적은 " + width*height + "입니다.");
		sc.close();
	}
}
