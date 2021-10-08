package �ֹι�ȣ�κ�����������;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class JuminCheckEx {

	
	public static void main(String[] args) {
		String juminNum;
		int sum = 0;
		int[] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5,6}; //����ġ �迭 (������ �ڸ��� 0)
		int temp, result;
		
		System.out.print("�ֹι�ȣ �Է� >>> ");
		Scanner sc = new Scanner(System.in);
		juminNum = sc.next(); //������ �����Ͽ� �Է¹���
		
		/*
		 * �Է¹��� �ֹι�ȣ ��ȿ�� �˻� => ���� ǥ����(regex) ���� ����
		 */
		String regex = "^[0-9]{6}-[1234][0-9]{6}$";
		/*
		 * ^ = ���� ���� ǥ��
		 * $ = ���� �� ǥ��
		 * [0-9] = 0~9���� ���� �� (����)
		 * {6} = 6�� �ݺ��϶� (�ݺ�Ƚ��)
		 * 
		 * [1234] = ù�ڸ��� 1,2,3,4 �� ������
		 */
		
		// 1st ���: Pattern Ŭ������  matches
		//boolean check = Pattern.matches(regex, juminNum);
		
		// 2nd ���: String Ŭ������ matches
		boolean check = juminNum.matches(regex);
		
		if(check==false) {System.out.println("�Էµ� �ֹι�ȣ�� ���� ǥ���� ���Ŀ� ���� �ʾ�~");return;}
				
		/*
		 * �Է¹��� �ֹι�ȣ�� üũ���� ����
		 */
		
		/* -48 �ؾ��ϴ� ����
		 * '0' : 48
		 * '1' : 49
		 */
		
		for(int i=0;i<13;i++) {
			if(juminNum.charAt(i)=='-') continue;
			sum += (juminNum.charAt(i)-48)*weight[i];
		}
		//System.out.println(sum); //191
		
		temp = 11-(sum%11);
		result = temp%10; //temp�� 2�ڸ� ������ ��쵵 �ֱ⿡ 1�ڸ��� ����� ���� %10
		
		/*
		 * �ֹι�ȣ���� ���� ����
			�ý��� �⵵ ���� => 2021
			�ֹι�ȣ �� ���ڸ��� �⵵ ���� => ��97�� => ������ ��ȯ
			�ֹι�ȣ �� ù°�ڸ� 1,2,3,4 �� � ������ ���Ͽ�
				1,2 -> 1900 ���ϱ� =>1997
				3,4 -> 2000 ���ϱ� =>2097
			2021 - 1997 = ����
		 */
		if(result == juminNum.charAt(13)-48) {
			// ���� ����
			Calendar cal = Calendar.getInstance(Locale.KOREA);
			int now = cal.get(Calendar.YEAR);
			
			//int year = (juminNum.charAt(0)-48)*10 + (juminNum.charAt(1))-48;
			int year = Integer.parseInt(juminNum.substring(0, 2));
			
			if((juminNum.charAt(7)-48) < 3) {
				year += 1900;
			}else {
				year += 2000;
			}
			System.out.println("����: "+ (now-year+1));
			
			if((juminNum.charAt(7)-48)%2 == 0) {
				System.out.println("����: ����");
			}else {
				System.out.println("����: ����");
			}
			
			//��� ���� ����
			String[][] localCode = {{"����","00","08"},{"�λ�","09","12"},{"��õ","13","15"}
									,{"���","16","25"},{"����","26","34"},{"���","35","39"}
									,{"����","40","40"},{"�泲","41","43"},{"�泲","45","47"}
									,{"����","44","44"},{"����","96","96"},{"����","48","54"}
									,{"����","55","64"},{"����","65","66"},{"�뱸","67","70"}
									,{"���","71","80"},{"�泲","81","84"},{"�泲","86","90"}
									,{"���","85","85"},{"����","91","95"}};
			
			String localeString = juminNum.substring(8,10);
			int locale = Integer.parseInt(localeString);
			String birthPlace = null;
			
			for(int j=0;j<=19;j++) { // �迭 ������ 19
				if(locale >= Integer.parseInt(localCode[j][1]) &&   
					locale <= Integer.parseInt(localCode[j][2])) {
					birthPlace = localCode[j][0];
				}
			}
			System.out.println("��� ����: "+birthPlace);
			
			System.out.println("�������: "+ year +"�� "+ juminNum.substring(2,4)+"�� "+juminNum.substring(4,6)+"��");
			
			
			//�� ����
			String ddi = null;
			// ����⵵ % 11 �� �������� �� �Ǻ� (������ 0�̸� �����̶�)
			String[] gangi = {"������", "��", "��","����","��","��","��","�䳢","��","��","��","��"};
			ddi = gangi[year%12];
			System.out.println("��: "+ddi);
			
		
		}
		else {System.out.println("Ʋ�� �ֹι�ȣ !!");}
	}
}
