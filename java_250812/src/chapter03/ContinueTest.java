package chapter03;

/*
 * 문자열에서 특정 문자를 찾는다.
 * 찾은 개수를 출력
 * ex> life is cool. (l->2개)
 * */
public class ContinueTest {
	public static void main(String[] args) {
		int count=0;
//		알파벳 n의 개수 구하기
		String s = "no news is good news";
		
//		length() : 문자열의 크기를 구하는 메소드
//		스페이스 포함해서 20자
//		문자열 크기 20번 반복
		for (int i = 0; i < s.length(); i++) {
//			charAt(0) : 첫 번째 문자
//			System.out.print(s.charAt(0));
//			System.out.print(s.charAt(i));
			
//			if (s.charAt(i)=='n') {
//				count++;
//			}
//			알파벳 n이 아니면 스킵
			if (s.charAt(i)!='n') {
				continue;
			}
			count++;
		}
		System.out.println("문장에서 발견된 n의 개수 : "+count);
	}
}
