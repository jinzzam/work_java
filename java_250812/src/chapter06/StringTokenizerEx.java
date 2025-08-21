package chapter06;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String sb = new String("홍길동/장화/홍련/콩쥐/팥쥐");
		StringTokenizer st = new StringTokenizer(sb, "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
