package myjava.exceptions;

import java.io.FileInputStream;

public class ExceptionTest3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s = null;
		s="abc";
		
		//NullPointerException ������������ �޼ҵ� ȣ��
		
		if(s != null){//�ΰ���
		//�����(��üũ)���� : ����ú��̴� �������
			System.out.println(s.charAt(0));
		}
		
		//�Ϲ���(üũ)���� : �����Ͻ� �̸� ���̴� ������� 
		FileInputStream fis = null;
		
		try {// 1.�ϴ� ����(����)�߻��� ���׸� ��ƶ�
			fis = new FileInputStream("test1");//���� ����
			System.out.println((char)fis.read());
			
			/**
			Exception���� catch ����ȭ 
			�پ��� �ڽ� ���� ���ܸ� �θ� Exception���� catch��
			���� ó�� ����ȭ
			*/
		}  catch (Exception e) {// 2. ���� ����Ŭ������ ����� ó�� e: ���׸� ,�޼���
			e.printStackTrace();//�ڼ��� ��������(ȣ���� �޼ҵ�) �ܼ� ���
			//System.out.println(e.toString());//����Ŭ������� ����
			//System.out.println(e.getMessage());//���׿���
		}finally{
			//���ܹ߻�������� ó���Ǵ� �ڵ�
			System.out.println("������ ����");
			//fis.close();
		}
		System.out.println("���α׷� ��������");
		
	}

}
