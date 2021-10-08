package ��������ý���;

import java.util.Scanner;

public class Reserve {
	public static void main(String[] args) {
		
		SeatType[] aSeatType = new SeatType[4]; // �¼� ���� 4���̹Ƿ�
		aSeatType[0] = new SeatType('R',5);
		aSeatType[1] = new SeatType('S',7);
		aSeatType[2] = new SeatType('A',10);
		aSeatType[3] = new SeatType('B',15);
		Scanner in = new Scanner(System.in);
		
		int choice = 0;
		while(choice!=4) {
			int type;
			System.out.println("\n===== ���� �޴� =====");
			System.out.println("���� �� �ϳ��� �޴��� �����ϼ���");
			System.out.println("1. ����");
			System.out.println("2. ��ȸ");
			System.out.println("3. ���");
			System.out.println("4. ����");
			System.out.print("�����ϼ��� >>> ");
			
			choice = in.nextInt();
			
			switch(choice) {
			case 1: //����
				System.out.println("<�¼� ����>");
				System.out.println("1. R��(5��)");
				System.out.println("2. S��(7��)");
				System.out.println("3. A��(10��)");
				System.out.println("4. B��(15��)");
				System.out.print("�����ϼ���>>> ");
				
				type = in.nextInt();
				
				if(type<1 || type>4) {
					System.out.println("����� �߸��� �¼� Ÿ���Դϴ�.");
					break;
				}
				aSeatType[type-1].seatReserve();
				break;
				
			case 2:  //��ȸ
				for(int i=0;i<aSeatType.length;i++) {
					aSeatType[i].show();
				}
				System.out.println("��ȸ�� �Ϸ��Ͽ����ϴ�.");
				break;
				
			case 3: //���
				System.out.println("<�¼� ����>");
				System.out.println("1. R��(5��)");
				System.out.println("2. S��(7��)");
				System.out.println("3. A��(10��)");
				System.out.println("4. B��(15��)");
				System.out.print("�����ϼ���>>> ");
				
				type = in.nextInt();
				if(type<1 || type>4) {
					System.out.println("��ҽ� �߸��� �¼� Ÿ���Դϴ�.");
					break;
				}
				
				aSeatType[type-1].cancel();
				break;
			
			case 4:  //����
				break;
			default:
				System.out.println("�޴��� �߸� �Է��߽��ϴ�.");
			}
		
			
			
		}
		
	}
}
