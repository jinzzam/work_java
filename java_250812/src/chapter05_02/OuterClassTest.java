package chapter05_02;

class OuterClass{	//외부 클래스
	private String secret="Time is money";
//	public String secret="Time is money";
	public OuterClass() {	// 2. 달걀의 생성자 호출됨
//		new InnerClass();	// 3. 노른자 객체 생성
		InnerClass obj =  new InnerClass();	// 3. 노른자 객체 생성
		obj.method(); //a
	}
	public class InnerClass{	//내부(중첩 or inner) 클래스
		public InnerClass() {	//4. 노른자의 생성자 호출됨
			System.out.println("내부 클래스의 생성자 입니다.");	//정상출력됨
		}
		//b
		public void method() {
			//c 노른자(내부)에서 달걀(외부)의 private 접근
			System.out.println(secret);
		}
	}
	
}

public class OuterClassTest {
	public static void main(String[] args) {
//		new OuterClass();
		OuterClass outer = new OuterClass();	//1. 달걀 객체 생성
//		new InnerClass();	//내부 클래스 접근 불가
//		outer.secret="";	//접근 제한(private 이면)
	}
}
