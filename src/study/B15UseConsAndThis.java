package study;

/*
 * 아래의 코드에서 단 한 부분만 고쳐서 
 * "myNum is. 20"
 * "mystr is. 나는 생성자"
 * 를 출력하시오.
 * 
 * HINT는 맨 밑에 있으니 잘 안되면 활용하시오.
 * BY 선민
 * 
 * 
 * */



public class B15UseConsAndThis {

	int aNum;
	String str;
	
	B15UseConsAndThis(){
		
	}
	
	
	B15UseConsAndThis(int inNum, String inStr){
		this.aNum = inNum;
		this.str = inStr;
		
	}
	
	public static void main(String[] args) {
		B15UseConsAndThis cat = new B15UseConsAndThis();
		
		System.out.println("myNum is. " + cat.aNum);
		System.out.println("mystr is. " + cat.str);
		
		
		
		
	}
	
	
	
	
}













// HINT = parameter 
