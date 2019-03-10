package soo;

public class C10DoubleArr {
	public static void change(int[][] arr) {
		int[] tmpArr = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=tmpArr;
	}
	public static void show(int[][] arr) {
		for(int[] e : arr) {
			for(int a : e) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr= {
				{1},
				{4,5},
				{7,8,9}
		};
		change(arr);
		show(arr);
	}
}
