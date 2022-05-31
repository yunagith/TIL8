package ch13_thread.sec07;

public class ThreadStateMain {

	public static void main(String[] args) {
		// 스레드 상태 예제
		StatePrintThread thread = new StatePrintThread(new TargetThread());
		thread.start();

	}

}
