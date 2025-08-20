package question06;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		Random generator = new Random();
		
//		난수 발생 (범위 : int 타입 범위-> -2^31~2^31)
//		System.out.println(generator.nextInt());
//		난수 발생 (0~9 정수)
//		System.out.println(generator.nextInt(10));
//		참/거짓
//		System.out.println(generator.nextBoolean());
//		0.0~1.0
//		System.out.println(generator.nextDouble());
		
		int res;
		while(true) {
			res = generator.nextInt(10) + 1;
			System.out.println(res);
			if(res == 7) {
				break;
			}
		} 
		
		
	}
}
