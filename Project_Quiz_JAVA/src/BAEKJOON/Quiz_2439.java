package BAEKJOON;

import java.util.Scanner;

public class Quiz_2439 {
	//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
	//������ ����
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
