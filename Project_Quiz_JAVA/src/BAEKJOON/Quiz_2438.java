package BAEKJOON;

import java.util.Scanner;

public class Quiz_2438 {
	//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num ;
		num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=1; j<=i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
