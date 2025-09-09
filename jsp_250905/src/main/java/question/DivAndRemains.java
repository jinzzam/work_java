package question;

public class DivAndRemains {
	private int number;
	
	public boolean process(int number) {
		int ten = number / 10;
		int one = number % 10;
		if(ten==one) {
			return true;
		}else {
			return false;
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
