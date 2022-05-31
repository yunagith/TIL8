package ch18_file.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		// java 파일 읽어오기 예제
		try {
			FileInputStream fis = new FileInputStream("src\\ch18_file\\sec01\\FileInputStreamEx.java");
			
			int data;
			while((data = fis.read())!= -1){
				System.out.write((char)data);
			}
		
			// 버퍼에 남아 있는 데이터 모두 출력하고 버퍼 비움
			System.out.flush();
			// flush() : 버퍼에 남아 있는 데이터를 모두 출력시키고 버퍼를 비우는 역할
			
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
