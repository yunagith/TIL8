package ch18_file.sec01;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		// ���� ����
		
		// ���� ��ü
		File dir = new File("C:/test/Dir");
		// ��� ǥ�� : / �Ǵ� \\
		
		// mkdirs() �޼ҵ� : ��� �� ���� ���丮 �����ϰ� ��� ��ȯ
		boolean result = dir.mkdirs();
		System.out.println(result);	// ���� ���� Ȯ��
		// ù ��° ���� ���� : test\Dir�� �̹� �����ϹǷ� �������� �ʰ� false ��ȯ
		
		// �������� ���� test2\\Dir2 ����
		File dir2 = new File("C:\\test\\test2\\Dir2");
		dir2.mkdirs();	// ���� ���� Ȯ��
		
		File dir3 = new File("C:\\test3\\Dir3");
		if(dir3.exists()==false) {dir3.mkdir();}
		// mkdir() : �ٷ� ���� ���丮 �������� ������ ���� �Ұ�
		
		File dir4 = new File("C:\\test\\Dir4");
		if(dir4.exists()==false) {dir4.mkdir();}
		// �ٷ� ���� ���丮 test �����ϹǷ� Dir4 ����
		
		//��� ���� �� �� ��� ������Ʈ Root ��ο� ������
		File dir5 = new File("Dir5");
		dir5.mkdir();
		
		// ���� ��ü ����
		File file1 = new File("C:/test/file1.txt");
		File file2 = new File("C:/test/Dir/file2.txt");
		
		//createNewFile() : ���� ���� �� ��� ��ȯ (true/false)
		if(file1.exists()==false) {file1.createNewFile();}
		if(file2.exists()==false) {file2.createNewFile();}
		
		System.out.println("File1 Path : "+file1.getPath());
		System.out.println("File1 Name : "+file1.getName());
		System.out.println("File1 Length : "+file1.length());
	}

}








