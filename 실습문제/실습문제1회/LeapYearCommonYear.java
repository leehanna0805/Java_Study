/*
 * �⵵ �Է¹޾� ���� ���� ���
 * ������ 4�� ���� �������� �����̵�, ���� 100���� ���� �������� ����̴�. �ٸ�, 400���� �������� �ٽ� ����

 */


package �ǽ�����1ȸ;

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
