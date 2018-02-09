package myjava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest4 {
/**	
 * throws 선언된 메소드를 호출한 메소드
 * 우선 main도 자바에게 모든 예외 전가
 * 핵심 코딩후 예외 정상 처리
 * @throws FileNotFoundException 
*/
	public static void main(String[] args) throws Exception {
		/** 2. main 에서 예외 처리  (이 방법을 추천)*/
/*		try {
			openFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
*/
		/** 
		 * 3. 또는 메인클라스에서 try~catch 하지말고 또 누군가에게 전가시킬 수 있다.
		 * main이 throws하는데, JVM 즉, Java에게 전가 시킬 수 있다.
		 * 하지만, 이 방법은 가능하지만,
		 * 기본적으로 Java에게 처리를 전가하면, 자바가 버그를 발견하면 프로그램을 죽여버린다.
		 * 즉, 비정상 종료하게되고 실처리를 개발자가 할수없게된다. 그래서 이 방법은 쓰지말자.
		 * 
		 * 만약 프로젝트 진행시, 예외처리를 할경우
		 * 먼저 main클라스에서 throws Exception을 해버린 후 ,(먼저 빨간줄뜨는걸 막은 후)
		 * 부담없이, 핵심 코드를 구현한다.
		 * 그리고 마지막 단계에서 예외 처리를 다시 한다.
		 * */
		openFile();
		
		System.out.println("프로그램 정상종료");
	}
	
	//메소드명 - 오른쪽 마우스 클릭 - open Call Hierarchy
	
	/** 1. 모든 예외를 호출한 메소드에게 throws함(전가함/떠넘김/양도/양보/전달/전파)*/
	private static void openFile() throws FileNotFoundException{
		// 일반적(체크)예외 : 컴파일시 미리 보이는 실행오류
		FileInputStream fis = null;
		fis = new FileInputStream("test");
	}
}
