package study.mar05.sm;

public class UsingAbstract extends SumClass {
	public static void main(String[] args) {
		UsingAbstract ua = new UsingAbstract();
		int sum = ua.sum(12, 12);
		String stringSum = ua.stringSum("나는", "나다");
		System.out.println("sum is :" + sum + ", stringSum is :" + stringSum);
	}
	@Override
	int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	@Override
	String stringSum(String a, String b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}