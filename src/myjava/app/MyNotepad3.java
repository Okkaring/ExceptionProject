package myjava.app;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * ���� ����:
 * throws ����
 * �پ��� �ڽ� ���׿��ܸ� �θ� Exception���� ���ܸ� ����
 * ���ܸ� ���������� ó���ϴ� Ŭ������ ������ �����ؼ� ó���ؼ� �ڹ�, ������ ���� ����
 * ���� ����Ŭ������ �� ������ ����.
 * 
 * throws �� Ư����:
 * ���� ó���� ���������� ���� ������ �ϰԵǹǷ�
 * CPU�� �����Ͽ� �ɸ� ���ɼ��� ����.
 * 
 * */
public class MyNotepad3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		FileInputStream files = null;//�������� �� �� �ֵ��� �ʱ�ȭ�� try���� ������ ����.
		files = new FileInputStream("mono.txt");
		System.out.println(files.read());
		System.out.println("program exit");
	}
}