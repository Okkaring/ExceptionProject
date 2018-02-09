package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest5 {
	// throws 선언된 메소드를 호출한 메소드
	// 우선 main도 자바에게 모든 예외 전가
	// 핵심 코딩후 예외 정상 처리
	public static void main(String[] args)  {
		// main 에서 예외 처리 

		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("2. 파일 열기 실패");
		}

		System.out.println("프로그램 정상종료");
	}

	private static void openFile() throws FileNotFoundException {
		//  try  finally
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test1");
		} finally {
			System.out.println("1. fis 파일닫기");
		}
	}

}
