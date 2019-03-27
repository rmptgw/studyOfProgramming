package BAEKJOON;

import java.util.Scanner;

public class Quiz_1924 {
	// 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 
	// 이를 알아내는 프로그램을 작성하시오.

	/*
	참고사항
	첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 
	참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 
	4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
	*/
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,n=0;
		
		int[] date = {31,28,31,30,31,30,31,31,30,31,30,31};

		// 몇월인지 입력받는다.
		x = scan.nextInt();
		// 몇일인지 입력받는다.
		y = scan.nextInt();

		if((x<1||x>12)||(y<1||y>31)) {
			System.exit(0);
		}
		
		// 각 월에 대한 일수를 더한다.
		for(int i=1; i<x;i++) {
			n += date[i-1];
		}
		
		// 해당 일의 값을 더한다.
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
