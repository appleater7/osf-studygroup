package dongkeun;

public class B14ClassInClass {
/*
 * 
 * 해당 class 안에 "B14ClassInClass2"라는 class를 만들고,
 *  B14ClassInClass2 class 안에서 int a =1 ; 을 선언하여 println() 해 보시오.
 *  HINT = ㅅㅌㅌ;
 * 
*/
	static class B14ClassInClass2 {
		int a = 1;
	}
	
	public static void main(String[] args) {
		B14ClassInClass2 b14class2 = new B14ClassInClass2();
		System.out.println(b14class2.a);
	}
}
