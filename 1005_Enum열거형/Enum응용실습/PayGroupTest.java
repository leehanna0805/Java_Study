package Enum응용실습;

import java.util.Scanner;

public class PayGroupTest {

	public static void main(String[] args) {
		for(PayGroup type : PayGroup.values()) {
			System.out.print("결제 종류: ");
			System.out.print(type.getTitle()+"  ");
			System.out.println(type.getPayList()+" ");
		}
		System.out.println();
		
		
		System.out.println("\n결제 수단을 입력하세요 >>> ");
		Scanner in = new Scanner(System.in);
		String payment_means = in.next();
		
		PayGroup pay = PayGroup.findByPayCode(payment_means);
		
		if(pay.equals(PayGroup.EMPTY)) {
			System.out.println("결제 종류: "+ pay.getTitle());
		}else {
			System.out.println("결제 종류: "+pay.getTitle());
		}
	}

}
