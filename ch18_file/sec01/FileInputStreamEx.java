package ch18_file.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// FileInputStream ����
		try {
			FileInputStream fis = new FileInputStream("C:\\test\\Dir\\file2.txt");
			
			/*while(true) {
				int data = fis.read();
				
				if(data==-1) break; // �� �о����� -1 ��ȯ ����
				System.out.print((char)data);
			}*/
			
			// write() ����ؼ� ���
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
