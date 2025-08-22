package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/dev/temp/output3.txt"); 
		byte[] data = "ABC".getBytes();
		os.write(data);
		
//		for (int i = 0; i < data.length; i++) {
//			os.write(data[i]);
//		}
		
		os.close();
	}
}
