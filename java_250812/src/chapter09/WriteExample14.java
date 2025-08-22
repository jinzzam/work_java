package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample14 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/dev/temp/output14.txt"); // upcasting
//		char[] data = "홍길동".toCharArray();
		String data = "안녕 자바 프로그램";
//		자바 :  "안녕 자바 프로그램" 에서 인덱스 3번에서 2자를 읽어서 파일로 저장
		writer.write(data, 3, 2);
		
		
//		for (int i = 0; i < data.length; i++) {
////			writer 객체에 write 메소드로 "홍길동"을 하나씩 받아서 파일로 저장한다.
//			writer.write(data[i]);
//		}
		writer.close();
	}
}
