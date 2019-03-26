package BAEKJOON;

import java.util.Scanner;

public class Quiz_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz_IO result = new Quiz_IO();
		
		int A, B;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력하고 싶은 두가지 정수를 입력해주세요");
		System.out.print("A : ");
		A = scan.nextInt();
		
		System.out.print("B : ");
		B = scan.nextInt();

		result.Quiz1000(A,B);
		
		
		
	}

	public void Quiz1000(int A, int B) {
		
		int sum;
		
		if(A>=10 || B>=10) {
			System.out.println("다시 입력해주세요.");
		} else {
			sum = A + B;
			System.out.print("A와 B의 합은 : " + sum + "입니다.");
		}
	}
	public void Quiz2557() {
		System.out.println("Hello World!");
	}
	
}
