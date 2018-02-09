package myjava.exceptions;

public class ExceptionExNull {
	//���α׷� ����������  �����Ͽ� ��������ϰ� �����ϵ��� ����
	public static void main(String[] args) {
		String s = null;
		//s = "sdfsdf";
		s = "";
		
		//NullPointerException : �� ���� ������ �޼ҵ� ȣ��

		//1. ����������  ������ ����
		
		if(s != null && s.length()>1) {	
			//�����(��üũ)���� : ����� ���̴� �������
			System.out.println(s.charAt(0));
			System.out.println("�����߽���.");
		}
		
		//2. try~catch������ ���� ó��
		try {
		System.out.println(s.charAt(0));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("�����߽�.");
		}
		
		System.out.println("���� ����");
	}
}
