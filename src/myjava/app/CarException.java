package myjava.app;

import java.util.Scanner;

@SuppressWarnings("serial")
public class CarException extends Exception{
	
	//msg : 사용자가 작성할 예외메세지
	public CarException(String msg) {
		super(msg);
	}
	//재작성(입력) 요청 기능
	public String reInput() {
		System.out.println("차대번호 재기입하세요.");
		Scanner s = new Scanner(System.in);				
		return s.next();//재입력된 차대번호 리턴
	}
}
