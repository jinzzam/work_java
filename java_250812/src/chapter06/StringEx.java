package chapter06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#"); // heap 메모리에 저장
		String b = new String(",C++ ");

		// length(): 문자열의 길이
		System.out.println(a.length()); // C#의 길이는 3(스페이스 포함)
		// contains(): 문자열 포함여부
		System.out.println(a.contains("#")); // true
		System.out.println(a.contains("*")); // false

		// concat() : 문자열 연결
		a = a.concat(b);
		System.out.println(a); /* C#,C++ */ // 새로운 문자열을 a가 가리킴

		// trim(): 앞 뒤 공백 제거
		a = a.trim();
		System.out.println(a);/* C#,C++ */

		// replace(): 문자열 대체
		a = a.replace("C#", "Java");
		System.out.println(a); // Java,C++

		//split() : 문자열을 분리
		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++) {
			/*
			 * 분리된 문자열0:Java
			 * 분리된 문자열1:C++
			 */
			System.out.println("분리된 문자열" + i + ":" + s[i]);
		}
		
		//substring(): 인덱스값으로 시작하는 문자열
		a = a.substring(5); 
		System.out.println(a);	//C++
		
		//charAt() : 인덱스에 해당하는 문자
		char c = a.charAt(2);
		System.out.println(c); 	//+

	}
}
