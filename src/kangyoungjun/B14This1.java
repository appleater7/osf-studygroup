package kangyoungjun;
/*
 *  이것(This) 
 *  1. 본 문제는 메인 메서드에만 코딩한다.
 *  2. 메인 메서드에서는 변수 선언을 할 수 없다.
 *  3. 콘솔에 아래의 내용을 출력한다.
 *     이게 뭐야?
 *     이것은 사과!
 *  4. 단 Sysout.out.println 에 문자열을 직접 입력하지 않고 
 *     변수명에 의한 호출로만 구현한다.
 *     Sysout.out.println("이게 뭐야?"); -> (X)
 *     Sysout.out.println(abc); -> (O)
 */

public class B14This1 {
	
	String str = "이게 뭐야?";
	
	void This() {
		System.out.println(this.str);
	}	
	
	void changeThis(String str) {
		this.str = str;
		System.out.println(this.str);
	}
	
	public static void main(String[] args) {
		
	}
}
