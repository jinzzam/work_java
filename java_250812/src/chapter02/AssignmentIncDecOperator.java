package chapter02;

public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		int a=3, b= 3, c=3;
//		a = a+3;
		a+=3;
		b*=3;
		c%=2;
		System.out.println("a="+a+", b="+b+", c="+c);
		
		int d=3;
//		후위 연산자 : d를 먼저 a에 넘기고, 1을 증가
		a = d++;	
		System.out.println("a=" + a + ", d=" + d);

//		전위 연산자 : 먼저 1 증가하고 a에 저장
		a = ++d;	
		System.out.println("a=" + a + ", d=" + d);

		a = d--;	
		System.out.println("a=" + a + ", d=" + d);

		a = --d;	
		System.out.println("a=" + a + ", d=" + d);
	}
}
