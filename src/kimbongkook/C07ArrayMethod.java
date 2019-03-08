package kimbongkook;

import java.util.Scanner;

/* int형 1차원 배열을 매개변수로 전달받아서, 배열에 저장된 최댓값, 그리고 최솟값을 구해서
 * 반환하는 메소드를 다음의 형태로 각각 정의하자.
 * public static int minValue(int[] arr){...} //최솟값 반환
 * public static int maxValue(int[] arr){...} //최댓값 반환
 * 
 * 물론 위의 두 메소드는 인자로 전달되는 배열의 길에 상관없이 동작하도록 정의되어야 한다.
 * 그리고 정의가 완료되면, 두 메소드의 실행을 확인하기 위한 main 메소드도 함께 정의하자.
 * 단 선언된 int형 배열에 채워질 정수는 프로그램 사용자로부터 입력 받아야 하며,
 * 배열의 길이는 임의로 결정하면 된다.
 */
public class C07ArrayMethod {

	public static int maxminValue(int[] max,int[] min) {
		int[] maxValue = max;
		int[] minValue = min;
		int maxNum=0;
		int minNum=minValue[0];
		
		if(maxValue!=null) {
			for(int i=0; i<maxValue.length; i++) {
				if(maxNum<maxValue[i]) {
					maxNum=maxValue[i];
				}		
			}
			return maxNum;
		}
		if(minValue!=null) {
			for(int i=1; i<minValue.length; i++) {
				if(minNum>minValue[i]) {
					minNum=minValue[i];
				}		
			}
			return minNum;
		}
		
		return 0;
	}
	public static void main(String[] args) {
		
		System.out.print("배열의 길이를 입력해주세요: ");
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int basicLength = scan.nextInt();
		int[] basic = new int [basicLength];
		System.out.println(", 기준으로 "+basicLength+"개의 수를 입력하세요 :");
		String str=scan2.nextLine();
		String[] temp = str.split(",");
		for(int i=0; i<temp.length; i++) {
			basic[i] = Integer.parseInt(temp[i]);
		}
		System.out.println("1. 최대값 / 2. 최소값");
		int cho = scan.nextInt();
		if(cho==1) {
			System.out.println(maxminValue(basic, null));
		}else if(cho==2) {
			System.out.println(maxminValue(null, basic));
		}else {
			System.out.println("제대로 된 숫자 입력하세요");
		}
		
		scan.close();
		scan2.close();
	}
}
