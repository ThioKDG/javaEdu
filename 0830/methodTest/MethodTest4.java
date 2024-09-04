package methodTest;

import java.util.Arrays;

public class MethodTest4 {

	public static void getSum(int[] arr) {
		int[] reverse = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			reverse[i] = arr[arr.length - 1 - i];
		}
		System.out.println(Arrays.toString(reverse));
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {30, 20, 10, 40, 50};
		getSum(arr);
	}

}
