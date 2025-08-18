package chapter03;

public class ReturnArray {
	static int[] makeArray() {
//		리턴 타입과 반환되는 값의 타입이 일치해야 함
//		return 0;
		int temp[] = new int[4];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
		
//		return temp[];	오류
		return temp;
	}
	
	public static void main(String[] args) {
		int intArray[];
//		메소드 호출
		intArray = makeArray();	//temp 배열 받음(0, 1, 2, 3)
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}
