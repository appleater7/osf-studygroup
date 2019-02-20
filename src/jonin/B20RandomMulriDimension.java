package jonin;
/* 3차원 배열을 이용해서 
 * 층수 방수를 랜덤으로 받고
 * 그 값도 랜덤으로 하시고 
 *  보기 좋게 순서대로 정리하세요  (낮은값부터 높은값 순으로 다중 배열에 차례되로 삽임하세요.)
 *  (ex = !@#[0][0]= (제일 작은 랜덤값),!@#[0][0]= (두번째 작은 랜덤값) ..........!@#[0][0]= (제일 큰 랜덤값)
 *	변수명은 직접정하시고 메소드랑 클래스는 편안되로 하시거나 않하셔도 돼요//
 *
 * by/종인
 */

public class B20RandomMulriDimension {
	public int[][] ranNum;

	public boolean tern(int con) {
		for (int i = 0; i < ranNum.length; i++) {
			for (int j = 0; j < ranNum[i].length; j++) {
				if (ranNum[i][j] == con)
					return true;
				if (ranNum[i][j] == 0)
					return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		B20RandomMulriDimension b20 = new B20RandomMulriDimension();
		int fNum = ((int) (Math.random() * 10)) + 1;
		int sNum = ((int) (Math.random() * 10)) + 1;
		b20.ranNum = new int[fNum][];
		for (int i = 0; i < b20.ranNum.length; i++) {
			b20.ranNum[i] = new int[sNum];
		}
		for (int i = 0; i < b20.ranNum.length; i++) {
			for (int j = 0; j < b20.ranNum[i].length; j++) {
				int randomNum = ((int) (Math.random() * 100)) + 1;
				if (b20.tern(randomNum)) {
					j--;
				} else {
					b20.ranNum[i][j] = randomNum;
				}

			}

		}
		for (int i = 0; i < b20.ranNum.length; i++) {
			for (int j = 0; j < b20.ranNum[i].length;j++) {
				for (int k = 0;k<b20.ranNum.length;k++) {
					for(int h=0;h<b20.ranNum[k].length;h++) {
						if(b20.ranNum[i][j]<b20.ranNum[k][h]) {
							int a= b20.ranNum[i][j];
							b20.ranNum[i][j] = b20.ranNum[k][h];
							b20.ranNum[k][h]= a;
							
						}
					}
				}
			}
		}

		for (int i = 0; i < b20.ranNum.length; i++) {
			for (int j = 0; j < b20.ranNum[i].length; j++) {
				System.out.println("ranNum[" + i + "][" + j + "]" + b20.ranNum[i][j]);
			}

		}

	}

}
