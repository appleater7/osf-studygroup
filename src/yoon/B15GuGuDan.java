package yoon;

import java.util.Scanner;

/*	
 * 1단부터 9단(1X9,1X8,1X7... 역순으로) 까지 출력은 메소드로 하시고 
 * 출력한 값을 배열에 직업놓고 Scanner으로 값을 입력 받으면
 *입력받은 값의 배열 주소를 출력 하세요. 

Scanner 값은 두개로 받으시고

*/

public class B15GuGuDan {
	static int[][] a = new int[9][9];
	
	static public int[][] gugudan() {
		for(int i=0;i<9;i++) {
			for(int j=8; j>=0 ;j--) {
				a[i][j] = (i+1)*(j+1);
			}
		}
		return a;
}
	static void printGu() {
		for(int i = 1 ; i<=9 ; i++) {
			System.out.println();
			for(int j = 9; j>0 ; j--) {
				System.out.print(i + " x " + j + " = " + (i*j) + ",  " );
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		printGu();
		System.out.println("궁굼한거!");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int[][] a = gugudan();
		
	}
	
		
		
		
	
}
