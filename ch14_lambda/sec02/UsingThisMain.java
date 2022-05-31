package ch14_lambda.sec02;

public class UsingThisMain {
	public static void main(String[] args) {
		// Inner 클래스 method() 호출
		
		// (1) 바깥 클래스 객체 생성
		UsingThis ut = new UsingThis();

		// (2) 바깥 클래스 객체를 이용해서 중첩 클래스 객체 생성
		UsingThis.Inner in = ut.new Inner();

		// 중첩 클래스 메소드 호출
		in.method();

	}
}