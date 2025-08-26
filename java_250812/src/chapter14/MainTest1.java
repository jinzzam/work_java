package chapter14;

import java.util.Arrays;

public class MainTest1 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//배열 요소의 합(sum() : 최종연산)
		int sumValue = Arrays.stream(arr).sum();	
		//배열 요소가 몇 개가 있는지(count() : 최종연산)
		long count = Arrays.stream(arr).count();	
	
		System.out.println(sumValue);
		System.out.println(count);
	}
}
