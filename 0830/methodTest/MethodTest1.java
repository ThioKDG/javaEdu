package methodTest;

public class MethodTest1 {

	public static void getSum(int[] sum) {
		int sums =0;
		for(int i = 0; i < sum.length; i++) {
			sums = sum[i] + sums;
		}
		System.out.println(sums);
	}
	public static void main(String[] args) {
		int[] intagerArr = new int[] {30, 20, 10, 40, 50}; 
		getSum(intagerArr);
	}

}
