package javaHomwork;

import java.util.Scanner;

public class JavaTest03 {
	//원의 반지름을 입력 받아 원의 넓이를 구하여 출력
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.14;
		float circle = 0.0f;
		
		System.out.print("원의 반지름을 입력하세요(cm):");
		circle = input.nextInt();
		
		System.out.printf("원의 넓이는 %.2fcm입니다.", circle*circle*PI);
		
	}

}
