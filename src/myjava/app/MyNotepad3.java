package myjava.app;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * 수정 내역:
 * throws 전가
 * 다양한 자식 버그예외를 부모 Exception으로 예외를 전가
 * 예외를 전문적으로 처리하는 클래스를 별도로 정의해서 처리해서 자바, 개발자 부하 감소
 * 현재 메인클래스가 이 역할을 수행.
 * 
 * throws 의 특장점:
 * 예외 처리는 내부적으로 많은 연산을 하게되므로
 * CPU가 과부하에 걸릴 가능성이 높다.
 * 
 * */
public class MyNotepad3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		FileInputStream files = null;//전역에서 쓸 수 있도록 초기화를 try영역 밖으로 뺀것.
		files = new FileInputStream("mono.txt");
		System.out.println(files.read());
		System.out.println("program exit");
	}
}