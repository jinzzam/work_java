package chapter10;

public class TimerThread extends Thread {
	int n = 0;

	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000); // 1초마다 실행
			} catch (Exception e) {
//					printStackTrace : 메소드로 예외처리 기본 메시지를 출력
				e.printStackTrace();
			}
		}
	}
}
