package ch13_thread.sec06;

public class Calculator {
	private int memory;
	
	public int getMemory(){
		return memory;
	}
	// ����ȭ �޼ҵ�� ���� : synchronized
	public synchronized void setMemory(int memory) {
		this.memory =memory;
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
	}
}
