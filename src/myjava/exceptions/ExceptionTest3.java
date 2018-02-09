package myjava.exceptions;

import java.io.FileInputStream;

public class ExceptionTest3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s = null;
		s="abc";
		
		//NullPointerException 널참조변수가 메소드 호출
		
		if(s != null){//널검증
		//실행시(언체크)예외 : 실행시보이는 실행오류
			System.out.println(s.charAt(0));
		}
		
		//일반적(체크)예외 : 컴파일시 미리 보이는 실행오류 
		FileInputStream fis = null;
		
		try {// 1.일단 버그(예외)발생시 버그를 잡아라
			fis = new FileInputStream("test1");//파일 열기
			System.out.println((char)fis.read());
			
			/**
			Exception으로 catch 단일화 
			다양한 자식 버그 예외를 부모 Exception으로 catch후
			예외 처리 단일화
			*/
		}  catch (Exception e) {// 2. 잡은 예외클래스명 명시후 처리 e: 버그명 ,메세지
			e.printStackTrace();//자세한 예외정보(호출한 메소드) 콘솔 출력
			//System.out.println(e.toString());//예외클래스명과 원인
			//System.out.println(e.getMessage());//버그원인
		}finally{
			//예외발생상관없이 처리되는 코드
			System.out.println("무조건 실행");
			//fis.close();
		}
		System.out.println("프로그램 정상종료");
		
	}

}
