package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest4 {
	// throws ����� �޼ҵ带 ȣ���� �޼ҵ�
	// �켱 main�� �ڹٿ��� ��� ���� ����
	// �ٽ� �ڵ��� ���� ���� ó��
	public static void main(String[] args) throws Exception {
		// main ���� ���� ó�� X

		openFile();

		System.out.println("���α׷� ��������");
	}

	private static void openFile() throws FileNotFoundException {
		// �Ϲ���(üũ)���� : �����Ͻ� �̸� ���̴� �������
		FileInputStream fis = null;
		fis = new FileInputStream("test1");
	}

}
