package ch18_file.sec01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// FileOutputStream ����
		FileOutputStream os = null;
		
		try {
			// ������ �������� ������ ���� �����
			// �����ϸ� ���� ���� ���
			//os = new FileOutputStream("src\\ch18_file\\sec01\\fileWrite.txt");
			
			// ���� ���� ����� �ʰ� �� �ڿ� �߰��� �� �ֵ��� �߰����(appeng ���)�� ���Ͽ���
			// �� �޺κп� �߰��� �Է�
			os = new FileOutputStream("src\\ch18_file\\sec01\\fileWrite.txt",true);
			
			// ����� ���ڿ�
			String strOut = "\n���� �ٽ� ����";
			byte[] bs = strOut.getBytes();
			
			// ���Ͽ� ����
			os.write(bs);
			os.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
