package question06;

public class BabySum {
	public static void main(String[] args) {
		int baby[][]=new int[120][5];
		int sum=0;
		
		//baby.length: 120(month 120 반복)
		for (int month = 0; month < baby.length; month++) {
			//baby[month].length: 5(country 5 반복)
			for (int country = 0; country < baby[month].length; country++) {
				//101~105, 201~205... 12001~12005
				//(0+1)*100+0+1=101, (0+1)*100+0+2=102...105
				//(1+1)*100+0+1=201, (1+1)*100+0+2=202...205
				baby[month][country]=(month+1)*100+country+1;
				sum += baby[month][country];
			}
		}
		
		System.out.println("10년간 5개 나라의 총 신생아수는 "+sum);
	}
}
