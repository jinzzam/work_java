package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
//		FileOutputStream : 바이트 단위 출력을 위한 하위 스트림 클래스
//		FileOutputStream output.txt 를 가지고 객체 생성한다.
//		OutputStream os = new FileOutputStream("C:\\dev\\temp\\output.txt"); //upcasting
//		백슬래쉬 대신에 슬래쉬 사용가능
		OutputStream os = new FileOutputStream("C:/dev/temp/output2.txt"); //upcasting
//		바이트 단위로 문자열을 읽는다.
		byte[] data = "ABC".getBytes();
		
		for (int i = 0; i < data.length; i++) {
//			FileOutputStream 객체에 바이트 배열 원소를 넣는다.
			os.write(data[i]);
		}
		os.close();
	}
}
