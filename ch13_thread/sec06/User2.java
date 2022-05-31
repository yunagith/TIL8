package ch13_thread.sec06;

public class User2 extends Thread {
	private Calculator cal;
	
	public void setCal(Calculator cal) {
		this.setName("User2");
		this.cal = cal;
	}
	@Override
	public void run() {
		cal.setMemory(50);
	}
}
