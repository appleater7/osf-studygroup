package kangyoungjun;
//■ 2/19일 IntArray 클래스의 복습입니다.
//해당 코딩을 암기하여 처음부터 구현하는것을 목표로 합니다.
//
//변수 intArray nums 를 클래스의 메인영역에 선언하고, 인덱스 영역은 10으로 초기화한다.
//각 nums 배열의 각 인덱스에 무작위 값을 1 ~ 10 범위로 입력하는데
//각 값은 중복되지 않도록 입력하여야 한다.
//단, 값의 중복여부를 확인하는 로직은
//boolean 의 data type 을 갖는 compare 메서드를 선언하여
//메서드에서 기능 동작되도록 구현하고, 메인메서드에서 호출하여 사용하도록 한다.
public class B20CompareExam {

	public int[] nums = new int[10];
	
	boolean compare(int num) {
		for (int i = 0; i < nums.length; i++) {
			if (num == 0) return false;
			
			if (nums[i] == num) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		B20CompareExam ce = new B20CompareExam();
		
		for (int i = 0; i < ce.nums.length; i++) {
			int ranNum = (int)(Math.random() * 10) + 1;
			if(ce.compare(ranNum)) {
				i--;
			}else {
				ce.nums[i] = ranNum;
			}			
		}
		
		for (int i = 0; i < ce.nums.length; i++) {
			System.out.println("ce.nums[" + i + "] = " + ce.nums[i]);
		}
		
		for (int i = 0; i < ce.nums.length; i++) {
			for (int j = i + 1; j < ce.nums.length; j++) {
				if (ce.nums[i] > ce.nums[j]) {
					int tmp = ce.nums[i];
					ce.nums[i] = ce.nums[j];
					ce.nums[j] = tmp;
				}
			}
		}
		System.out.println("-----------------");
		for (int i = 0; i < ce.nums.length; i++) {
			System.out.println("ce.nums[" + i + "] = " + ce.nums[i]);
		}
	}
}
