package question;

public class Arithmetic {
	private int num1;
	private int num2;
	private String op;
	String str = "";

	public String process(String op, int num1, int num2) {
		
		switch (op) {
		case "+":
			str = "" + (num1 + num2);
			break;
		case "-":
			str = "" + (num1 - num2);
			break;
		case "*":
			str = "" + (num1 * num2);
			break;
		case "/":
			if (num2 == 0) {
				str += "0으로 나눌 수 없습니다. ";
				break;
			}
			str = "" + (num1 / num2);
			break;
		default:
			str += "사칙 연산이 아닙니다. ";
			break;
		}

		return str;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
}
