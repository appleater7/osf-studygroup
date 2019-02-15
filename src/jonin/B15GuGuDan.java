package jonin;

import java.util.Scanner;

/*	
 * 1단부터 9단(1X9,1X8,1X7... 역순으로) 까지 출력은 메소드로 하시고 
 * 출력한 값을 배열에 직업놓고 Scanner으로 값을 입력 받으면
 *입력받은 값의 배열 주소를 출력 하세요. 

Scanner 값은 두개로 받으시고
*/
public class B15GuGuDan {
	static void ggd(int a, int b) {
		int num = 0;
		int[] str = new int[81];
		for (int i = 1; i < 10; i++) {
			for (int j = 9; j > 0; j--) {

				System.out.print(i + "X" + j + "=" + i * j + ", ");

				str[num] = i * j;
				num++;
			}
			System.out.println("");
		}
		for (int i = 0; i < str.length; i++) {
			if (a * b == str[i]) {
				System.out.println("입력 주소 = " + i + " 입니다.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값을 입력 ");
		int a = sc.nextInt();
		System.out.println("두번째 값을 입력 ");
		int b = sc.nextInt();
		if (a >= 10 || b >= 10) {
			System.out.println("구구단입니다. 9단 까지");
		} else {
			ggd(a, b);
		}
	}

}
