package question;

public class GuGuDan {
	public String process(int n) {
		String str="";
		for (int i = 1; i <= 9; i++) {
			str+=(n + " * " + i + " = " + n * i + "<br>");
		}
		return str;
	}
}
