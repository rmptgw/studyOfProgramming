package BAEKJOON;

import java.util.Scanner;

public class Quiz_1924 {
	// ������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? 
	// �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.

	/*
	�������
	ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1��x��12)�� y(1��y��31)�� �־�����. 
	����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���, 
	4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.
	*/
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,n=0;
		
		int[] date = {31,28,31,30,31,30,31,31,30,31,30,31};

		// ������� �Է¹޴´�.
		x = scan.nextInt();
		// �������� �Է¹޴´�.
		y = scan.nextInt();

		if((x<1||x>12)||(y<1||y>31)) {
			System.exit(0);
		}
		
		// �� ���� ���� �ϼ��� ���Ѵ�.
		for(int i=1; i<x;i++) {
			n += date[i-1];
		}
		
		// �ش� ���� ���� ���Ѵ�.
		n += y;
		
		switch(n%7) {
		case 1: System.out.println("MON"); break;
		case 2: System.out.println("TUE"); break;
		case 3: System.out.println("WED"); break;
		case 4: System.out.println("THU"); break;
		case 5: System.out.println("FRI"); break;
		case 6: System.out.println("SAT"); break;
		case 0: System.out.println("SUN"); break;
		}

	}
}
