package ch13_thread.sec03;

public class MultiThreadMain {

	public static void main(String[] args) {
		// MultiThread
		MultiThread t1 = new MultiThread(1);
		MultiThread t2 = new MultiThread(2);
		MultiThread t3 = new MultiThread(3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
