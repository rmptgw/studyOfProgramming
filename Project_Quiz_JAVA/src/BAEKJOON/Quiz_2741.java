package BAEKJOON;

import java.util.Scanner;

public class Quiz_2741 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int num;
		num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
	}

}
