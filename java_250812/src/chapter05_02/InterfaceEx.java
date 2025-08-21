package chapter05_02;

// 기본폰, 전화를 걸어서 100초 동안 응답 없으면 타임아웃
// 전화 거는 기능, 받는 기능, 화면에 폰이라고 출력
interface PhoneInterface{
//	public static final int TIMEOUT = 100;
	int TIMEOUT = 100; // public static final 생략해도 상수
//	public abstract void sendCall();	//추상메소드
	void sendCall();	//public abstract 생략한 추상메소드
	void receivedeCall();	//public abstract 생략한 추상메소드
//	default void printLogo(); //default(일반 메소드)는 구현해야 함
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

//삼성폰을 만들 때 기본 폰 기능을 사용
class SamsungPhone implements PhoneInterface{
	//추상메소드 오버라이딩 2개
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receivedeCall() {
		System.out.println("전화가 왔습니다.");
	}

	// 삼성 폰 고유의 기능
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo(); //인터페이스 상속 받아서 사용
		phone.sendCall(); //추상메소드 구현해서 사용
		phone.receivedeCall(); //추상메소드 구현해서 사용
		phone.flash(); //삼성 폰 고유의 기능
	}
}
