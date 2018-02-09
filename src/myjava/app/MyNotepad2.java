package myjava.app;

import java.io.FileInputStream;
import java.io.IOException;
/**수정 내역:
 * 예외처리문의 단일화
 * 모든 예외의 상위객체인 Exception으로 해결하고,
 * 그 다음 상세하게 처리하는 것이 좋을 것이다.
 * */
public class MyNotepad2 {
	public static void main(String[] args) {
		FileInputStream files = null;//전역에서 쓸 수 있도록 초기화를 try영역 밖으로 뺀것.
		try {
			files = new FileInputStream("memo2.txt");
			System.out.println((char)files.read());
			System.out.println("프로그램 정상종료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("악성 바이러스 제거 완료");
		} finally {
			/**
			 * files.close()메소드 출력시 예외: 
			 * Unhandled exception type IOException → try~catch
			 * */
			try {
				files.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}