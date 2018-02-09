package myjava.app;

public class CarMain {
	public static void main(String[] args) {
		
/*		
 * 		ICarMgr carMgr = null;
 *		carMgr = new CarMgr();
*/
		ICarMgr carMgr = new CarMgr();
		Car car = new Car();
		
		car.setCarName("소나타");
		car.setCarNum("");//차대번호 미기입
		boolean isReg = false;
		try {
			isReg = carMgr.reg(car);
		} catch (CarException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
			//e.reInput() : 차대번호 재입력 요구
			//재입력된 차대번호를 설정
			car.setCarNum(e.reInput());
			try {
				isReg = carMgr.reg(car);
			} catch (CarException e1) {
				e1.printStackTrace();
			}
		}
		if(isReg)
			System.out.println("자동차 등록 성공");
		else
			System.out.println("자동차 등록 실패");
		
		isReg= carMgr.del("1234");
		
		if(isReg)
			System.out.println("자동차 제거 성공");
		else
			System.out.println("자동차 제거 실패");
	}
}
