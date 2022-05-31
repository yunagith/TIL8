package ch13_thread.sec07;

public class StatePrintThread extends Thread {
	private Thread targetThread;

	// ������ : ��ü ���� �� targetThread
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	@Override
	public void run() {
		
	// 0.5�� �ֱ�� TargetThread�� ���¸� �� ���
	while(true) {
		// ������ ���¸� ��Ÿ���� ���� ��� ���ڿ� ��ȯ
		Thread.State state = targetThread.getState();
		System.out.println("Ÿ�� ������ ���� : "+state);
		
		if(state==Thread.State.NEW) {
			targetThread.start();	// ������ ����(���� ��� �Ǵ� ���� ����)
		}
		
		if(state==Thread.State.TERMINATED) {
			break;
		}
		
		try {
			Thread.sleep(500); //0.5�� ����
		} catch (InterruptedException e) {	//
		}
	}
	}
	
}
