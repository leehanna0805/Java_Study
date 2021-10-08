package 금액에콤마넣기;

import java.util.Scanner;

public class DecimalFormatEx {

	public static void main(String[] args) {
		
		String amount;
		System.out.print("결제 금액을 입력하세요 >>> ");
		Scanner in = new Scanner(System.in);
		long totalAmount = in.nextLong(); //long타입으로 입력 받겠다
		
		amount = Utils.toNumberFormat(totalAmount);
		
		System.out.println("결제 금액: "+amount);
		
	}

}
