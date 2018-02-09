package myjava.exceptions;

public class ExceptionExNull {
	//프로그램 비정상종료  방지하여 정상실행하고 종료하도록 유도
	public static void main(String[] args) {
		String s = null;
		//s = "sdfsdf";
		s = "";
		
		//NullPointerException : 널 참조 변수가 메소드 호출

		//1. 참조변수가  널인지 검증
		
		if(s != null && s.length()>1) {	
			//실행시(언체크)예외 : 실행시 보이는 실행오류
			System.out.println(s.charAt(0));
			System.out.println("에러발쉥쉥.");
		}
		
		//2. try~catch문으로 예외 처리
		try {
		System.out.println(s.charAt(0));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("에러발쉥.");
		}
		
		System.out.println("정상 종료");
	}
}
