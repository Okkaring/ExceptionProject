package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) {
		String s=null;
		
		//s="abc";
		
		//NullPointerException 널참조변수가 메소드 호출
		if(s!=null){//s 널검증
		//실행시(언체크)예외 : 실행시보이는 실행오류
			System.out.println(s.charAt(0));
		}
		
		//일반적(체크)예외 : 컴파일시 미리 보이는 실행오류 
		
		FileInputStream fis=null;
		try {
			//test 파일에 저장된 데이터를 읽기위해서 오픈
			fis = new FileInputStream("test");
			//하나 읽기
			System.out.println((char)fis.read());
			
			//다중 catch(상위에 자식예외를 두자)
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// FileNotFoundException 예외 처리
			//e.printStackTrace(); //디버깅정보 파악
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			System.out.println("확인후 시도");
			System.out.println("로깅과 오류SMS메세지 발송");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//예외발생상관없이 처리되는 코드
			System.out.println("무조건 실행(파일닫기)");
			fis=null;
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //닫기
		}
		System.out.println("프로그램 정상종료");
		
	}

}
