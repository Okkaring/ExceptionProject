package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) {
		String s=null;
		
		//s="abc";
		
		//NullPointerException ������������ �޼ҵ� ȣ��
		if(s!=null){//s �ΰ���
		//�����(��üũ)���� : ����ú��̴� �������
			System.out.println(s.charAt(0));
		}
		
		//�Ϲ���(üũ)���� : �����Ͻ� �̸� ���̴� ������� 
		
		FileInputStream fis=null;
		try {
			//test ���Ͽ� ����� �����͸� �б����ؼ� ����
			fis = new FileInputStream("test");
			//�ϳ� �б�
			System.out.println((char)fis.read());
			
			//���� catch(������ �ڽĿ��ܸ� ����)
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// FileNotFoundException ���� ó��
			//e.printStackTrace(); //��������� �ľ�
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			System.out.println("Ȯ���� �õ�");
			System.out.println("�α�� ����SMS�޼��� �߼�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//���ܹ߻�������� ó���Ǵ� �ڵ�
			System.out.println("������ ����(���ϴݱ�)");
			fis=null;
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //�ݱ�
		}
		System.out.println("���α׷� ��������");
		
	}

}
