package question02;

public class WhileTest {
	public static void main(String[] args) {
		int i=0;
		int sum = 0;
		while (i<100) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
	}
}

/*
 * while (i<100) {
 * 	sum+=i;
 * 	i+=2;
 * }
 * */
 