package soo;

class Car{
	int gasolineGauge;
	Car(int gasolineGauge) {
		this.gasolineGauge=gasolineGauge;
	}
}

class HybridCar extends Car {
	int electricGauge;
	HybridCar(int galsolineGauge,int electricGauge) {
		super(galsolineGauge);
		this.electricGauge=electricGauge;
	}
}

class HybridWaterCar extends HybridCar {
	int waterGauge;
	HybridWaterCar(int gasolineGauge,int electricGauge,int waterGauge) {
		super(gasolineGauge,electricGauge);
		this.waterGauge=waterGauge;
	}
	
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : "+gasolineGauge);
		System.out.println("잔여 전기량 : "+electricGauge);
		System.out.println("잔여 원터량 : "+waterGauge);
	}
}
public class C11Car {

	public static void main(String[] args) {
		HybridWaterCar hwc = new HybridWaterCar(100,101,102);
		hwc.showCurrentGauge();
	}
}