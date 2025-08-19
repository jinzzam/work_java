package question06;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
//		char c = (char) a;
//		char[] arr = new char[a];
//		System.out.println(a);
//		int alphabet = Integer.valueOf(sc.next().toCharArray()[0]);
//		System.out.println(alphabet);
//		for (int i = 96; i <= alphabet; i++) {
//			for (int j = 0; j < alphabet-i; j++) {
//				System.out.print((char)(j+i+1));				
//			}
//			System.out.println();
//		}
//		sc.close();
		
		String s = sc.next();
		char c = s.charAt(0);
		
//		for (char i = 'a'; i <= c; i++) {
		for (char i = c; i >= 'a'; i--) {
//			for (char j = 'a'; j <= c; j++) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
