package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest6 {
	/*
	 *
	 * 김밥집
	 * main
초밥호출예외(초밥호출)


김밥제공
	 */
	public static void main(String[] args) {
		// main 에서 예외 처리

		try {
			김밥제공("초밥");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("2.초밥집 가자");
			e.printStackTrace();
		}

		System.out.println("음식주문 프로그램 정상종료");
	}

	private static void 김밥제공(String food)
			throws FileNotFoundException {
		// try finally
		try{
		FileInputStream fis = null;	
			fis = new FileInputStream(food);
		}finally{
			System.out.println("1. 잘가");
		}
		

	}

}
