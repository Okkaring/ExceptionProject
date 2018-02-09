package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest7 {
	/*
	 *
	 * FoodException 적용
	 */
	public static void main(String[] args) {
		// main 에서 예외 처리

		try {
			김밥제공("김밥");
		} catch (FoodException e) {
			// TODO Auto-generated catch block
			//System.out.println("주문된 음식을 찾을 수 없습니다");
			System.out.println(e.getMessage());
			System.out.println("2.초밥집 가자");			
		}
		System.out.println("음식주문 프로그램 정상종료");
	}

	// 결과값 void
	private static void 김밥제공(String food)
			throws FoodException {	//3.			
		if(food.equals("김밥")){
			System.out.println(food+"주문성공");	
		}else{//1. 예외조건
			throw new FoodException(); ////2. 예외객체 발생
		}
		
		
		

	}

}
