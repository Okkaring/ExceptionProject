package myjava.exceptions;

public class ExceptionEx2 {
	//���α׷� ����������  �����Ͽ� ��������ϰ� �����ϵ��� ����
	public static void main(String[] args) {
		int[] var={10,20,30};
		
		for (int i = 0; i <=3 ; i++) {
			try{
				System.out.println(var[i]);
			}catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("�迭�� �ִ� �ε����� �Ѿ���. (�ε��� 3�� ����)");				
			}	
		}		
		System.out.println("��������");
	}
}
