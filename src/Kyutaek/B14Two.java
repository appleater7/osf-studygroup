package Kyutaek;
/*
 * 생성자의 활용
 * B14Two 의 멤버변수로 정수형 변수 abc 를 선언 및 10 으로 초기화 시키고, 
 * 참조형의 문자열 변수 name 을 "" 의 값으로 선언 및 초기화 시킨다.
 * 해당 클래스의 생성자를 이용하여 파라미터를 2개 문자,숫자의 순으로 전달 받으시오.
 * 전달할 값은 문자는 "4", 숫자는 2로 하시오.
 * 또 전달받은 정수형변수와 참조형 문자열 변수를 콘솔에 출력되게 하시오.
 * (단, 메인메소드에서는 한번의 ';' 밖에 사용할 수 없다.
 */
public class B14Two {
	int abc = 10;
	String name = "";
	B14Two(String name , int abc){
		String str= "4";
		int b = 2;
		System.out.println(str);
		System.out.println(b);
	}
	public static void main(String[] args) {
		B14Two two = new B14Two("4", 2);
	}
	
}
