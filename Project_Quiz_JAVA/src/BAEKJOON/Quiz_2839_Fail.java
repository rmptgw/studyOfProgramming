package BAEKJOON;

import java.util.Scanner;

public class Quiz_2839_Fail {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n;	
		int k = 0, value = 0;
//
//		// 입력되는 수 n의 범위를 3이상 5000미만으로 제한함
//		// 입력되는 수 n이 위의 범위를 초과할 경우 다시 입력받음
//		do {
//			System.out.println("숫자를 입력해주세요.(3≤n≤5000)");
//			n = scan.nextInt();
//		}while(n<3 && n>5000);
//
//		if(n==3) {
//			value = 1;
//		} else if(n==4) {
//			value = -1;
//		} else {
//
//			// 전체 경우의 수를 확인하기 위해 반복문 생성
//			for(int i=(n/5); i>=0; i--) {
//				// 입력되는 수 n에 5가 포함될 수 있는 최대값에서 최소값까지의 경우의 수 i를 비교한다.
//				for(int j=0; n>=(3*j+5*i) || n-(5*i);j++) {
//					// 입력되는 수 n에서 5의 경우의 수 i를 뺀 후 나머지 값에 대하여 3의 경우의 수 j를 비교한다. 
//
//					if(n%(3*j+5*i)==0) {
//						int temp = i + j;
//
//						if(temp < value || value==0) {
//							// 기존 value와 temp를 비교한다.
//							value = temp;
//						}
//					} else {
//						if(value == 0) {
//							value = -1;
//						}
//
//					}
//				}
//
//				if(k==1) {
//					break;
//				}
//			}
//
//		}
//
//		// 최종 값을 출력함
//		System.out.println(value);

	}
}