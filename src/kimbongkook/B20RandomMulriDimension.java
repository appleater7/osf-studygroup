package kimbongkook;
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
	
	public int cols = (int)(Math.random()*10)+1;
	public int[][] exArray = new int[cols][];
	
	public boolean compare(int num) {
		for(int i=0; i<exArray.length; i++) {
			for(int j=0; j<exArray[i].length; j++) {
				if(exArray[i][j]==0) return false;
				
				if(exArray[i][j]==num) return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		B20RandomMulriDimension rmd = new B20RandomMulriDimension();
		
		int rows=0;
		
		for(int i=0; i<rmd.exArray.length; i++) {
			rows=(int)(Math.random()*10)+1;
			rmd.exArray[i] = new int[rows];
		}
		
		int num=0;
		
		for(int i=0; i<rmd.exArray.length; i++) {
			for(int j=0; j<rmd.exArray[i].length; j++) {
				num = (int)(Math.random()*100)+1;
				if(rmd.compare(num)) {
					j--;
				}else {
					rmd.exArray[i][j]=num;
				}
			}
		}
		for(int i=0; i<rmd.exArray.length; i++) {
			for(int j=0; j<rmd.exArray[i].length; j++) {
				System.out.println("exArray["+i+"]["+j+"] = "+rmd.exArray[i][j]);
			}
		}
	}
}
