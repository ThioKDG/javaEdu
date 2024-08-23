package javaHomwork;
import java.util.Scanner;


public class JavaTest01 {
	// 직사각형의 가로 세로를 키보드로 하나씩 입력받아 넓이를 구하는 프로그램
	public static void main(String[] args) {		
		float lectWidth = 0.0f;
		float lectHeight = 0.0f;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("직사각형의 가로길이");
		lectWidth = input.nextFloat();
		System.out.print("직사각형의 세로길이");
		lectHeight = input.nextFloat();
		
		System.out.printf("직사각형의 넓이는 %.1fcm입니다.", lectWidth*lectHeight);
		
	}

}
