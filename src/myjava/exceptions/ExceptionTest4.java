package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest4 {
	// throws 선언된 메소드를 호출한 메소드
	// 우선 main도 자바에게 모든 예외 전가
	// 핵심 코딩후 예외 정상 처리
	public static void main(String[] args) throws Exception {
		// main 에서 예외 처리 X

		openFile();

		System.out.println("프로그램 정상종료");
	}

	private static void openFile() throws FileNotFoundException {
		// 일반적(체크)예외 : 컴파일시 미리 보이는 실행오류
		FileInputStream fis = null;
		fis = new FileInputStream("test1");
	}

}
