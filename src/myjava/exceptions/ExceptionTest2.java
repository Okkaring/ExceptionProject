package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class ExceptionTest2 {
	//throws ����� �޼ҵ带 ȣ���� �޼ҵ�
	//main �� ���� ����
	public static void main(String[] args)
	{
		// main ���� ���� ó��
		
		// �Ϲ���(üũ)���� : �����Ͻ� �̸� ���̴� �������(����)
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test1");
		} catch (FileNotFoundException e
				) {
			//e.printStackTrace();
			System.out.println("������ ���� �̹߰�");
		}
		
		System.out.println("���α׷� ��������");
	}
/**	
 * 	private static void openFile() {
		
		FileInputStream fis = null;
		fis = new FileInputStream("test1");
	}
*/
	
}
