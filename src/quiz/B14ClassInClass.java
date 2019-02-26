package quiz;

public class B14ClassInClass {
/*
 *  
 *  
 *  HINT = 그냥 답을 공개하고, 보면서 "이렇게도 할  수 있구나~"만 알아가는 목적으로...ㅎㅎ
 * 
*/
	
	static class TwoClass{
		int sNum = 2;
		// 이 자리에서 System.out.println(); 과 같이 동작을 하는 코드는 사용하면 안됩니다.
	}
	public static void main(String[] args) {
		TwoClass tc = new TwoClass();
		
		System.out.println(tc.sNum);
		
		System.out.println("그냥 이렇게 class를 선언 할 수 있다~");
		
		
		
	}
	
}
