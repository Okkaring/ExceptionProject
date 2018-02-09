package myjava.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {
	//예외 발생 최소화
	//의도적인 실행시(런타임 에러) 예외  = 일반적 예외의 try catch문 처리 p310
	public static void main(String[] args) {
		int var =50;
		try {
		System.out.println("정수 입력");
		@SuppressWarnings("resource")
		int data = new Scanner(System.in).nextInt();
		System.out.println(var/data);
		}catch(InputMismatchException ie) {
			System.out.println("숫자가 아닙니다.");
		}catch(ArithmeticException ae) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		System.out.println("정상 종료");
	}
}
