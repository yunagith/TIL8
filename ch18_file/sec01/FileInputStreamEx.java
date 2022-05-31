package ch18_file.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// FileInputStream 예제
		try {
			FileInputStream fis = new FileInputStream("C:\\test\\Dir\\file2.txt");
			
			/*while(true) {
				int data = fis.read();
				
				if(data==-1) break; // 다 읽었으면 -1 반환 종료
				System.out.print((char)data);
			}*/
			
			// write() 사용해서 출력
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
