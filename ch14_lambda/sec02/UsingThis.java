package ch14_lambda.sec02;

public class UsingThis {
	int outterField = 10;
	int field = 100;
	
	class Inner {
		int innerField = 20;
		int field = 200;
		
		void method() {
			// 람다식
			MyFunctionalInterface fi = () -> {
				// 멤버 필드명이 다를 경우 아무 문제 없음
				System.out.println("outterField : " + outterField);
				System.out.println("innerField : " + innerField);
				
				// 바깥 클래스와 중첩 클래스에 동일한 이름의 필드 존재할 경우
				// Inner 클래스의 field
				System.out.println("outter : " + field);
				System.out.println("inner : " + field);
				
				
				// 필드명이 동일한 경우에 바깥 클래스의 필드값 추력
				// 클래스명.this 사용
				System.out.println("outter : " + UsingThis.this.field);
				
				// this 만 사용하면 Inner 클래스 객체 참조
				System.out.println("inner : " + this.field);
			};
			
			fi.method();
		}
	}
}
