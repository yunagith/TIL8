package ch13_thread.sec02;

import java.awt.Toolkit;

// �۾� ������ : ������ ���
// Thread Ŭ������ ���� ��� ����
public class BeepThread extends Thread {
 @Override
 public void run() {
	 Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// ������ 5�� ���� ���
		for(int i=0;i<5;i++) {
			
			System.out.println("��");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
}
}
