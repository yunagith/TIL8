package ch13_thread.sec06;

public class NonSyncMain {

	public static void main(String[] args) {
		// 비동기화 됐을 때 오류 예제
		Calculator cal = new Calculator();
		
		User1 user1 = new User1();
		user1.setCal(cal);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCal(cal);
		user2.start();

	}

}
