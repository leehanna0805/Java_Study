/*
 * 년도 입력받아 윤년 여부 출력
 * 연수가 4로 나눠 떨어지면 윤년이되, 그중 100으로 나눠 떨어지면 평년이다. 다만, 400으로 나눠지면 다시 윤년

 */


package 실습문제1회;

import java.util.Scanner;

public class LeapYearCommonYear {

	public static void main(String[] args) {
		
		int year;
		
		Scanner in = new Scanner(System.in);
		System.out.println("input year >>> ");
		year = in.nextInt();
		
		if(year%4==0 && year%100!=0 || year%4==0) {
			System.out.println("yoon year!");
		}else {
			System.out.println("pyeong year!");
		}
		
	}

}
