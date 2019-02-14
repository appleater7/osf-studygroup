package study;
/*
 *  이것(This) 
 *  1. 본 문제는 changeStr 메서드에만 코딩한다.
 *  2. 콘솔에 아래의 내용을 출력한다.
 *     이게 뭐야?
 *     이것은 사과!
 */

public class B14This1 {
	
	String str = "이게 뭐야?";
	
	void changeStr() {
		
	}
	
	public static void main(String[] args) {
		B14This1 t1 = new B14This1();
		System.out.println(t1.str);
		t1.changeStr();
		System.out.println(t1.str);
	}
}
