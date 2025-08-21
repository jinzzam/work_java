package chapter05_01;

public class Duck extends Bird implements Swim2, Fly{

	@Override
	public void swim2() {
		System.out.println("Ducks swim");
	}
	public void fly() {
		System.out.println("Ducks fly");
	}
}
