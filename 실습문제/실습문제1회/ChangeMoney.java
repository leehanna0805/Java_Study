/*
 * 돈 액수를 입력받아 오만원권, 만원권, 오천원권, 천원권, 500원, 100원, 50원, 10원, 1원 몇개로 변환되는지 출력
 * 단, 배열 , for문, while문, if문 활용
 */

package 실습문제1회;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		int[] moneyArr = {50000,10000,5000,1000,500,100,50,10,1}; //종류 총 9개
		String[] str = {"오만원권","만원권","오천원권","천원권","오백원","백원","십원","일원"};
		int[] result = new int[9];	//자동으로 0으로 초기화
	 	
		System.out.println("금액을 입력하시오 >>> ");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		
		for(int i=0;i<moneyArr.length;i++) {
			int num = money/moneyArr[i]; //오만원권부터 나눈 몫이 나옴
			int remainder = money%moneyArr[i]; //나머지
			money = remainder; //나머지를 money에 배정
		
			if(num > 0 && i < 4) { // 지폐!
				System.out.println(str[i]+" "+ num + "매");
			}else if(num >0 && i>=4) { // 동전 !!
				System.out.println(str[i]+" "+ num + "개");
			}
		}	
	}
}
