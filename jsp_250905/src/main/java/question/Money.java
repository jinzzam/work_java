package question;

public class Money {
	int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
	private int money;
	private int res;
	private String moneyStr="";

	public String process() {
		for (int i = 0; i < unit.length; i++) {
			res = money / unit[i];
			money = money % unit[i];
			if (res > 0) {
				moneyStr += unit[i] + "원 짜리 : " + res + "개";
				moneyStr += "<br>";
			}
		}
		return moneyStr;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getMoneyStr() {
		return moneyStr;
	}

	public void setMoneyStr(String moneyStr) {
		this.moneyStr = moneyStr;
	}
	
}
