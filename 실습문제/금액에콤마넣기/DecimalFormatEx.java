package �ݾ׿��޸��ֱ�;

import java.util.Scanner;

public class DecimalFormatEx {

	public static void main(String[] args) {
		
		String amount;
		System.out.print("���� �ݾ��� �Է��ϼ��� >>> ");
		Scanner in = new Scanner(System.in);
		long totalAmount = in.nextLong(); //longŸ������ �Է� �ްڴ�
		
		amount = Utils.toNumberFormat(totalAmount);
		
		System.out.println("���� �ݾ�: "+amount);
		
	}

}
