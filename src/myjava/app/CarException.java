package myjava.app;

import java.util.Scanner;

@SuppressWarnings("serial")
public class CarException extends Exception{
	
	//msg : ����ڰ� �ۼ��� ���ܸ޼���
	public CarException(String msg) {
		super(msg);
	}
	//���ۼ�(�Է�) ��û ���
	public String reInput() {
		System.out.println("�����ȣ ������ϼ���.");
		Scanner s = new Scanner(System.in);				
		return s.next();//���Էµ� �����ȣ ����
	}
}
