package question03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			s = sc.next();
			if(s.equals("exit")) {
				break;
			}
		}
		System.out.println("종료합니다..");
		sc.close();
	}
}
