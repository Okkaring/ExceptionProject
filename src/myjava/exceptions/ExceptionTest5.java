package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest5 {
	// throws ����� �޼ҵ带 ȣ���� �޼ҵ�
	// �켱 main�� �ڹٿ��� ��� ���� ����
	// �ٽ� �ڵ��� ���� ���� ó��
	public static void main(String[] args)  {
		// main ���� ���� ó�� 

		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("2. ���� ���� ����");
		}

		System.out.println("���α׷� ��������");
	}

	private static void openFile() throws FileNotFoundException {
		//  try  finally
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test1");
		} finally {
			System.out.println("1. fis ���ϴݱ�");
		}
	}

}
