package question;

public class Asterisk {
	private int number;

	public String process(int n) {
//	public String process() {
//		StringBuffer strBuf = new StringBuffer();
		String str="";
		for (int i = n; i >= 1; i--) {
			for (int j = i; j > 0; j--) {
				str += "*";
//				strBuf.append('*');
			}
			str += "<br>";
//			strBuf.append("<br>");
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
