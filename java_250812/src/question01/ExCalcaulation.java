package question01;

import java.util.Scanner;
//class 여러 개 사용해도 무관
class Aaa{}
class Bbb{}
//자바 파일 안에 public class 두개 이상 존재 시 오류
//public class Caa{}
//1. JVM이 수많은 class에서 public class를 찾아감
public class ExCalcaulation {
	public static void aaa() {
		System.out.println("777");
	}
//	2. JVM이 수많은 메서드에서 main메서드를 찾아감
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 실수 입력>>");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("두 수의 덧셈은 " + (a+b));
		System.out.println("두 수의 뺄셈은 " + (a-b));
		System.out.println("두 수의 곱셈은 " + (a*b));
		System.out.println("두 수의 나눗셈은 " + (a/b));
		sc.close();
	}
}
