package question09;

public class IPTV extends ColorTv {
	private String IP;

	public String getIP() {
		return IP;
	}

	public IPTV(String iP, int size, int nColor) {
		super(size, nColor);
		this.IP = iP;
	}

	public void printProperty() {
		System.out.print("나의 IPTV는 " + getIP() + "주소의 ");
		super.printProperty();
	}

}
