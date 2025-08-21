package chapter06;

class Point{
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
public class ObjectPropertyEx {
//	매개변수로 객체를 받는다
	public static void print(Object obj) { //Object obj=new Point(2, 3)->업캐스팅
//		실행 중인 클래스
		System.out.println(obj.getClass());	//class chapter06.Point
		System.out.println(obj.getClass().getName()); //chapter06.Point
		System.out.println(obj.hashCode()); //2055281021 : 객체의 서명(10진수 해시코드)
		System.out.println(obj.toString()); //chapter06.Point@c39f790: 패키지.클래스@16진수 해시코드
		System.out.println(obj); //문자열로 변환해서 출력
	}
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p);
	}
}
