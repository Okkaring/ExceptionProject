package myjava.app;

public interface ICarMgr {
	// �Ű����� : ���޵� Car��ü
	// ������ : Car ��ü ��� ����
	// ��� : Car ��ü�� �ʿ� ����
	boolean reg(Car car) throws CarException;

	// cnum :  ���� Car��ü ����
	// ������ : Car��ü ���ſ���
	// ��� : �������� Ư�� Car��ü�� �ʿ� ����
	boolean del(String cnum);
}
