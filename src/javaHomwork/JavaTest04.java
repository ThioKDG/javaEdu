package javaHomwork;

import java.util.Scanner;

public class JavaTest04 {

	public static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.print("변수 a에 넣을 숫자 입력");
		a = input.nextInt();
		System.out.print("변수 b에 넣을 숫자 입력");
		b = input.nextInt();
		System.out.println("\n");
		
		int[] arr = {a, b};
		swap(arr);
		
		System.out.println("Swapping 결과>");
		System.out.printf("변수 a의 값 %d \n", arr[0]);
		System.out.printf("변수 b의 값 %d", arr[1]);
	}

}
