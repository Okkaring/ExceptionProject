package myjava.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/***/
public class MyNotepad {
	public static void main(String[] args) {
		/**
		 * ��  �޼ҵ� ȣ���, ���� �� �׾��� ��� 2���� ����� ����:
		 * 1. �޼ҵ� �̹߰�  :  " ~ Cannot be resolved to a type"
		 * 2. ����(����)  :  "Unhandled exception type FileNotFoundException"
		 * 				�� surround try ~ catch statement
		 * */ 

		try {
			FileInputStream fis = new FileInputStream("memo2.txt");
			System.out.println("������ �߰��߽��ϴ�.");
			/**
			 * fis.read() �޼ҵ� ȣ���, �����޽���: Unhandled exception type IOException
			 * � ����� ����? ���� catch���� ����Ѵ�. add catch�� �����ϸ� �ǰڴ�.
			 * */
			System.out.println(fis.read());
		} catch (FileNotFoundException e) {
			
			/**e �ν��Ͻ� ��ü�ȿ��� �ش� ���׿� ���� ���� ������ �������.
			printStackTrace() �޼ҵ� ȣ���, ���������� console�� ������.*/
			e.printStackTrace();
			
		} catch (IOException e) {//fis.read()�� ���� catch��
			e.printStackTrace();
		}
		System.out.println("���α׷� ���� ����");
	}
}
