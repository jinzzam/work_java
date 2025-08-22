package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\dev\\temp\\test.txt"); // upcasting
		int readByte;		
		byte[] readBytes = new byte[8];
		String data = "";
		
		while (true) {
//			readByte = is.read(); // 1byte 단위로 읽는다.(정수로 받음) : (호미로 흙 파는 느낌)
			readByte = is.read(readBytes); // 3byte 단위로 읽는다.(정수로 받음) : (삽을 가져옴..)
			System.out.println(readByte);
			if (readByte == -1) {
				break;
			}
//			문자 3개를 형변환 하면서 오류 ex.aaa->char 통째로 하려 하니까 오류
//			System.out.print((char)readByte);
//			System.out.println("@#$%$ readByte=>" + readByte);
			//readBytes를 0인덱스에서 readByte 길이만큼 읽는다.
			data += new String(readBytes, 0, readByte);
		}
		System.out.println(data);
	
	is.close();
}}
