package chapter02;

public class ByteOperationExample {
	public static void main(String[] args) {
//		연산식을 변수로 저장
		byte result1 = 10+20;
		System.out.println(result1);
		
		byte x=10;
		byte y=20;
//		Type mismatch: cannot convert from int to byte
//		byte result2 = x+y;
//		연산되어서 int로 자동 변환 됨. 그래서 byte로 캐스팅 함
		byte result2 = (byte)(x+y);
		System.out.println(result2);
	}
}
