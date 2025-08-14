package question03;

public class ForSample {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for(i=1;i<10;i++) {
			System.out.print(i+"+");
			sum+=i;
		}
		sum+=i;
		System.out.println(i+"="+sum);
	}
}
