package myjava.exceptions;

public class ExceptionTest7 {
	/** FoodException ���� ����*/
	public static void main(String[] args) {
		// main ���� try~catch ó��
		try {
			�������("���");
			System.out.println("-----------------");
			�������("�ʹ�");
		} catch (FoodException e) {
			//4. ����ó��
		/**			
		 * System.out.println("�ֹ��� ������ ã�� �� �����ϴ�");
		 * �ϰ��� ���ܸ޼�����  ����� �� �ֵ���
		 * FoodException�� �����ϴ� �ν��Ͻ� ��ü e���� �޼��� ��� �޼ҵ带 ����.
		*/			
			System.out.println(e.getMessage());
			System.out.println(" �� �� �� ��  �� �� ");			
		}
		System.out.println("-----------------\n�����ֹ� ���α׷� ��������");
	}
	// ����� void
	private static void �������(String food) throws FoodException{//3.			
		if(food.equals("���")){
			System.out.println(food + " �� �ֹ� �߽��ϴ� ! �����߽��ϴ� ! �����մϴ� !");	
		}else{
			/**���� ���� : "���"�� �ƴ� �ٸ� ���� �Է½�,
			 * ����� ���� ��ü(FoodException) ���� �߻�
			 * ����ó�� �޼ҵ� ���ο��� ó�� x
			 * ����ó�� �ܺ� �޼ҵ�� ����, ���������� ����
			 */		
//			try {
				throw new FoodException();
//			} catch (FoodException e) {
//				e.printStackTrace();
//			} 
		}
	}
}
