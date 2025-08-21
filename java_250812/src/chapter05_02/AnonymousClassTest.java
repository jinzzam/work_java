package chapter05_02;

interface RemoteControl{
	void turnOn();	//public abstract 생략한 추상메소드
	void turnOff();	//public abstract 생략
}
public class AnonymousClassTest {
	public static void main(String[] args) {
		// 익명 클래스 정의(인터페이스 이름 사용->객체 구현)
		RemoteControl rc =  new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("TV turnOn");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV turnOff");
			}
		};
		
		rc.turnOn();
		rc.turnOff();
	}
	
}
