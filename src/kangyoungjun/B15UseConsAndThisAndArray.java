package kangyoungjun;

/*
 * 수업시간에 했던 ClassArray입니다. 
 * 다만, Array 안에 값을 넣을 때, 생성자와 this를 이용해서 넣으면 더 간단하게 넣을 수 있었습니다.
 * 
 * 문제는 단 한 줄만 바꿔서 
 * "1"
 * "생성자로 배열 인덱스 채우기"
 * "2"
 * "생성자로 배열 인덱스 채우기"
 * "3"
 * "생성자로 배열 인덱스 채우기"
 * ...
 * ...
 * ...
 * "10"
 * "생성자로 배열 인덱스 채우기"
 * 
 * 를 출력 하는 것입니다, HINT는 B15UseConsAndThis와 같습니다. 
 * 
 * 
 * */



public class B15UseConsAndThisAndArray {

	int aNum;
	String str;

	B15UseConsAndThisAndArray() {

	}

	B15UseConsAndThisAndArray(int inNum, String inStr) {
		this.aNum = inNum;
		this.str = inStr;

	}

	public static void main(String[] args) {
		B15UseConsAndThisAndArray[] mcArray = new B15UseConsAndThisAndArray[10];

		for (int i = 0; i < mcArray.length; i++) {
			mcArray[i] = new B15UseConsAndThisAndArray(i + 1, "생성자로 배열 인덱스 채우기");

		}
		for (int i = 0; i < mcArray.length; i++) {
			System.out.println(mcArray[i].aNum);
			System.out.println(mcArray[i].str);

		}

	}

}
