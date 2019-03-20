package quiz;
/* ClassPrinter2 클래스 print안에 if문 안에 1==1을 지우고 알맞은 답을 써서
 * pos1과pos3 의 영문자가 대문자가 되게하시오
 * */
interface UpperCasePrintable {
	
}
class ClassPrinter2 {
	public static void print(Object obj) {
		String org=obj.toString();
		if(1==1) {
			org=org.toUpperCase();
		}
		System.out.println(org);
	}
}
class PointOne implements UpperCasePrintable {
	private int xPos,yPos;
	
	PointOne(int x, int y) {
		xPos=x;
		yPos=y;
	}
	public String toString() {
		String posInfo = "[x pos :"+xPos+", y pos : "+yPos+"]";
		return posInfo;
	}
}
class PointTwo {
private int xPos,yPos;
	
	PointTwo(int x, int y) {
		xPos=x;
		yPos=y;
	}
	public String toString() {
		String posInfo = "[x pos :"+xPos+", y pos : "+yPos+"]";
		return posInfo;
	}
}
public class C20InterfaceMark {

	public static void main(String[] args) {
		PointOne pos1 = new PointOne(1,1);
		PointTwo pos2 = new PointTwo(2,2);
		PointOne pos3 = new PointOne(3,3);
		PointTwo pos4 = new PointTwo(4,4);
		
		ClassPrinter2.print(pos1);
		ClassPrinter2.print(pos2);
		ClassPrinter2.print(pos3);
		ClassPrinter2.print(pos4);
	}
}