package BAEKJOON;

import java.util.Scanner;

public class Quiz_2739 {
	// N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
	
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num ;
		num = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
		
	}

}
