package question;

import java.util.Random;

public class TwoArray {
	private int n;
	int[][] arr = new int[10][10];
	String list = "";

	public String process() {
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = random.nextInt(10);
				list += arr[i][j] + " ";
			}
			list += "<br>";
		}
		return list;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}
