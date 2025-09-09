package question;

public class ThreeSixNine {
	private int number;
	
	public String process(int number) {
		String str = "박수";
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
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
