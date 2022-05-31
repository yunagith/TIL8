package ch14_lambda.sec03;

public class UsingLocalVariable {
	void method(int arg) { // �Ű����� arg�� final Ư���� ����
		int localVar = 40;      // ���� ���� localVar�� final Ư���� ����
		
		//arg = 31;      		// final Ư�� ������ ���� �Ұ� (���⼭ �����ϸ� ���ٽ� ������ ��� �Ұ� : final Ư�� �ƴ϶�� ����)
		//localVar = 41;
		
		//���ٽ�
		MyFunctionalInterface fi = () -> {
			// ���� ���� ���
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar);
		};
		
		fi.method();
	}
}

