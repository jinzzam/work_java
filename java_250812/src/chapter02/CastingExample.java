package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
//		Type mismatch: cannot convert from int to char
//		char charValue = intValue;
//		char 로 캐스팅해서 저장
//		44032 유니코드에 해당하는 '가' 문자가 저장
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
//		Type mismatch: cannot convert from long to int
//		intValue = longValue;
//		정수 큰 타입에서 작은 타입으로 변환(변환 안 하면 오류)
		intValue = (int)longValue;
		System.out.println(longValue);

//		5000999888L 에서 L 안 붙이면 int로 인식해서 오류
		long longValue2 = 5000999888L;
//		long 타입 숫자가 int로 변환할 때 잘려서 706032592로 저장
		intValue = (int)longValue2;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
//		실수에서 정수로 변환 (변환 안 하면 오류)
//		3.14에서 소수점이 잘려서 3으로 저장
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}
}
