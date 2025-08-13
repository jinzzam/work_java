package chapter02;

public class LongOperationExample {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000;
		
//		Type mismatch: cannot convert from long to int
//		계산 결과는 long인데 int로 저장이 안 됨
//		int result = value1 + value2 + value3;
		int result = (int)(value1 + value2 + value3);
		System.out.println(result);
	}
}
