package study.mar05.yj;
/*
 *  https://cloudstudying.kr/lectures/200
 *  
 *  영웅은 다음과 같은 속성을 갖는다. 
 *  이름
 *  체력
 *  영웅은 펀치를 통해 상대 영웅에게 피해를 입힐 수 있다.
 *  
 */
import java.util.Random;

public class Hero {
  private String name;
  private int hp = 100;
  // 생성자
  public Hero(String name) {
    this.name = name;
  }
  // 펀치
  public void punch(Hero enermy) {
    enermy.hp -= 10;
    System.out.println(this.name + "의 펀치");
    System.out.printf("   " + enermy.name +": " + enermy.hp + "/100\n");
  }
  // 테스트 코드
  public static void main(String[] args) throws InterruptedException {
    // 두 영웅 객체를 생성
    	// 코딩하시오
    // 두 영웅 모두 체력이 남아있다면, 계속 싸움을 진행
    while (arthas.hp > 0 && leona.hp > 0) {
      // 1/2 확률로 공격자 선정
    	// 코딩하시오
      // 대상을 공격
    	// 코딩하시오
      // 딜레이 1초
      Thread.sleep(1000);
    }
  }
}
