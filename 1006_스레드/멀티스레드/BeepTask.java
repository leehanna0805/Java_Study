package ��Ƽ������;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //���� �޼ҵ�� Ŭ���� �̸����� �ٷ� ȣ���� ������.
		
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000); //1�ʰ� ����
			}catch(Exception e) {}
		}
	}
	
}
