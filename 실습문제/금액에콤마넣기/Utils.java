package �ݾ׿��޸��ֱ�;

import java.text.DecimalFormat;

public class Utils {
	/*
	 * �Է¹��� �ݾ׿� õ ���� ���� �޸� �ֱ� �Լ� ����
	 */
	public static String toNumberFormat(long totalAmount) {
		
		DecimalFormat df = new DecimalFormat("#,###"); //�ڿ��� ���ڸ����� ��ǥ �ִ� pattern�� �޾Ƽ� ��ü �����ϰڴ�
		return df.format(totalAmount);
	}
}
