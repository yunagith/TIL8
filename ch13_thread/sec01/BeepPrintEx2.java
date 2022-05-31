package ch13_thread.sec01;

import java.awt.Toolkit;

public class BeepPrintEx2 {

	public static void main(String[] args) {
	// 멀티 스레드 예제
	// 메인 스레드 : 띵 출력
	// 작업 스레드 : 비프음 출력
	// (1) Runnable 구현 객체 대입 방법 1
	// Runnable beepTask = new BeepTask(); // Runnable 객체 구현
	//Thread thread = new Thread(beepTask); // 작업 스레드 생성
	
	// (2) Runnable 구현 객체 대입 방법 2
	//위 두 행을 한 행으로 처리
	//Thread thread = new Thread(new BeepTask()); // 작업 스레드 생성
	
	// (3) Runnable 구현 객체 대입 방법 3
	// 익명 구현 객체 사용
	
	/*Thread thread = new Thread(new Runnable() {
		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			// 비프음 5번 연속 출력
			for(int i=0;i<5;i++) {
				
				System.out.println("띵");
				try {Thread.sleep(500);}catch(Exception e) {}
			}
		}
	});*/
	
	// (4) Runnable 구현 객체 대입 방법 4
	// 람다식 사용
	
	Thread thread = new Thread(()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			// 비프음 5번 연속 출력
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try {Thread.sleep(500);}catch(Exception e) {} // 0.5초간 정지
			}
	});
	
	// BeepTask 객체의 run() 메소드 실행
	thread.start();	
	
	// 메인 스레드 작업 처리
	// 띵 5번 연속 출력
	for(int i=0;i<5;i++) {
		
		System.out.println("띵");
		try {Thread.sleep(500);}catch(Exception e) {}
	}
	}
}
