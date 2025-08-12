package chapter02;

public class VariableExchangeExample {
	public static void main(String[] args) {
		 int x = 3;
		 int y = 5;
		 System.out.println("x : " + x +", y : " + y);
		 
//		 x값을 임시 저장
		 int temp = x;
		 x = y;
		 y = temp;
		 System.out.println("x : " + x +", y : " + y);
	}
}
