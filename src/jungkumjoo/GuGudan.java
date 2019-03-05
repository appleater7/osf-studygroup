package jungkumjoo;

import java.util.Scanner;

/*	
 * 1단부터 9단(1X9,1X8,1X7... 역순으로) 까지 출력은 메소드로 하시고 
 * 출력한 값을 배열에 직업놓고 Scanner으로 값을 입력 받으면
 *입력받은 값의 배열 주소를 출력 하세요. 
Scanner 값은 두개로 받으시고
*/
//static은 main보다 먼저, 정의부에는 실행문을 쓸 수 없다. 정의만
public class GuGudan {
	static int[][] a = new int [9][9];
	
	static public int [][] gugudan() {
		for(int i = 1; i <10; i++) {
			for(int j = 9; j > 0; j--) {
				a[i][j] = (i * j);
			 	}
			}
		return a;
	}
	static void printGu() {
			for(int i = 1; i < 10; i++) {
				for(int j = 9; j > 0; j--) {
			if(j==1) {
				System.out.println(i + "X" + j + "=" + a[i][j] );
				}else {
					System.out.println(i + "X" +j + "=" +a[i][j] +",");
				}
			System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("찾고자 하는 수를 입력해주세요 : ");
	Scanner scan = new Scanner(System.in);
	int num = Integer.parseInt(scan.nextLine());
	int [][] a = gugudan();
	int cnt = 0;
	for(int i = 1; i <10; i++) {
		for(int j = 9; j > 0; j--) {
			if(a[i][j] ==  num) {
				System.out.println(num + "의 위치는 ["+i+"]["+j+"]"+a+" 입니다.");
				cnt++;
			}
			System.out.println("맞은 갯수는 : "+cnt);
		}
		printGu();
	}
}
}
