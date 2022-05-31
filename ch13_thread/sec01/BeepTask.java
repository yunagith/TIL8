package ch13_thread.sec01;

import java.awt.Toolkit;

// 작업 스레드 : 비프음 출력
public class BeepTask implements Runnable {
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// 비프음 5번 연속 출력
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}	// 0.5초간 정지
		}
		
	}
	
}
