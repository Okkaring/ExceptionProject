package myjava.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/***/
public class MyNotepad01 {
	public static void main(String[] args) {
		try {
			FileInputStream files = new FileInputStream("memo.txt");
			//System.out.println(files.read());//파일의 제일 앞글자의 글자를 byte코드로 (int)첫번째 글자를 출력한다.
			System.out.println((char)files.read());//char형으로 형변환해서 출력하면 두번째 글자가 나온다.
			System.out.println("프로그램 정상종료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("악성 바이러스 제거 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
