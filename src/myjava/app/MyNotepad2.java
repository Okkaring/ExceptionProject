package myjava.app;

import java.io.FileInputStream;
import java.io.IOException;
/**���� ����:
 * ����ó������ ����ȭ
 * ��� ������ ������ü�� Exception���� �ذ��ϰ�,
 * �� ���� ���ϰ� ó���ϴ� ���� ���� ���̴�.
 * */
public class MyNotepad2 {
	public static void main(String[] args) {
		FileInputStream files = null;//�������� �� �� �ֵ��� �ʱ�ȭ�� try���� ������ ����.
		try {
			files = new FileInputStream("memo2.txt");
			System.out.println((char)files.read());
			System.out.println("���α׷� ��������");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�Ǽ� ���̷��� ���� �Ϸ�");
		} finally {
			/**
			 * files.close()�޼ҵ� ��½� ����: 
			 * Unhandled exception type IOException �� try~catch
			 * */
			try {
				files.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}