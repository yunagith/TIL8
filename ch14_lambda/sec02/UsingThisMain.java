package ch14_lambda.sec02;

public class UsingThisMain {
	public static void main(String[] args) {
		// Inner Ŭ���� method() ȣ��
		
		// (1) �ٱ� Ŭ���� ��ü ����
		UsingThis ut = new UsingThis();

		// (2) �ٱ� Ŭ���� ��ü�� �̿��ؼ� ��ø Ŭ���� ��ü ����
		UsingThis.Inner in = ut.new Inner();

		// ��ø Ŭ���� �޼ҵ� ȣ��
		in.method();

	}
}