package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class ExceptionTest2 {
	//throws 선언된 메소드를 호출한 메소드
	//main 로 예외 전가
	public static void main(String[] args)
	{
		// main 에서 예외 처리
		
		// 일반적(체크)예외 : 컴파일시 미리 보이는 실행오류(버그)
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test1");
		} catch (FileNotFoundException e
				) {
			//e.printStackTrace();
			System.out.println("지정된 파일 미발견");
		}
		
		System.out.println("프로그램 정상종료");
	}
/**	
 * 	private static void openFile() {
		
		FileInputStream fis = null;
		fis = new FileInputStream("test1");
	}
*/
	
}
