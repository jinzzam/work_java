package question04;

public class Print2DArray {
	public static void main(String[] args) {
//		열의 크기가 각각 달라서 비정방형 배열
		int[][] arr = {{1},
						{1, 2, 3},
						{1},
						{1, 2, 3, 4},
						{1, 2}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
