package quiz;
/*
 * 다음 클래스에 적절한 생성자를 삽입해보자 그리고 확인을 위한 main메소드도 적절히 정의해보자
 */

class Car{
	int gasolineGauge;
}

class HybridCar extends Car {
	int electricGauge;
}

class HybridWaterCar extends HybridCar {
	int waterGauge;
	
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : "+gasolineGauge);
		System.out.println("잔여 전기량 : "+electricGauge);
		System.out.println("잔여 원터량 : "+waterGauge);
	}
}
