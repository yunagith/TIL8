package ch13_thread.sec04;

public class ThreadNameMain {

	public static void main(String[] args) {
		// ������ �̸� ����
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : "+mainThread.getName()); //main
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸� : "+ threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸� : "+ threadB.getName());
		threadB.start();

	}

}
