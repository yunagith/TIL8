package ch13_thread.sec01;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		// ���� �����常 �ִ� ���� - 2���� �۾��� ������� �ϳ��� ó��
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// ������ 5�� ���� ���
		for(int i=0;i<5;i++) {
			toolkit.beep();
				toolkit.beep();
				try {Thread.sleep(500);}catch(Exception e) {}
		}
		// �� 5�� ���� ���
				for(int i=0;i<5;i++) {
					toolkit.beep();
					System.out.println("��");
						try {Thread.sleep(500);}catch(Exception e) {}


	}

}
}