package kangyoungjun;

import java.util.Scanner;

/*	
 * 1단부터 9단(1X9,1X8,1X7... 역순으로) 까지 출력은 메소드로 하시고 
 * 출력한 값을 배열에 직업놓고 Scanner으로 값을 입력 받으면
 *입력받은 값의 배열 주소를 출력 하세요. 

Scanner 값은 두개로 받으시고

*/

public class B15GuGuDan {

	static void guGuDan(int frtInt, int backInt) {
		for(int i = 1; i <= frtInt; i++) {
			int sSu = 1;
			for(; sSu < backInt; sSu++) {
				System.out.print(i + " X " + sSu + " = " + (i * sSu) + ", ");
				if(i * sSu < 10) {
					System.out.print(" ");
				}
				if(i * sSu < 100) {
					System.out.print(" ");
				}
				if(i < 10) {
					System.out.print(" ");
				}
			}
			System.out.println(i + " X " + sSu + " = " + (i * sSu));
		}
	}
	
	void guGuDanOutput() {
		
		for (int i = 0; i < 10; i++) {
			
		}
		
	}
	int[] guGuDanInput() {
		int[] a = new int[2];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.println(i + 1 + "번째 값을 입력하세요.");
			a[i] = scan.nextInt(); 
//			if( a[0] < 1 || a[0] > 9 || a[1] < 1 || a[1] > 9) {
//				i = -1;
//			}else {
				
//			}
//		}
				
			}
		return a;
		}
	
	public static void main(String[] args) {
		B15GuGuDan ggd = new B15GuGuDan();
		int[] memNum = new int[72];
		int count = 0;
		
		for (ggd.dan = 9; ggd.dan > 1; ggd.dan--) {
			for (ggd.su = 9; ggd.su > 0; ggd.su--) {
				memNum[count] = ggd.dan * ggd.su;
				count++;
				System.out.print(ggd.dan + "x" + ggd.su + "=" + ggd.dan * ggd.su + " ");				
				if(ggd.dan * ggd.su < 10) {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
		System.out.println();
		int[] num = new int[2];
		
		num = ggd.guGuDanInput();
		for (int j = 0; j < 2; j++) {	
			for (int i = 0; i <= 71; i++) {
		
				if(num[j] == (memNum[i])) {
					System.out.println("주소는 " + i + " 값은 "+ memNum[i]);
				}
			}
		}
	}
}
