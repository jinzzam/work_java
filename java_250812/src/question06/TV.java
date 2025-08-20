package question06;

public class TV {
	String manufacturer;
	int year;
	int size;
	
	public TV(String manufacturer, int year, int size) {
		this.manufacturer=manufacturer;
		this.year=year;
		this.size=size;
	}
	
	public void show() {
		System.out.print(manufacturer+"에서 만든 ");
		System.out.print(year+"년형 ");
		System.out.print(size+"인치 TV");
	}
	
	public static void main(String[] args) {
		TV myTV=new TV("LG", 2017, 32);
		myTV.show();
	}
}
