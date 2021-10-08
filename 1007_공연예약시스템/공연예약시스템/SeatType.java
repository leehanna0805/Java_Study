package ��������ý���;

import java.util.Scanner;

public class SeatType {
	private char type; // R,S,A.B ��
	private Seat[] aSeat; //�������� => ��������� �����ϰڴ�.
	
	// ������
	public SeatType(char type, int num) {
		this.type = type;
		this.aSeat = new Seat[num]; //�迭 ��ü ���� ����
	
		for(int i=0;i<aSeat.length;i++) {
			aSeat[i] = new Seat(); // ������ �̸� null�� �� ���� �ȴ�.
		}
	}
	
	// �¼� ����
	public boolean seatReserve() {
		Scanner in = new Scanner(System.in);
		int seatNum;
		String name;
		show();
		System.out.print("�̸�: ");
		name = in.next();
		System.out.print("�¼� ��ȣ: ");
		seatNum = in.nextInt();
		
		if(seatNum < 1 || seatNum > aSeat.length) { 
			System.out.println("�߸��� �¼���ȣ �Դϴ�.");
			return false;
		}
		if(aSeat[seatNum-1].isOccupied()) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			return false;
		}
		aSeat[seatNum].reserveName(name);
		return true;
	}
	
	public boolean cancel() {
		Scanner in = new Scanner(System.in);
		show();
		System.out.print("�̸�: ");
		String name = in.next();
		
		if(name != null) {
			 for(int i=0;i<aSeat.length;i++) {
				 if(aSeat[i].match(name)) {
					 aSeat[i].cancel();
					 return true;
				 }
			 }
			 System.out.println("����� ������ �̸��� ã�� �� �����ϴ�.");
		}
		return false;
	}
	
	public void show() {
		System.out.print(type+"�� ����: ");
		for(int i=0;i<aSeat.length;i++) {
			if(aSeat[i].isOccupied()) { 
				System.out.print(aSeat[i].getName()+" "); 
			}else {
				System.out.print("--- "); 
			}
		}
		System.out.println();
	}
}
