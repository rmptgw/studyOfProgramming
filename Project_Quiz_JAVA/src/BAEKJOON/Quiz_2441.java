package BAEKJOON;

import java.util.Scanner;

public class Quiz_2441 {
	//첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
	//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
	//*****
	// ****
	//  ***
	//   **
	//    *
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num ;
		num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num-1; j>=num-i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
