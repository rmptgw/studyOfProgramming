package BAEKJOON;

import java.util.Scanner;

public class Quiz_8393 {
	/*
	 * ����
	 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * �Է�����
	 * ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
	 * �������
	 * 1���� n���� ���� ����Ѵ�.
	*/
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0;
		
		// n�� �Է¹޴´�
		n = scan.nextInt();
		// �Է���������� �ý��� ����
		if(1>n||n>10000) { System.exit(0); }
		// �Է¹��� ������ ��� ���� ���Ѵ�.
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
