package ch18_file.sec01;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		// 파일 예제
		
		// 파일 객체
		File dir = new File("C:/test/Dir");
		// 경로 표시 : / 또는 \\
		
		// mkdirs() 메소드 : 경로 상에 없는 디렉토리 생성하고 결과 반환
		boolean result = dir.mkdirs();
		System.out.println(result);	// 폴더 생성 확인
		// 첫 번째 이후 실행 : test\Dir은 이미 존재하므로 생성하지 않고 false 반환
		
		// 존재하지 않은 test2\\Dir2 생성
		File dir2 = new File("C:\\test\\test2\\Dir2");
		dir2.mkdirs();	// 폴더 생성 확인
		
		File dir3 = new File("C:\\test3\\Dir3");
		if(dir3.exists()==false) {dir3.mkdir();}
		// mkdir() : 바로 상위 디렉토리 존재하지 않으면 생성 불가
		
		File dir4 = new File("C:\\test\\Dir4");
		if(dir4.exists()==false) {dir4.mkdir();}
		// 바로 상위 디렉토리 test 존재하므로 Dir4 생성
		
		//경로 지정 안 한 경우 프로젝트 Root 경로에 생성됨
		File dir5 = new File("Dir5");
		dir5.mkdir();
		
		// 파일 객체 생성
		File file1 = new File("C:/test/file1.txt");
		File file2 = new File("C:/test/Dir/file2.txt");
		
		//createNewFile() : 파일 생성 후 결과 반환 (true/false)
		if(file1.exists()==false) {file1.createNewFile();}
		if(file2.exists()==false) {file2.createNewFile();}
		
		System.out.println("File1 Path : "+file1.getPath());
		System.out.println("File1 Name : "+file1.getName());
		System.out.println("File1 Length : "+file1.length());
	}

}








