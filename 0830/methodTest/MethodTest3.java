package methodTest;

import java.util.Scanner;

public class MethodTest3 {

	public static void getSum(int[] arr, int standard) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > standard) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		int[] intArr = new int[] {30, 20, 10, 40};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("기준이 될 숫자를 입력해주세요");
		int standard = scanner.nextInt();
		getSum(intArr, standard);
	}

}
