package chapter10;

public class TimerRunnable implements Runnable {

	int n = 0;

	@Override
	public void run() {

		while (true) {
			System.out.println(n);
			n++;
			try {
//				sleep은 Runnable에 정의되지 않은 추상메소드이다.
//				그래서 Thread에서 가져와야 한다.
				Thread.sleep(1000); // 1초마다 실행
			} catch (Exception e) {
//					printStackTrace : 메소드로 예외처리 기본 메시지를 출력
				e.printStackTrace();
			}

		}

	}
}
