package question02;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operator;
		int a, b;
		System.out.print("연산>>");
		a = sc.nextInt();
		operator = sc.next();
		b = sc.nextInt();
		int result = 0;

		if (operator.equals("+")) {
			result = a + b;
		} else if (operator.equals("-")) {
			result = a - b;
		} else if (operator.equals("*")) {
			result = a * b;
		} else if (operator.equals("/")) {
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				result = a / b;
			}
		}
		if (result != 0) {
			System.out.println(a + "+" + b + "의 계산 결과는 " + result);
		}

		sc.close();
	}

}
