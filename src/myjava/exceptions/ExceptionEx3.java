package myjava.exceptions;

public class ExceptionEx3 {
	//예외 발생 최소화
	public static void main(String[] args) {
		int[] var={10,20,30};
		
/*		for (int i = 0; i <=3 ; i++) {
			if(i < var.length){	//3
			System.out.println(var[i]);
			}
			
		}
*/
		
		for (int i = 0; i < var.length; i++) {
			System.out.println(var[i]);
		}
		
		System.out.println("정상종료");
	}
	
	

}
