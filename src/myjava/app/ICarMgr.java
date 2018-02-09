package myjava.app;

public interface ICarMgr {
	// 매개변수 : 전달된 Car객체
	// 리턴형 : Car 객체 등록 여부
	// 기능 : Car 객체를 맵에 저장
	boolean reg(Car car) throws CarException;

	// cnum :  제거 Car객체 차번
	// 리턴형 : Car객체 제거여부
	// 기능 : 차번으로 특정 Car객체를 맵에 제거
	boolean del(String cnum);
}
