package chapter02;

public class Square {
	public static void main(String[] args) {
		int n = 4;
		int s = square(n); // 메소드 호출부
//		System.out.println(s);
		System.out.println("한 변의 길이가 "+ n + "인 정사각형의 넓이 : " + s);
	}

//	square : 메소드명
//	void : 리턴타입이 없음
//	public static void square() {
//	int length : int 타입의 매개변수
//	n->length로 받음
	public static int square(int length) { // 메소드 정의부
//		return;	//생략 가능
//		return "";	//타입 불일치 시 오류(String)
//		return 0;
		return length*length;
	}
}
