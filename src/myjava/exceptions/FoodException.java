package myjava.exceptions;


/**
 * 기존의 예외 클래스(자바 표준예외)로 예외를 처리할 수 없다면 
 * 사용자만의 예외 클래스(custom 예외 클래스)를 작성하여 발생시킬 수 있다.

 * 사용자 예외 클래스를 정의하려면 
 * 예외 클래스의 최상위 클래스인Exception 클래스를 상속받아 클래스를 정의.

 * 음식 주문 업무 예외클래스
 * 사용자예외 extends 자바 표준예외
 * */

@SuppressWarnings("serial")
public class FoodException extends Exception {
	public FoodException() {
		super("***주문 불가!! 찾을 수가 없엄.");
	}
}
