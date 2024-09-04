package methodTest;

public class MethodTest2 {

	public static void getSum(int[] nums) {
		int bigger = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] > bigger) {
				bigger = (int)nums[i];
			}
		}
		System.out.println(bigger);
	}
	public static void main(String[] args) {
		int[] intagerArr = new int[] {30, 20, 10, 40, 50}; 
		getSum(intagerArr);
	}

}
