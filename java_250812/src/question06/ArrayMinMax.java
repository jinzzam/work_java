package question06;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("양수 10개를 입력하세요.");
		int intArray[]=new int[10];
		int min=0;
		int max=0;
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			
			if (i == 0) {
				min = intArray[i];
			}
			if (intArray[i] < min) {
				min = intArray[i];
			}
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		
		System.out.print("가장 작은 수는 "+min+"이고, ");
		System.out.println("가장 큰 수는 "+max+"이고, ");
		System.out.println("최소값+최대값은 "+(min + max)+"입니다.");
		
		scanner.close();
	}
}














