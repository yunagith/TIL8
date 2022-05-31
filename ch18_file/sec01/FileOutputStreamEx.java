package ch18_file.sec01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// FileOutputStream 예제
		FileOutputStream os = null;
		
		try {
			// 파일이 존재하지 않으면 새로 만들고
			// 존재하면 이전 내용 덮어씀
			//os = new FileOutputStream("src\\ch18_file\\sec01\\fileWrite.txt");
			
			// 이전 내용 덮어쓰지 않고 맨 뒤에 추가할 수 있도록 추가모드(appeng 모드)로 파일열고
			// 맨 뒷부분에 추가로 입력
			os = new FileOutputStream("src\\ch18_file\\sec01\\fileWrite.txt",true);
			
			// 출력할 문자열
			String strOut = "\n내용 다시 변경";
			byte[] bs = strOut.getBytes();
			
			// 파일에 쓰기
			os.write(bs);
			os.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
