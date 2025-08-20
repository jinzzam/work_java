package chapter05;

//class Calculator{
//	
//}
abstract class Calculator { // 추상 클래스 선언(추상 메소드는 없어도 됨)
//	public int add(int a, int b) {return 1;}
//	public abstract int add(int a, int b) {return 1;}	//추상메소드는 구현시 오류
	public abstract int add(int a, int b); // 추상메소드 선언
	public abstract int subtract(int a, int b); // 추상메소드 선언
	public abstract double average(int[] a); // 추상메소드 선언
}

public class GoodCalc extends Calculator { // 추상메소드 오버라이딩 구현 안하면 오류
//	public abstract class GoodCalc extends Calculator{	//추상메소드는 구현 불필요
	public static void main(String[] args) {
//		Cannot instantiate the type Calculator
//		Calculator calculator = new Calculator();	추상 클래스의 객체 생성 불가
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2, 3, 4}));
	}

	@Override // @는 어노테이션(시스템 주석)=>생략해도 문제 없음
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}
	
	@Override
		public double average(int[] a) {
			double sum=0;
			for (int i = 0; i < a.length; i++) {
				sum += a[i];
			}
		return sum/a.length;
		}
}
