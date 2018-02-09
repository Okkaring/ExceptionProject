package myjava.exceptions;

import java.util.ArrayList;

public class ExceptionEx {
	//예외 발생 시, 자바는 프로그램 비정상 강제 종료시킴  
	//실행시(RunTime) 예외
	public static void main(String[] args) {
		int[] var={10,20,30};
		/**
		 * 프로그램 비정상종료 방지하여 끝까지 정상실행하고 종료하도록 유도
		 * 개발자 노력(버그 예상)필요
		 * 
		 * */
		
/*		정적 
 * 배열
 		for (int i = 0; i < var.length; i++) {
				System.out.println(var[i]);			
		}
*/
		
		//동적 배열
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(40);
		list.add(40);
		list.add(40);
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("정상종료");
		
		for (int inte : list) {
			System.out.println(inte);
		}
		System.out.println("정상종료");
		
		for (Integer inte : list) {
			System.out.println(inte);
		}
		System.out.println("정상종료");
	}
}
