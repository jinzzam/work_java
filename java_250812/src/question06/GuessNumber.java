package question06;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int numberToGuess;
		int guess;
		Random random = new Random();
		numberToGuess = random.nextInt(10) + 1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("추측한 숫자를 입력하세요 : ");
			guess = sc.nextInt();
			if(guess==numberToGuess) {
				System.out.println("맞추셨습니다.");
				break;
			}else if(guess<numberToGuess) {
				System.out.println("추측한 숫자가 틀렸습니다.");
				System.out.println("추측한 숫자가 너무 큽니다.");
			}else if (guess>numberToGuess) {
				System.out.println("추측한 숫자가 틀렸습니다.");
				System.out.println("추측한 숫자가 너무 작습니다.");
			}
		}
		
		sc.close();
	}
}
