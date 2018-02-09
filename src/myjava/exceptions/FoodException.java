package myjava.exceptions;
//음식주문업무 예외클래스
//사용자(custom)예외 is a 표준예외 
public class FoodException extends Exception {
	//음식주문예외메세지 변경
	public FoodException() {
		// TODO Auto-generated constructor stub
		super("주문된 음식을 찾을 수 없습니다");
	}

}
