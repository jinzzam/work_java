package question04;

public class CoronaSum {
	public static void main(String[] args) {
		int[][] corona = new int[12][3];
		int sum = 0;

		for (int i = 0; i < corona.length; i++) {
			for (int j = 0; j < corona[i].length; j++) {
				corona[i][j] = (i + 1) * (10) + j + 1;
				sum += corona[i][j];
			}
		}
		System.out.println("1년 전체 코로나 환자수는 " + sum);
		
	}
	
}
