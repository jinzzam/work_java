package question06;

class TV {
	String s;
	int year;
	int inch;

	public TV(String s, int year, int inch) {
		this.s = s;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.println(s + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}

public class TVclass {
	public static void main(String[] args) {
		TV myTv = new TV("LG", 2017, 32);
		myTv.show();
		
	}
}
