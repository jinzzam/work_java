package question;

public class ThreeSixNine {
	private int number;
	
	public String process(int number) {
		String str = "박수";
//		int count = 0;
		int ten = number / 10;
		int one = number % 10;
		boolean isTen = (ten%3==0||ten%6==0||ten%9==0);
		boolean isOne = (one%3==0||one%6==0||one%9==0);
		if(isTen) {
			str+="짝";
		}
		if(isOne) {
			str+="짝";
		}
		if(!isTen && !isOne) {
			str+=" 없음";
		}
		return str;
		
		/*
		 if (a%3== 0){
		 	count++;
		 }
		 if(b%3 ==0 %% b!=0){
		 	count++;
		 }
		 if(count==2){
		 	str="박수짝짝";
		 }
		 * */
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
