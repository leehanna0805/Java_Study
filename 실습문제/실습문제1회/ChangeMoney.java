/*
 * �� �׼��� �Է¹޾� ��������, ������, ��õ����, õ����, 500��, 100��, 50��, 10��, 1�� ��� ��ȯ�Ǵ��� ���
 * ��, �迭 , for��, while��, if�� Ȱ��
 */

package �ǽ�����1ȸ;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		int[] moneyArr = {50000,10000,5000,1000,500,100,50,10,1}; //���� �� 9��
		String[] str = {"��������","������","��õ����","õ����","�����","���","�ʿ�","�Ͽ�"};
		int[] result = new int[9];	//�ڵ����� 0���� �ʱ�ȭ
	 	
		System.out.println("�ݾ��� �Է��Ͻÿ� >>> ");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		
		for(int i=0;i<moneyArr.length;i++) {
			int num = money/moneyArr[i]; //�������Ǻ��� ���� ���� ����
			int remainder = money%moneyArr[i]; //������
			money = remainder; //�������� money�� ����
		
			if(num > 0 && i < 4) { // ����!
				System.out.println(str[i]+" "+ num + "��");
			}else if(num >0 && i>=4) { // ���� !!
				System.out.println(str[i]+" "+ num + "��");
			}
		}	
	}
}
