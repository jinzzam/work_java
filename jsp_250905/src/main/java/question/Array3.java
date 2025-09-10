package question;

import java.util.Random;

public class Array3 {
	private int n;
	int[] arr = new int[100];
	String list = "";

	public String process() {
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = random.nextInt(100);
			list += arr[i] + " ";
			if (i != 0 && i % 10 == 0) {
				list += "<br>";
			}
		}
		return list;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

}
