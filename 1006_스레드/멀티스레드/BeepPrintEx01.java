package ��Ƽ������;
import java.awt.Toolkit;
// �̱� ������ (���� ������) ���ø����̼�
public class BeepPrintEx01 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //���� �޼ҵ�� Ŭ���� �̸����� �ٷ� ȣ���� ������.
		// ��Ŷ Ŭ������ '�ý��� ����'�� ��� ������ �ý��� �ڿ��� ���� ����
		
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}
