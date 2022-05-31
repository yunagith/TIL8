package ch13_thread.sec07;

public class StatePrintThread extends Thread {
	private Thread targetThread;

	// 생성자 : 객체 생성 시 targetThread
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	@Override
	public void run() {
		
	// 0.5초 주기로 TargetThread의 상태를 얻어서 출력
	while(true) {
		// 스레드 상태를 나타내는 열거 상수 문자열 반환
		Thread.State state = targetThread.getState();
		System.out.println("타겟 스레드 상태 : "+state);
		
		if(state==Thread.State.NEW) {
			targetThread.start();	// 스레드 시작(실행 대기 또는 실행 상태)
		}
		
		if(state==Thread.State.TERMINATED) {
			break;
		}
		
		try {
			Thread.sleep(500); //0.5초 정지
		} catch (InterruptedException e) {	//
		}
	}
	}
	
}
