package question05;

public class IrregularArray2 {
	public static void main(String[] args) {
		int[][] arr = {
				{35, 36, 37, 38, 39},
				{45},
				{55, 56, 57, 58},
				{65, 66},
				{75, 76, 77}
		};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] != 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
