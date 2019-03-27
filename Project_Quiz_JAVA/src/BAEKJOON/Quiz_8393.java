package BAEKJOON;

import java.util.Scanner;

public class Quiz_8393 {
	/*
	 * 문제
	 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
	 * 입력조건
	 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
	 * 출력조건
	 * 1부터 n까지 합을 출력한다.
	*/
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0;
		
		// n을 입력받는다
		n = scan.nextInt();
		// 입력조건위배시 시스템 종료
		if(1>n||n>10000) { System.exit(0); }
		// 입력받은 값까지 모든 수를 더한다.
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
