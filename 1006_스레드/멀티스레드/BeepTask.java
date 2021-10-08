package 멀티스레드;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //정적 메소드는 클래스 이름으로 바로 호출이 가능함.
		
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000); //1초간 정지
			}catch(Exception e) {}
		}
	}
	
}
