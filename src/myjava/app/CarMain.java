package myjava.app;

public class CarMain {
	public static void main(String[] args) {
		
/*		
 * 		ICarMgr carMgr = null;
 *		carMgr = new CarMgr();
*/
		ICarMgr carMgr = new CarMgr();
		Car car = new Car();
		
		car.setCarName("�ҳ�Ÿ");
		car.setCarNum("");//�����ȣ �̱���
		boolean isReg = false;
		try {
			isReg = carMgr.reg(car);
		} catch (CarException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
			//e.reInput() : �����ȣ ���Է� �䱸
			//���Էµ� �����ȣ�� ����
			car.setCarNum(e.reInput());
			try {
				isReg = carMgr.reg(car);
			} catch (CarException e1) {
				e1.printStackTrace();
			}
		}
		if(isReg)
			System.out.println("�ڵ��� ��� ����");
		else
			System.out.println("�ڵ��� ��� ����");
		
		isReg= carMgr.del("1234");
		
		if(isReg)
			System.out.println("�ڵ��� ���� ����");
		else
			System.out.println("�ڵ��� ���� ����");
	}
}
