package chapter02;

public class IntegerLiteralExample {
	public static void main(String[] args) {
//		0b~ : 이진수
		int var1 = 0b1011;
//		0~ : 8진수
		int var2 = 0206;
//		십진수
		int var3 = 365;
//		0x~ : 16진수
		int var4 = 0xB3;
		
		//11 이진수가 자동으로 십진수로 변환되어 출력됨
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
	}
}
