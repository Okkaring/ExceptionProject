package myjava.exceptions;

import java.util.ArrayList;

public class ExceptionEx {
	//���� �߻� ��, �ڹٴ� ���α׷� ������ ���� �����Ŵ  
	//�����(RunTime) ����
	public static void main(String[] args) {
		int[] var={10,20,30};
		/**
		 * ���α׷� ���������� �����Ͽ� ������ ��������ϰ� �����ϵ��� ����
		 * ������ ���(���� ����)�ʿ�
		 * 
		 * */
		
/*		���� 
 * �迭
 		for (int i = 0; i < var.length; i++) {
				System.out.println(var[i]);			
		}
*/
		
		//���� �迭
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(40);
		list.add(40);
		list.add(40);
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("��������");
		
		for (int inte : list) {
			System.out.println(inte);
		}
		System.out.println("��������");
		
		for (Integer inte : list) {
			System.out.println(inte);
		}
		System.out.println("��������");
	}
}
