package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest4 {
/**	
 * throws ����� �޼ҵ带 ȣ���� �޼ҵ�
 * �켱 main�� �ڹٿ��� ��� ���� ����
 * �ٽ� �ڵ��� ���� ���� ó��
 * @throws FileNotFoundException 
*/
	public static void main(String[] args) throws Exception {
		/** 2. main ���� ���� ó��  (�� ����� ��õ)*/
/*		try {
			openFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
*/
		/** 
		 * 3. �Ǵ� ����Ŭ�󽺿��� try~catch �������� �� ���������� ������ų �� �ִ�.
		 * main�� throws�ϴµ�, JVM ��, Java���� ���� ��ų �� �ִ�.
		 * ������, �� ����� ����������,
		 * �⺻������ Java���� ó���� �����ϸ�, �ڹٰ� ���׸� �߰��ϸ� ���α׷��� �׿�������.
		 * ��, ������ �����ϰԵǰ� ��ó���� �����ڰ� �Ҽ����Եȴ�. �׷��� �� ����� ��������.
		 * 
		 * ���� ������Ʈ �����, ����ó���� �Ұ��
		 * ���� mainŬ�󽺿��� throws Exception�� �ع��� �� ,(���� �����ٶߴ°� ���� ��)
		 * �δ����, �ٽ� �ڵ带 �����Ѵ�.
		 * �׸��� ������ �ܰ迡�� ���� ó���� �ٽ� �Ѵ�.
		 * */
		openFile();
		
		System.out.println("���α׷� ��������");
	}
	
	//�޼ҵ�� - ������ ���콺 Ŭ�� - open Call Hierarchy
	
	/** 1. ��� ���ܸ� ȣ���� �޼ҵ忡�� throws��(������/���ѱ�/�絵/�纸/����/����)*/
	private static void openFile() throws FileNotFoundException{
		// �Ϲ���(üũ)���� : �����Ͻ� �̸� ���̴� �������
		FileInputStream fis = null;
		fis = new FileInputStream("test");
	}
}
