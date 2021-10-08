/*
 * Scanner 클래스 이용해서 영문자 하나 입력받아서 대소문자 변환후 출력
 * 단, 영문자 아닐시 "영문자가 아닙니다." 출력
 */

package 실습문제1회;

import java.io.IOException;
import java.util.Scanner;

public class CaseChanger {

	public static void main(String[] args) throws IOException {
		char alpha;
		System.out.println("Input a alphabet >>> ");
//		Scanner scan = new Scanner(System.in);
//		alpha = scan.next().charAt(0);
		alpha = (char)System.in.read();	 //throws IOException 필요
		
		if(alpha >= 'a' && alpha <= 'z') {
			// ASCII 코드값 
			// a: 97, A: 65
			alpha = (char)(alpha-32);
		}else if(alpha >= 'A' && alpha <= 'Z'){
			alpha = (char)(alpha+32);
		}else {
			System.out.println("영문자가 아닙니다.");
			System.exit(0); //프로그램 정상종료 시켜라
		}
		
		System.out.println(alpha);
		System.exit(1);
	}
}


