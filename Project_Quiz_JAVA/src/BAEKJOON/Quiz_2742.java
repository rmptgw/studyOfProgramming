package BAEKJOON;

import java.util.Scanner;

public class Quiz_2742 {

	private static Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڿ��� N�� �־����� ��, N���� 1���� ���ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int num;
		
		num = scan.nextInt();
		
		for(int i=num; i>=1; i--) {
			System.out.println(i);
		}
	}

}
