package ch13_thread.sec04;

public class ThreadB extends Thread {
	// 스레드 이름 설정 안 함-> Thread-1로 지정될 것임
	@Override
		public void run() {
			for(int i=0;i<2;i++) {
				System.out.println(getName()+"가 출력한 내용");
		}
	}
}
