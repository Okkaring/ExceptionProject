package myjava.exceptions;

public class ExceptionEx2 {
	//프로그램 비정상종료  방지하여 정상실행하고 종료하도록 유도
	public static void main(String[] args) {
		int[] var={10,20,30};
		
		for (int i = 0; i <=3 ; i++) {
			try{
				System.out.println(var[i]);
			}catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("배열의 최대 인덱스을 넘었다. (인덱스 3은 없다)");				
			}	
		}		
		System.out.println("정상종료");
	}
}
