package soo;

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
	
	public static int minValue(int[] arr) {
		int x=arr[0];
		for(int z : arr) {
			if(x>z)
				x=z;
		}
		return x;
	}
	public static int maxValue(int[] arr) {
		int x=arr[0];
		for(int z : arr) {
			if(x<z)
				x=z;
		}
		return x;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.print("몇개 입력?");
		int x =scan.nextInt();
		int[] arr = new int[x];
		for(int i=0;i<x;i++) {
			System.out.print("숫자 입력 : ");
			arr[i]=scan2.nextInt();
		}
		System.out.println("최솟값:"+minValue(arr));
		System.out.println("최댓값:"+maxValue(arr));		
	}
}
