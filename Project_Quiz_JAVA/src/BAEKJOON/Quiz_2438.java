package BAEKJOON;

import java.util.Scanner;

public class Quiz_2438 {
	//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
	
	
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
