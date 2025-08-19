package question05;


public class ReturnArray2 {
	public int[] makeArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 100;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ReturnArray2 r = new ReturnArray2();
		r.makeArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
