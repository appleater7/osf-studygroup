package kangyoungjun;

public class B14ClassInClass {
	/*
	 * 
	 * 해당 class 안에 "B14ClassInClass2"라는 class를 만들고,
	 *  B14ClassInClass2 class 안에서 int a =1 ; 을 선언하여 
	 *  public static void main 에서 println() 해 보시오.
	 *  화이팅 입니당 ~!
	 *  
	 *  
	 *  HINT = ㅅㅌㅌ;
	 * 
	*/
	public static class B14ClassInClass2 {
		int a = 1;
	}
	
	public static void main(String[] args) {
		B14ClassInClass2 cl2 = new B14ClassInClass2();
		System.out.println(cl2.a);
	}
}
