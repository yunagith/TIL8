package ch13_thread.sec06;

public class NonSyncMain {

	public static void main(String[] args) {
		// �񵿱�ȭ ���� �� ���� ����
		Calculator cal = new Calculator();
		
		User1 user1 = new User1();
		user1.setCal(cal);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCal(cal);
		user2.start();

	}

}