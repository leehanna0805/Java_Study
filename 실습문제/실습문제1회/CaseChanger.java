/*
 * Scanner Ŭ���� �̿��ؼ� ������ �ϳ� �Է¹޾Ƽ� ��ҹ��� ��ȯ�� ���
 * ��, ������ �ƴҽ� "�����ڰ� �ƴմϴ�." ���
 */

package �ǽ�����1ȸ;

import java.io.IOException;
import java.util.Scanner;

public class CaseChanger {

	public static void main(String[] args) throws IOException {
		char alpha;
		System.out.println("Input a alphabet >>> ");
//		Scanner scan = new Scanner(System.in);
//		alpha = scan.next().charAt(0);
		alpha = (char)System.in.read();	 //throws IOException �ʿ�
		
		if(alpha >= 'a' && alpha <= 'z') {
			// ASCII �ڵ尪 
			// a: 97, A: 65
			alpha = (char)(alpha-32);
		}else if(alpha >= 'A' && alpha <= 'Z'){
			alpha = (char)(alpha+32);
		}else {
			System.out.println("�����ڰ� �ƴմϴ�.");
			System.exit(0); //���α׷� �������� ���Ѷ�
		}
		
		System.out.println(alpha);
		System.exit(1);
	}
}


