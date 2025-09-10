package question;

public class Capital {
	private char c;
	private String str;

	public String process() {
		StringBuffer strBuf = new StringBuffer();
		char c = 'A';
		char c2 = str.charAt(0);

		for (char i = c2; i >= c; i--) {
			for (char j = c; j <= i; j++) {
				strBuf.append(j);
			}
			strBuf.append("<br>");
		}
		return strBuf.toString();
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
