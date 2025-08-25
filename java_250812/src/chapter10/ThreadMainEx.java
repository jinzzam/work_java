package chapter10;

public class ThreadMainEx {
	public static void main(String[] args) {
//		현재 실행중인 스레드 이름
		String name = Thread.currentThread().getName();
		long id = Thread.currentThread().getId();
//		현재 실행중인 스레드의 우선순위
		int priority = Thread.currentThread().getPriority();	//초기값은 5
//		현재 실행중인 스레드의 상태
		Thread.State s = Thread.currentThread().getState();		//RUNNABLE : 스레드 6가지 상태 중 하나
		
		System.out.println("현재 스레드 이름 : " + name);
		System.out.println("현재 스레드 ID : " + id);
		System.out.println("현재 스레드 우선순위 값 : " + priority);
		System.out.println("현재 스레드 상태 : " + s);
	
	}
}
