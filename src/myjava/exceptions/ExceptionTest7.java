package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest7 {
	/*
	 *
	 * FoodException ����
	 */
	public static void main(String[] args) {
		// main ���� ���� ó��

		try {
			�������("���");
		} catch (FoodException e) {
			// TODO Auto-generated catch block
			//System.out.println("�ֹ��� ������ ã�� �� �����ϴ�");
			System.out.println(e.getMessage());
			System.out.println("2.�ʹ��� ����");			
		}
		System.out.println("�����ֹ� ���α׷� ��������");
	}

	// ����� void
	private static void �������(String food)
			throws FoodException {	//3.			
		if(food.equals("���")){
			System.out.println(food+"�ֹ�����");	
		}else{//1. ��������
			throw new FoodException(); ////2. ���ܰ�ü �߻�
		}
		
		
		

	}

}
