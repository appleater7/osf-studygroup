package Kyutaek;

import java.util.ArrayList;

/*	
 * 1단부터 9단(1X9,1X8,1X7... 역순으로) 까지 출력은 메소드로 하시고 
 * 출력한 값을 배열에 직업놓고 Scanner으로 값을 입력 받으면
 *입력받은 값의 배열 주소를 출력 하세요. 

Scanner 값은 두개로 받으시고

*/

public class B15GuGuDan {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			for (int x = 1; x < 10; x++) {
				System.out.print(i + "X" + x + " = " + (i * x) + " , ");
				
			}
			System.out.println();
		}

	}

}
