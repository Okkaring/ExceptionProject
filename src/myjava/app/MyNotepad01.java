package myjava.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/***/
public class MyNotepad01 {
	public static void main(String[] args) {
		try {
			FileInputStream files = new FileInputStream("memo.txt");
			//System.out.println(files.read());//������ ���� �ձ����� ���ڸ� byte�ڵ�� (int)ù��° ���ڸ� ����Ѵ�.
			System.out.println((char)files.read());//char������ ����ȯ�ؼ� ����ϸ� �ι�° ���ڰ� ���´�.
			System.out.println("���α׷� ��������");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�Ǽ� ���̷��� ���� �Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
