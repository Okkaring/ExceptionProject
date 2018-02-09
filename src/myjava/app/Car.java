package myjava.app;

/** 자동차 제작증 - Bean**/ 
public class Car {	
	//차 이름 
	private String carName;
	//차대번호(VIN)
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
