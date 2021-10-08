package 주민번호로부터정보추출;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class JuminCheckEx {

	
	public static void main(String[] args) {
		String juminNum;
		int sum = 0;
		int[] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5,6}; //가중치 배열 (하이픈 자리는 0)
		int temp, result;
		
		System.out.print("주민번호 입력 >>> ");
		Scanner sc = new Scanner(System.in);
		juminNum = sc.next(); //하이픈 포함하여 입력받음
		
		/*
		 * 입력받은 주민번호 유효성 검사 => 정규 표현식(regex) 패턴 적용
		 */
		String regex = "^[0-9]{6}-[1234][0-9]{6}$";
		/*
		 * ^ = 패턴 시작 표시
		 * $ = 패턴 끝 표시
		 * [0-9] = 0~9까지 숫자 중 (범위)
		 * {6} = 6번 반복하라 (반복횟수)
		 * 
		 * [1234] = 첫자리는 1,2,3,4 만 가능함
		 */
		
		// 1st 방법: Pattern 클래스의  matches
		//boolean check = Pattern.matches(regex, juminNum);
		
		// 2nd 방법: String 클래스의 matches
		boolean check = juminNum.matches(regex);
		
		if(check==false) {System.out.println("입력된 주민번호는 정규 표현식 형식에 맞지 않아~");return;}
				
		/*
		 * 입력받은 주민번호에 체크공식 적용
		 */
		
		/* -48 해야하는 이유
		 * '0' : 48
		 * '1' : 49
		 */
		
		for(int i=0;i<13;i++) {
			if(juminNum.charAt(i)=='-') continue;
			sum += (juminNum.charAt(i)-48)*weight[i];
		}
		//System.out.println(sum); //191
		
		temp = 11-(sum%11);
		result = temp%10; //temp가 2자리 나오는 경우도 있기에 1자리로 만들기 위해 %10
		
		/*
		 * 주민번호에서 나이 추출
			시스템 년도 얻어내기 => 2021
			주민번호 앞 두자리로 년도 추출 => “97” => 정수로 변환
			주민번호 뒤 첫째자리 1,2,3,4 중 어떤 것인지 비교하여
				1,2 -> 1900 더하기 =>1997
				3,4 -> 2000 더하기 =>2097
			2021 - 1997 = 나이
		 */
		if(result == juminNum.charAt(13)-48) {
			// 나이 추출
			Calendar cal = Calendar.getInstance(Locale.KOREA);
			int now = cal.get(Calendar.YEAR);
			
			//int year = (juminNum.charAt(0)-48)*10 + (juminNum.charAt(1))-48;
			int year = Integer.parseInt(juminNum.substring(0, 2));
			
			if((juminNum.charAt(7)-48) < 3) {
				year += 1900;
			}else {
				year += 2000;
			}
			System.out.println("나이: "+ (now-year+1));
			
			if((juminNum.charAt(7)-48)%2 == 0) {
				System.out.println("성별: 여자");
			}else {
				System.out.println("성별: 남자");
			}
			
			//출신 지역 추출
			String[][] localCode = {{"서울","00","08"},{"부산","09","12"},{"인천","13","15"}
									,{"경기","16","25"},{"강원","26","34"},{"충북","35","39"}
									,{"대전","40","40"},{"충남","41","43"},{"충남","45","47"}
									,{"세종","44","44"},{"세종","96","96"},{"전북","48","54"}
									,{"전남","55","64"},{"광주","65","66"},{"대구","67","70"}
									,{"경북","71","80"},{"경남","81","84"},{"경남","86","90"}
									,{"울산","85","85"},{"제주","91","95"}};
			
			String localeString = juminNum.substring(8,10);
			int locale = Integer.parseInt(localeString);
			String birthPlace = null;
			
			for(int j=0;j<=19;j++) { // 배열 갯수가 19
				if(locale >= Integer.parseInt(localCode[j][1]) &&   
					locale <= Integer.parseInt(localCode[j][2])) {
					birthPlace = localCode[j][0];
				}
			}
			System.out.println("출신 지역: "+birthPlace);
			
			System.out.println("생년월일: "+ year +"년 "+ juminNum.substring(2,4)+"월 "+juminNum.substring(4,6)+"일");
			
			
			//띠 추출
			String ddi = null;
			// 출생년도 % 11 의 나머지로 띠 판별 (나머지 0이면 원숭이띠)
			String[] gangi = {"원숭이", "닭", "개","돼지","쥐","소","범","토끼","용","뱀","말","양"};
			ddi = gangi[year%12];
			System.out.println("띠: "+ddi);
			
		
		}
		else {System.out.println("틀린 주민번호 !!");}
	}
}
