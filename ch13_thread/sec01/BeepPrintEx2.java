package ch13_thread.sec01;

import java.awt.Toolkit;

public class BeepPrintEx2 {

	public static void main(String[] args) {
	// ��Ƽ ������ ����
	// ���� ������ : �� ���
	// �۾� ������ : ������ ���
	// (1) Runnable ���� ��ü ���� ��� 1
	// Runnable beepTask = new BeepTask(); // Runnable ��ü ����
	//Thread thread = new Thread(beepTask); // �۾� ������ ����
	
	// (2) Runnable ���� ��ü ���� ��� 2
	//�� �� ���� �� ������ ó��
	//Thread thread = new Thread(new BeepTask()); // �۾� ������ ����
	
	// (3) Runnable ���� ��ü ���� ��� 3
	// �͸� ���� ��ü ���
	
	/*Thread thread = new Thread(new Runnable() {
		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			// ������ 5�� ���� ���
			for(int i=0;i<5;i++) {
				
				System.out.println("��");
				try {Thread.sleep(500);}catch(Exception e) {}
			}
		}
	});*/
	
	// (4) Runnable ���� ��ü ���� ��� 4
	// ���ٽ� ���
	
	Thread thread = new Thread(()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			// ������ 5�� ���� ���
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try {Thread.sleep(500);}catch(Exception e) {} // 0.5�ʰ� ����
			}
	});
	
	// BeepTask ��ü�� run() �޼ҵ� ����
	thread.start();	
	
	// ���� ������ �۾� ó��
	// �� 5�� ���� ���
	for(int i=0;i<5;i++) {
		
		System.out.println("��");
		try {Thread.sleep(500);}catch(Exception e) {}
	}
	}
}
