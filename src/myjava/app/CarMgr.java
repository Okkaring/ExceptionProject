package myjava.app;

import java.util.HashMap;

public class CarMgr implements ICarMgr {
	// <차대 번호,자동차 양식서>
	HashMap<String, Car> map = null;

	public CarMgr() {
		map = new HashMap<String, Car>();
	}
	@Override
	public boolean reg(Car car) throws CarException {
		if (car.getCarNum() == null || car.getCarNum().length() < 1) {
			// CarException 예외 발생
			throw new CarException("차대번호 미기입이무니다. 사용자가 작성한 예외 메세지이죠.");
		} else {
			// 정보를 잘 기입했을 경우...
			map.put(car.getCarNum(), car);
			if (map.size() > 0) {
				//map.size() 항목갯수
				System.out.println(car.getCarNum() + ": 차량 저장 완료!");
				return true;
			} else {
				System.out.println(car.getCarNum() + ": 차량 저장 불가! (오류 발생)");
				return false;
			}
		}
	}
	@Override
	public boolean del(String cnum) {
		//remove() : 삭제한 객체를 리턴
		if(map.remove(cnum) != null) {
			System.out.println(cnum + "차량 : 제거 완료");
			return true;
		}else {
			System.out.println(cnum + "차량 : 미제거(오류발생)");
			return false;
		}
	}
}