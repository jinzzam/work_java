package question;

public class Alphabet {
	private char c;
//	private String str;

	public String process() {
		/*
		StringBuffer strBuf = new StringBuffer();
		char c='a';
		char c2 = str.charAt(0);
		
		do {
			strBuf.append(c);
			c = (char)(c+1);
			
		}while(c<=c2);
		
		return strBuf.toString();
		*/
		
		int n = c;
		String str = "";
		for (char i = 'a'; i <= n; i++) {
			str += i;
		}
		return str;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}
	
}
