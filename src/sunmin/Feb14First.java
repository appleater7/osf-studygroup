package sunmin;
/*
 * 클래스 영역에 int 형 변수 a(기본값0), String 형 변수 str(기본값"") 을 선언하고
 * 메인 메서드에 Feb14First 클래스를 참조하는 변수 first 를 통하여,
 * 콘솔에 "베스킨라빈스31"을 출력하시오!
 * (단, 메인에는 변수선언을 하면 안된다.)
 */
	
public class Feb14First {
	int a =0;
	String str = "";
	
	
	public static void main(String[] args) {
		Feb14First first = new Feb14First();
		first.str="베스킨라빈스31";
		System.out.println(first.str);
	}
}
