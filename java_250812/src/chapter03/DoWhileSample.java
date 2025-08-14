package chapter03;

/*
 * do while문 
 * a~z 알파벳 소문자 출력
 * */

public class DoWhileSample {
	public static void main(String[] args) {
		char c = 'a';
		
		do {
			System.out.print(c);
//			c++;	자동변환
//			c = c+1 => 문자 + 정수 = 정수 error
//			유니코드 변환해서 1증가한 유니코드가 정수에 더하기하면 정수가 된다. 그래서 c로 받으면 오류가 난다. c는 char 타입이라서.
			c = (char)(c+1);	
//			c+=1;	자동변환
		} while (c <= 'z');
	}
}
