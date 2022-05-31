package ch13_thread.sec02;

import java.awt.Toolkit;

// 작업 스레드 : 비프음 출력
// Thread 클래스로 부터 상속 받음
public class BeepThread extends Thread {
 @Override
 public void run() {
	 Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// 비프음 5번 연속 출력
		for(int i=0;i<5;i++) {
			
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
}
}
