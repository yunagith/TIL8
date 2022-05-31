package ch13_thread.sec05;

// 계산 작업하는 스레드
public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	@Override
	public void run() {
		for(int i=0;i<2000000000;i++) {}
		
		System.out.println(getName());
	}
	
}
