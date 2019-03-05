package quiz;

import java.util.ArrayList;

import java.util.Scanner;

//메소드를 코딩핫요
//by 종인

public class B21NumGame {
		
	public static void main(String[] arge) { // 선생님께서 하다 마신 NumGame을 픽셀로 만든것
		Scanner scan= new Scanner(System.in);
		System.out.print("List의 Size를 입력 하세요 : ");
		int num= scan.nextInt();
		ArrayList<Integer> al= new ArrayList<>();
//		makeGame(al,num);  	// 랜덤의 숫자를 List에 삽입하는것
//		printList(al);		// 나온 숫자를 콘솔의 출력하는것 
		scan.close();
	}
}
