package chapter02;

public class RandomNumber {
	public static void main(String[] args) {
		int n = rollDie();
		System.out.println(n);
	}
	public static int rollDie() {
//		random() : 0이상 1미만 난수 발생(실수)
//		Math.random();
		
//		random() : 0이상 6미만 난수 발생(실수)
		double x = 6 * Math.random();
		int temp = (int)x;
		return temp+1;
	}
}
