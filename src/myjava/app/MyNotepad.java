package myjava.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/***/
public class MyNotepad {
	public static void main(String[] args) {
		/**
		 * ※  메소드 호출시, 빨간 줄 그어질 경우 2가지 고려할 사항:
		 * 1. 메소드 미발견  :  " ~ Cannot be resolved to a type"
		 * 2. 버그(예외)  :  "Unhandled exception type FileNotFoundException"
		 * 				→ surround try ~ catch statement
		 * */ 

		try {
			FileInputStream fis = new FileInputStream("memo2.txt");
			System.out.println("파일을 발견했습니다.");
			/**
			 * fis.read() 메소드 호출시, 오류메시지: Unhandled exception type IOException
			 * 어떤 방법을 쓸까? 다중 catch문을 사용한다. add catch를 선택하면 되겠다.
			 * */
			System.out.println(fis.read());
		} catch (FileNotFoundException e) {
			
			/**e 인스턴스 객체안에는 해당 버그에 대한 상세한 정보가 담겨있음.
			printStackTrace() 메소드 호출시, 버그정보가 console에 찍힌다.*/
			e.printStackTrace();
			
		} catch (IOException e) {//fis.read()에 대한 catch문
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}
