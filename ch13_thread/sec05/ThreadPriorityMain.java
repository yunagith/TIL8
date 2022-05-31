package ch13_thread.sec05;

public class ThreadPriorityMain {

	public static void main(String[] args) {
		// ������ �켱 ���� ����
		for(int i=0;i<10;i++) {
			Thread thread = new CalcThread("thread"+i);
			
			// �켱 ���� ����
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);	// 10�̸� MAX
			}
			thread.start();
		}

	}

}
