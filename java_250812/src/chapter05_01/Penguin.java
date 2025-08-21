package chapter05_01;

//public class Penguin extends Bird{
//자바 클래스 다중 상속 불가
//public class Penguin extends Bird, Swim{	//error
public class Penguin extends Bird implements Swim2{	//인터페이스 다중상속 됨(implement 키워드 사용)

	@Override
	public void swim2() {
		System.out.println("Penguins swim");
	}
	
}
