package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest6 {
	/*
	 *
	 * �����
	 * main
�ʹ�ȣ�⿹��(�ʹ�ȣ��)


�������
	 */
	public static void main(String[] args) {
		// main ���� ���� ó��

		try {
			�������("�ʹ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("2.�ʹ��� ����");
			e.printStackTrace();
		}

		System.out.println("�����ֹ� ���α׷� ��������");
	}

	private static void �������(String food)
			throws FileNotFoundException {
		// try finally
		try{
		FileInputStream fis = null;	
			fis = new FileInputStream(food);
		}finally{
			System.out.println("1. �߰�");
		}
		

	}

}
