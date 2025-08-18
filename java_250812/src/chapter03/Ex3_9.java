package chapter03;

/*
 * 구구단을 배열로 생성
 * 값을 넣어 본다. ex)2*7=14, 9*4 = 36
 * */
public class Ex3_9 {
	public static void main(String[] args) {
//		int[][] gugudan;
//		9*9 배열 생성
//		int[][] gugudan = new int[9][9]; // 0~8
		int[][] gugudan = new int[10][10]; // 0~9

		for (int i = 1; i <= 9; i++) { // 행기준
			for (int j = 1; j <= 9; j++) {// 열기준
//				비어있는 원소 : [0][0], [0][1], [1][0]
				gugudan[i][j] = i*j;
			}
		}
		System.out.println("2 X 7 = "+gugudan[2][7]);
		System.out.println("9 X 4 = "+gugudan[9][4]);

	}
}
