package myjava.app;

/** �ڵ��� ������ - Bean**/ 
public class Car {	
	//�� �̸� 
	private String carName;
	//�����ȣ(VIN)
	private String carNum;
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carNum=" + carNum + "]";
	}
}
