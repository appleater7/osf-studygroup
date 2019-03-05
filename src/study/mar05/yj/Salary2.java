package study.mar05.yj;
/*
 *  https://cloudstudying.kr/lectures/200
 *  
 *  개발자(Developer)는 이름과 경력(년차) 정보를 갖는다.
 *  개발자는 경력에 따라 초급(3년 미만)/중급(7년 미만)/고급(7년이상)의 단계로 나뉜다.
 *  연봉은 아래의 공식을 따른다 
 *  연봉 = 단계별 기준연봉 + (100 * 경력)
 *  단계별 기준연봉은 초급(2800) / 중급(3500) / 고급(4500) 으로 함.
 *  
 *  입력 예 2 5 9 // args 입력
 *  출력 예
 *  3000
 *  4000
 *  5400
 */
public class Salary2 {
	
	  public static void main(String[] args) {
	    // 객체 생성
	    Developer2 tom = new Developer2("Tom", Integer.parseInt(args[0]));
	    Developer2 john = new Developer2("John", Integer.parseInt(args[1]));
	    Developer2 sally = new Developer2("Sally", Integer.parseInt(args[2]));
	    // 연봉 출력
	    System.out.println(tom.salary());
	    System.out.println(john.salary());
	    System.out.println(sally.salary());
	  }
}
class Developer2 {
	  /* 1. 필드를 구현 하시오. */
	public String name = "";
	public int age = 0;
	  /* 2. 생성자를 구현하시오. */
	public Developer2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}  	
	  /* 3. 메소드를 구현하시오. */
	public int salary() {
		int salary = 0;
		if (this.age >= 7) {
			salary = 4500 + (this.age * 100);
		}else if (this.age >= 3) {
			salary = 3500 + (this.age * 100);
		}else {
			salary = 2800 + (this.age * 100);
		}
		return salary;
	}
}

