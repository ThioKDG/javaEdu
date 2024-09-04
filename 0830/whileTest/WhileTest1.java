package whileTest;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("숫자를 입력하세요");
			int odEven = scanner.nextInt();
			
			if(odEven % 2 == 1) {
				System.out.println(">> 홀수입니다. 계속하시겠습니까? (0-멈춤 / 1-계속)");
				int moveToNext = scanner.nextInt();
				if(moveToNext == 1) {
					continue;
				}else {
					break;
				}
			}else {
				System.out.println(">> 짝수입니다. 계속하시겠습니까? (0-멈춤 / 1-계속)");
				int moveToNext = scanner.nextInt();
				if(moveToNext == 1) {
					continue;
				}else {
					break;
				}
			}
			
		}

	}

}
