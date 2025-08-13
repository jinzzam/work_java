package chapter02;

public class ByteExample {
	public static void main(String[] args) {
		byte var1 = -128;
//		Type mismatch: cannot convert from int to byte
//		-128~127 범위 벗어나서 오류
//		byte var2 = -129;
		byte var2 = 0;
//		byte var3 = 127;
//		Type mismatch: cannot convert from int to byte
//		-128~127 범위 벗어나서 오류
//		byte var3 = 128;

//		Duplicate local variable var1
//		byte var1 = 0;
		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
	}
}
