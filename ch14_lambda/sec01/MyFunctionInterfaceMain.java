package ch14_lambda.sec01;

public class MyFunctionInterfaceMain {

	public static void main(String[] args) {
		// �Ű������� ���ϰ��� ���� ���ٽ�
		MyFunctionalInterface fi = ()->{
			String str= "method call1";
			System.out.println(str);
		};
		//�޼ҵ� ȣ�� : ���ٽ��� �߰�ȣ {...} ����
		fi.method();
		
		// ���� ������ 1���� ���
		fi = ()->{System.out.println("method call2");};
		fi.method();
		
		// ���� ������ 1���� ��� �߰�ȣ ���� ����
		fi = ()->System.out.println("method call3");
		fi.method();
	
	}

}
