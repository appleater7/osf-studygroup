package soo.sort;

public class InsertSort {
	public static void main(String[] args) {
		int[] arr = {5,4,1,7,3};
		
		for(int i=1;i<arr.length;i++) {
			int tmp=arr[i];
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>tmp) {
					arr[j+1]=arr[j];
					if(j==0) {
						arr[j]=tmp;
					}
				}else {
					arr[j+1]=tmp;
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
