package question09;

import java.util.Scanner;

abstract class Calc{
	int a, b;
	abstract void setValue(int a, int b);
	abstract int calculate();
}

class Add extends Calc{

	@Override
	void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a; this.b = b;
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
class Sub extends Calc{
	
	@Override
	void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a; this.b = b;
	}
	
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}
class Mul extends Calc{
	
	@Override
	void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a; this.b = b;
	}
	
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}
class Div extends Calc{
	
	@Override
	void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a; this.b= b;
	}
	
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}

public class Calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc cal;
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op = sc.next();
		
		switch (op) {
		case "+": {cal = (Add) new Add(); cal.setValue(a, b); System.out.println(cal.calculate());break;}
		case "-": {cal = (Sub) new Sub(); cal.setValue(a, b); System.out.println(cal.calculate());break;}
		case "*": {cal = (Mul) new Mul(); cal.setValue(a, b); System.out.println(cal.calculate());break;}
		case "/": {cal = (Div) new Div(); cal.setValue(a, b); System.out.println(cal.calculate());break;}
		}
		sc.close();
	}
}
