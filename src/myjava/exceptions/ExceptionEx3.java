package myjava.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {
	//���� �߻� �ּ�ȭ
	//�ǵ����� �����(��Ÿ�� ����) ����  = �Ϲ��� ������ try catch�� ó�� p310
	public static void main(String[] args) {
		int var =50;
		try {
		System.out.println("���� �Է�");
		@SuppressWarnings("resource")
		int data = new Scanner(System.in).nextInt();
		System.out.println(var/data);
		}catch(InputMismatchException ie) {
			System.out.println("���ڰ� �ƴմϴ�.");
		}catch(ArithmeticException ae) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}
		System.out.println("���� ����");
	}
}
