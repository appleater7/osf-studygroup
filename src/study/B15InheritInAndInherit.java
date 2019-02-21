package study;
// GrandMother class를 Mother가 상속을 받아서 "나는 할머니 생성자!"까지 console 창에 출력 하시오. 
// p.s. 아주 간단합니다. 단 한 줄만 바꾸어 주면 됩니당 ~ (Extends)
// BY 선민


class GrandMother {
	int age = 100;
	GrandMother(){
		System.out.println("나는 할머니 생성자!");
	}
}

class Mother extends GrandMother{
	int age = 55;
	String name = "엄마";
	Mother(){

	}
	void attack() {

	}
}

public class B15InheritInAndInherit extends Mother{
	B15InheritInAndInherit(){
		System.out.println("나는 확장 생성자!");

	}
	public static void main(String[] args) {
		B15InheritInAndInherit e = new B15InheritInAndInherit();// Exentds1의 생성자 호출;;
		Mother m = new Mother();// Mother의 생성자 호출
		

	}
}