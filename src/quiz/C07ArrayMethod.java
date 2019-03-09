package quiz;

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
		int minNum=arr[0];
		for(int i= 1 ;i<arr.length;i++) {
			if(minNum>arr[i]) {
				minNum=arr[i];
			}
		}
		return minNum;
	}

	public static int maxValue(int[] arr) {
		int maxNum=arr[0];
		for(int i= 1 ;i<arr.length;i++) {
			if(maxNum<arr[i]) {
				maxNum=arr[i];
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("6개의 숫자를 ,를 기준으로 써주세요.");
		
		String[] userNums = scan.nextLine().split(",");
		int[] arr = new int[6];
		
		for(int i =0;i<userNums.length;i++) {
			arr[i] = Integer.parseInt(userNums[i]);
		}
		
		System.out.println("maxNum : "+C07ArrayMethod.maxValue(arr));
		System.out.println("minNum : "+C07ArrayMethod.minValue(arr));
	}
}
