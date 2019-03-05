package yoon;
import java.util.Scanner;
public class Test {
	static int[][] a = new int[9][9];
	static public int[][] gugudan() {
		// int[][] a = new int[9][9];
		for (int i = 0; i < 9; i++)
			for (int j = 8; j >= 0; j--)
				a[i][j] = ((i + 1) * (j + 1));
		return a;
	}
	static void printGu() {
		for (int i = 0; i < 9; i++) {
			for (int j = 8; j >= 0; j--) {
				if(j==0)
					System.out.print((i+1)+"x"+(j+1)+"="+a[i][j]);
				else System.out.print((i+1)+"x"+(j+1)+"="+a[i][j]+",");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("수를 입력하면 맞아떨어지는 갯수와 그 배열의 위치와 주소를알려줌");
		System.out.print("찾고자하는 수 입력 : ");
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int[][] a = gugudan();
		int cnt = 0;
		for (int i = 0; i < 9; i++)
			for (int j = 8; j >= 0; j--)
				if (a[i][j] == num) {
					cnt++;
					System.out.println(num + "의 위치" + "[" + i + "]" + "[" + j + "]" + "주소는" + a);
				}
		System.out.println("맞아 떨어지는 갯수 :" + cnt);
		printGu();
	}
}
