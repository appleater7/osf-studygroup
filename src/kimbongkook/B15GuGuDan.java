package kimbongkook;

import java.util.Scanner;

/*	
 * 1단부터 9단(1X9,1X8,1X7... 역순으로) 까지 출력은 메소드로 하시고 
 * 출력한 값을 배열에 직업놓고 Scanner으로 값을 입력 받으면
 *입력받은 값의 배열 주소를 출력 하세요. 

Scanner 값은 두개로 받으시고

*/

public class B15GuGuDan {
	
	int[] nums = new int[0];
	
	void guGuDan(int num1, int num2) {
		int sum=0;
		for(int i=1; i<=9; i++) {
			for(int j=9; j>=1; j--) {
				System.out.print(i+"X"+j+"="+i*j+",");
				sum++;
			}
			System.out.println();
		}
		nums = new int[sum];
		sum = 0;
		for(int i=1; i<=9; i++) {
			for(int j=9; j>=1; j--) {
				nums[sum]=i*j;
				sum++;
			}
		}
		for(int i=0; i<nums.length; i++) {
			if(num1*num2 == nums[i]) {
				System.out.println("배열의 주소 : "+i);
			}
		}
	}
	public static void main(String[] args) {
		B15GuGuDan gu = new B15GuGuDan();
		
		int num1,num2;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("첫번째 값 : ");
		num1=scan.nextInt();
		System.out.print("두번째 값 : ");
		num2=scan.nextInt();
		if(num1>9 || num2>9) {
			System.out.print("9단까지만 가능");
		}else {
			gu.guGuDan(num1, num2);
		}
		
		scan.close();

	}
}
