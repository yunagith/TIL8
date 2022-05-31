package ch14_lambda.sec02;

public class UsingThis {
	int outterField = 10;
	int field = 100;
	
	class Inner {
		int innerField = 20;
		int field = 200;
		
		void method() {
			// ���ٽ�
			MyFunctionalInterface fi = () -> {
				// ��� �ʵ���� �ٸ� ��� �ƹ� ���� ����
				System.out.println("outterField : " + outterField);
				System.out.println("innerField : " + innerField);
				
				// �ٱ� Ŭ������ ��ø Ŭ������ ������ �̸��� �ʵ� ������ ���
				// Inner Ŭ������ field
				System.out.println("outter : " + field);
				System.out.println("inner : " + field);
				
				
				// �ʵ���� ������ ��쿡 �ٱ� Ŭ������ �ʵ尪 �߷�
				// Ŭ������.this ���
				System.out.println("outter : " + UsingThis.this.field);
				
				// this �� ����ϸ� Inner Ŭ���� ��ü ����
				System.out.println("inner : " + this.field);
			};
			
			fi.method();
		}
	}
}
