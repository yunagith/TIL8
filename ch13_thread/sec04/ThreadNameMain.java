package ch13_thread.sec04;

public class ThreadNameMain {

	public static void main(String[] args) {
		// 스레드 이름 예제
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : "+mainThread.getName()); //main
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름 : "+ threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름 : "+ threadB.getName());
		threadB.start();

	}

}
