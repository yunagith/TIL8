package ch13_thread.sec04;

public class ThreadB extends Thread {
	// ������ �̸� ���� �� ��-> Thread-1�� ������ ����
	@Override
		public void run() {
			for(int i=0;i<2;i++) {
				System.out.println(getName()+"�� ����� ����");
		}
	}
}
