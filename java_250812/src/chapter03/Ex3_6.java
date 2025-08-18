package chapter03;

public class Ex3_6 {
	public static void main(String[] args) {
		int[] arr = {88, 76, 92, 68, 55, 48, 82};
		int sum = 0;
		
//		System.out.println(arr.length);
//		arr.length : 인덱스 6번까지 반복(7번)
		for (int i = 0; i < arr.length; i++) {
//			arr[0]~arr[6]
			sum+=arr[i];
		}
		System.out.println("총합 : " + sum);
	}
}
