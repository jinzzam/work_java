package chapter02;

/*
 * 작성일 : 2025-08-12
 * 작성자 : 박유진
 * 내용 : HelloWorld 클래스로 문자열 출력
 * */

/*
 * jvm : 자바가상기계
 * jvm -> public class를 찾아감 -> main 메소드
 * */
public class HelloWorld {
	public static void main(String[] args) {
//		String : 문자열 타입
		String message = "헬로 월드!";
		System.out.println(message);
		message = "웰컴 투헬!";	// 변수값 새로 할당
		System.out.println(message);
	}
}