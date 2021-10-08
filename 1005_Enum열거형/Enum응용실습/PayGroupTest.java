package Enum����ǽ�;

import java.util.Scanner;

public class PayGroupTest {

	public static void main(String[] args) {
		for(PayGroup type : PayGroup.values()) {
			System.out.print("���� ����: ");
			System.out.print(type.getTitle()+"  ");
			System.out.println(type.getPayList()+" ");
		}
		System.out.println();
		
		
		System.out.println("\n���� ������ �Է��ϼ��� >>> ");
		Scanner in = new Scanner(System.in);
		String payment_means = in.next();
		
		PayGroup pay = PayGroup.findByPayCode(payment_means);
		
		if(pay.equals(PayGroup.EMPTY)) {
			System.out.println("���� ����: "+ pay.getTitle());
		}else {
			System.out.println("���� ����: "+pay.getTitle());
		}
	}

}
