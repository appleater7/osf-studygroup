package study.mar05.yj;

public class Hero2 {
	
  private String name;
  private int hp = 100;
  // 생성자
  public Hero2(String name) {
    this.name = name;
  }
  // 펀치
  public void punch(Hero2 enermy) {
    enermy.hp -= 10;
    System.out.println(this.name + "의 펀치");
    System.out.printf("   " + enermy.name +": " + enermy.hp + "/100\n");
  }
  // 테스트 코드
  public static void main(String[] args) throws InterruptedException {
    // 두 영웅 객체를 생성
  	  // 코딩하시오
    	Hero2 arthas = new Hero2("arthas");
    	Hero2 leona = new Hero2("leona");
    // 두 영웅 모두 체력이 남아있다면, 계속 싸움을 진행
    while (arthas.hp > 0 && leona.hp > 0) {
      // 1/2 확률로 공격자 선정
      // 대상을 공격
    	  // 코딩하시오
    	if (0.5 >= Math.random()) {
    		arthas.punch(leona);
    	}else if (0.5 < Math.random()) {
    		leona.punch(arthas);
    	}    	
      // 딜레이 1초
      Thread.sleep(1000);
    }
  }
}
