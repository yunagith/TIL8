package ch13_thread.sec07;

public class TargetThread extends Thread {
	@Override
	public void run() {
		for(long i=0;i<1000000000;i++) {}	// ���� ��� ���� �Ǵ� ���� ����
		
		try{
			Thread.sleep(1500); // 1.5�ʰ� ����
		}catch(InterruptedException e) {
		}
		for(long i=0;i<1000000000;i++) {} // ���� ��� ���� �Ǵ� ���� ����
		// ����Ǹ� ������ ���� ���� : TERMINATED
		}
	}