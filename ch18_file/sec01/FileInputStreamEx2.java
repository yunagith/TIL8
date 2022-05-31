package ch18_file.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		// java ���� �о���� ����
		try {
			FileInputStream fis = new FileInputStream("src\\ch18_file\\sec01\\FileInputStreamEx.java");
			
			int data;
			while((data = fis.read())!= -1){
				System.out.write((char)data);
			}
		
			// ���ۿ� ���� �ִ� ������ ��� ����ϰ� ���� ���
			System.out.flush();
			// flush() : ���ۿ� ���� �ִ� �����͸� ��� ��½�Ű�� ���۸� ���� ����
			
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
