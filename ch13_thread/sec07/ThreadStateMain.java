package ch13_thread.sec07;

public class ThreadStateMain {

	public static void main(String[] args) {
		// ������ ���� ����
		StatePrintThread thread = new StatePrintThread(new TargetThread());
		thread.start();

	}

}
