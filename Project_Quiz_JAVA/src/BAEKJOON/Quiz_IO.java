package BAEKJOON;

import java.util.Scanner;

public class Quiz_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz_IO result = new Quiz_IO();
		
		int A, B;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Է��ϰ� ���� �ΰ��� ������ �Է����ּ���");
		System.out.print("A : ");
		A = scan.nextInt();
		
		System.out.print("B : ");
		B = scan.nextInt();

		result.Quiz1000(A,B);
		
		
		
	}

	public void Quiz1000(int A, int B) {
		
		int sum;
		
		if(A>=10 || B>=10) {
			System.out.println("�ٽ� �Է����ּ���.");
		} else {
			sum = A + B;
			System.out.print("A�� B�� ���� : " + sum + "�Դϴ�.");
		}
	}
	public void Quiz2557() {
		System.out.println("Hello World!");
	}
	
}
