package question09;

import java.util.Scanner;

abstract class Calc{
	int a, b;
	abstract void setValue(int a, int b);
	abstract int calculate();
}

class Add extends Calc{
	@Override
	void setValue(int a, int b) {this.a = a; this.b = b;}
	@Override
	int calculate() {return a+b;}
}
class Sub extends Calc{
	@Override
	void setValue(int a, int b) {this.a = a; this.b = b;}
	@Override
	int calculate() {return a-b;}
}
class Mul extends Calc{
	@Override
	void setValue(int a, int b) {this.a = a; this.b = b;}
	@Override
	int calculate() {return a*b;}
}
class Div extends Calc{
	@Override
	void setValue(int a, int b) {this.a = a; this.b = b;}
	@Override
	int calculate() {return a/b;}
}

public class Calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc cal = null;
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op = sc.next();
		
		switch (op) {
		case "+": {cal = (Add) new Add(); cal.setValue(a, b); System.out.println(cal.calculate());break;}
		case "-": {cal = (Sub) new Sub(); cal.setValue(a, b); System.out.println(cal.calculate());break;}
		case "*": {cal = (Mul) new Mul(); cal.setValue(a, b); System.out.println(cal.calculate());break;}
		case "/": {cal = (Div) new Div(); cal.setValue(a, b); System.out.println(cal.calculate());break;}
		
		default: {System.out.println("잘못된 연산자입니다."); break;}
		}
//		if(cal instanceof Div && b == 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}else if(b!=0){
//			System.out.println(cal.calculate());
//		}
		sc.close();
	}
}

