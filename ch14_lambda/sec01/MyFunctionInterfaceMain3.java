package ch14_lambda.sec01;

public class MyFunctionInterfaceMain3 {

	public static void main(String[] args) {
		MyFunctionalInterface3 fi3;
		
		fi3=(x,y)->{return x+y;};
		System.out.println(fi3.method3(2, 5));
		
		// return���� �ִ� ��� return�� �߰�ȣ {} ����
		fi3=(x,y)-> x+y;
		System.out.println(fi3.method3(2, 5));
		
		// Integer Ŭ������ sum() �޼ҵ� ���
		
		// �Ʒ��� �߰��� sum() �޼ҵ� ���
	}

}
