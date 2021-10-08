package 금액에콤마넣기;

import java.text.DecimalFormat;

public class Utils {
	/*
	 * 입력받은 금액에 천 단위 마다 콤마 넣기 함수 구현
	 */
	public static String toNumberFormat(long totalAmount) {
		
		DecimalFormat df = new DecimalFormat("#,###"); //뒤에서 세자리마다 쉼표 넣는 pattern을 받아서 객체 생성하겠다
		return df.format(totalAmount);
	}
}
