package javaHomwork;
import java.util.Scanner;

public class JavaTest02 {
// 입력된 정수가 짝수인지 홀수인지 조건연산자를 사용하여 출력
	public static void main(String[] args) {
		int integer = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요");
		integer = input.nextInt();	
		
		System.out.println(integer % 2 == 0 ? "짝수" : "홀수");

		
	}

}
