package question09;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
	
}

public class ColorTv extends TV{
	int pxel;
	public int getPxel() {
		return pxel;
	}
	public ColorTv(int size, int pxel) {
		super(size);
		this.pxel = pxel;
	}
	public void printProperty() {
		System.out.println( getSize()+"인치 " + getPxel()+"컬러");
	}
	

	public static void main(String[] args) {
//		ColorTv myTV = new ColorTv(32, 1024);
//		System.out.println(myTV.printProperty());
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
