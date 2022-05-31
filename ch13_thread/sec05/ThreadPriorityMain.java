package ch13_thread.sec05;

public class ThreadPriorityMain {

	public static void main(String[] args) {
		// 스레드 우선 순위 예제
		for(int i=0;i<10;i++) {
			Thread thread = new CalcThread("thread"+i);
			
			// 우선 순위 설정
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);	// 10이면 MAX
			}
			thread.start();
		}

	}

}
