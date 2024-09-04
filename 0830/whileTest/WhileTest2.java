package whileTest;

import java.util.Scanner;

public class WhileTest2 {
	 public static int getNumberKeyboard(String KeyBoard) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print(KeyBoard);
	        return scanner.nextInt();
	    }

	    public static int[] getScoresLine(int student) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.printf("%d명의 성적\n", student);
	        String input = scanner.nextLine();
	        String[] inputScores = input.split(" ");  // 공백으로 구분하여 배열 생성

	        int[] scores = new int[inputScores.length];
	        for (int i = 0; i < inputScores.length; i++) {
	            scores[i] = Integer.parseInt(inputScores[i]);  // 문자열을 정수로 변환하여 배열에 저장
	        }

	        return scores;
	    }

	    public static void printSumAverage(int[] scores) {
	        int sum = 0;
	        for (int score : scores) {
	            sum += score;
	        }
	        double average = (double) sum / scores.length;
	        System.out.println(">> 합계: " + sum);
	        System.out.println(">> 평균: " + average);
	    }

	    public static void main(String[] args) {
	        int numStudent = getNumberKeyboard("학생 수: ");
	        int[] scores = getScoresLine(numStudent);
	        printSumAverage(scores);
	    }
	}
