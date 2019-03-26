package BAEKJOON;

import java.util.Scanner;

public class Quiz_2742 {

	private static Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자연수 N이 주어졌을 때, N부터 1까지 한줄에 하나씩 출력하는 프로그램을 작성하시오.
		int num;
		
		num = scan.nextInt();
		
		for(int i=num; i>=1; i--) {
			System.out.println(i);
		}
	}

}
