package sunmin;
/* 2차원 배열을 이용해서 
 * 층수 방수를 랜덤으로 받고(최대 10층, 방 갯수 10개)
 * 그 값도 랜덤으로 하시고 
 *  보기 좋게 순서대로 정리하세요  (낮은값부터 높은값 순으로 다중 배열에 차례되로 삽임하세요.)
 *  (ex = !@#[0][0]= (제일 작은 랜덤값),!@#[0][0]= (두번째 작은 랜덤값) ..........!@#[0][0]= (제일 큰 랜덤값)
 *	변수명은 직접정하시고 메소드랑 클래스는 편안되로 하시거나 않하셔도 돼요//
 *
 * by/종인
 */

public class B20RandomMulriDimension {
	public static int[][] sortArray(int[][] array) {
		int index1 = array.length;
		int index2 = array[0].length;

		// 나오는 최대값보다 큰 수.
		int[] basket = new int[(index1 * index2)];
		int num = 0;
		for (int i = 0; i < index1; i++) {
			for (int j = 0; j < index2; j++) {
				basket[num] = array[index1][index2];
				num++;
			}
		}
		
		int temp;
		
		for(int i = 0;i<(index1*index2);i++) {
			for(int j = i+1;j<(index1*index2);j++) {
				if(basket[i]>basket[j]) {
					temp = basket[i];
					basket[i] = basket[j];
					basket[j] = temp;
					i--;
					
				}
			}
		}
		num=0;
		for (int i = 0; i < index1; i++) {
			for (int j = 0; j < index2; j++) {
				array[i][j] = basket[num];
				num++;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int index1 = (int) (Math.random() * 10) + 1;
		int index2 = (int) (Math.random() * 10) + 1;

		// 크기가 random인 배열 만들기.
		int[][] numArray = new int[index1][index2];

		// 설명을 출력하기 위한 Println
		System.out.println("1차원의 길이는 : " + numArray.length);
		System.out.println("2차원의 길이는 : " + numArray[0].length);
		System.out.println("배열의 총 길이는 : " + (index1 * index2));

		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[0].length; j++) {
				int ranNum = (int) (Math.random() * (index1 * index2)) + 1;
				numArray[i][j] = ranNum;
				//System.out.println("numArray[" + i + "][" + j + "] : " + numArray[i][j]);

			}
		}
		
		System.out.println(1);
		numArray = sortArray(numArray);
		
		for(int i =0;i<index1;i++) {
			for(int j =0;j<index2;j++) {
				System.out.println(numArray[i][j]);
				
			}
		}

	}

}
