package study;
// GrandMother class를 Mother가 상속을 받아서 "나는 할머니 생성자!"를 console 창에 출력 하시오. 
// p.s. 아주 간단합니다. 단 한 줄만 바꾸어 주면 됩니당 ~ (Extends)
// BY 선민


class GrandMother {
	int age = 100; 
	GrandMother(){
		System.out.println("나는 할머니 생성자!");
	}
	void powerAttack() {
		System.out.println("할머니가 파워 등짝 스매싱 기술을 시전합니다.");
	}

}
class Mother{
	int age = 55;
	String name = "엄마";
	Mother(){
		System.out.println("나는 엄마 생성자!");
	}
	void attack() {
		System.out.println("엄마가 등짝 스매싱 기술을 시전합니다.");
	}
}

public class B15InheritInAndInherit extends Mother{
	B15InheritInAndInherit(){
		System.out.println("나는 확장 생성자!");
		attack();
	}
	public static void main(String[] args) {
		B15InheritInAndInherit e = new B15InheritInAndInherit();// Exentds1의 생성자 호출;;
		Mother m = new Mother();// Mother의 생성자 호출
		GrandMother gm = new GrandMother();// GrandMother의 생성자 호출;;
		
		
		System.out.println(e.age);
		System.out.println(m.age);
		System.out.println(gm.age);
	}
}