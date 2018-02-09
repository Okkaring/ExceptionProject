package myjava.app;

import java.util.HashMap;

public class CarMgr implements ICarMgr {
	// <���� ��ȣ,�ڵ��� ��ļ�>
	HashMap<String, Car> map = null;

	public CarMgr() {
		map = new HashMap<String, Car>();
	}
	@Override
	public boolean reg(Car car) throws CarException {
		if (car.getCarNum() == null || car.getCarNum().length() < 1) {
			// CarException ���� �߻�
			throw new CarException("�����ȣ �̱����̹��ϴ�. ����ڰ� �ۼ��� ���� �޼�������.");
		} else {
			// ������ �� �������� ���...
			map.put(car.getCarNum(), car);
			if (map.size() > 0) {
				//map.size() �׸񰹼�
				System.out.println(car.getCarNum() + ": ���� ���� �Ϸ�!");
				return true;
			} else {
				System.out.println(car.getCarNum() + ": ���� ���� �Ұ�! (���� �߻�)");
				return false;
			}
		}
	}
	@Override
	public boolean del(String cnum) {
		//remove() : ������ ��ü�� ����
		if(map.remove(cnum) != null) {
			System.out.println(cnum + "���� : ���� �Ϸ�");
			return true;
		}else {
			System.out.println(cnum + "���� : ������(�����߻�)");
			return false;
		}
	}
}