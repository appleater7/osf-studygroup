package kimbongkook;
/*
 * 클래스 영역에 int 형 변수 a(기본값0), String 형 변수 str(기본값"") 을 선언 및 초기화하고
 * 메인 메서드에 B14First 클래스를 참조하는 변수 first 를 통하여,
 * 콘솔에 "베스킨라빈스31"을 출력하시오!
 * (단, 메인에는 변수선언을 하면 안된다.)
 */

public class B14First {
	int a = 0;
	String str = "";
	public static void main(String[] args) {
		B14First first = new B14First();
		first.str="베스킨라빈스";
		first.a=31;
		System.out.println(first.str+first.a);	
	}
}
