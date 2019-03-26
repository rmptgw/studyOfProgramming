package BAEKJOON;

import java.util.Scanner;

public class Quiz_2439 {
	//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	//오른족 정렬
	//    *
	//   **
	//  ***
	// ****
	//*****
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num ;
		num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=2; j<=num-i; j++) {
				System.out.print(" ");
			}
			for(int j=num; j>=num-i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
