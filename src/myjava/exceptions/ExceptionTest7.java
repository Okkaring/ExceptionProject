package myjava.exceptions;

public class ExceptionTest7 {
	/** FoodException 적용 예제*/
	public static void main(String[] args) {
		// main 에서 try~catch 처리
		try {
			김밥제공("김밥");
			System.out.println("-----------------");
			김밥제공("초밥");
		} catch (FoodException e) {
			//4. 예외처리
		/**			
		 * System.out.println("주문된 음식을 찾을 수 없습니다");
		 * 일관된 예외메세지를  출력할 수 있도록
		 * FoodException를 참조하는 인스턴스 객체 e에서 메세지 출력 메소드를 쓰자.
		*/			
			System.out.println(e.getMessage());
			System.out.println(" 초 밥 집 엘  가 자 ");			
		}
		System.out.println("-----------------\n음식주문 프로그램 정상종료");
	}
	// 결과값 void
	private static void 김밥제공(String food) throws FoodException{//3.			
		if(food.equals("김밥")){
			System.out.println(food + " 을 주문 했습니다 ! 성공했습니다 ! 축하합니다 !");	
		}else{
			/**예외 조건 : "김밥"이 아닌 다른 문자 입력시,
			 * 사용자 예외 객체(FoodException) 강제 발생
			 * 예외처리 메소드 내부에서 처리 x
			 * 예외처리 외부 메소드로 전가, 상위블럭으로 전가
			 */		
//			try {
				throw new FoodException();
//			} catch (FoodException e) {
//				e.printStackTrace();
//			} 
		}
	}
}
