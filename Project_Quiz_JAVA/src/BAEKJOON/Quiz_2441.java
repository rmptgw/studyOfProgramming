package BAEKJOON;

import java.util.Scanner;

public class Quiz_2441 {
	//ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
	//������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
	//*****
	// ****
	//  ***
	//   **
	//    *
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num ;
		num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num-1; j>=num-i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
