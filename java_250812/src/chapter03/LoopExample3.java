package chapter03;

import java.util.Scanner;

/*
 * do while 문 사용
 * 변화되는 i값 출력
 * */
public class LoopExample3 {
	public static void main(String[] args) {
		int i = 10;
		
//		최소 한 번 실행은 보장
		do {
			System.out.println("i : "+i);
			i--;
		} while (i<3);
//		9<3 거짓으로 종료
	}
}
