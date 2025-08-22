package chapter07;

//대문자 알파벳 T를 "타입 파라미터"로 받은 제네릭
public class Box2<T> {	//T가 String , Integer
	private T t;	//타입 파라미터를 t의 타입으로 사용
//	3. Hello
	//타입 파라미터를 메소드의 리턴 타입으로 사용
	//T가 String , Integer
	public T get() {
		return t;
	}
	//타입 파라미터를 메소드의 매개변수 타입으로 사용
	//T가 String, Integer
	public void set(T t) {	// 1. Hello (변환없이 저장됨)
		this.t = t;	// 2. Hello
	}
}
