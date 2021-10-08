package 멀티스레드;
import java.awt.Toolkit;
// 싱글 스레드 (메인 스레드) 애플리케이션
public class BeepPrintEx01 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //정적 메소드는 클래스 이름으로 바로 호출이 가능함.
		// 툴킷 클래스는 '시스템 정보'를 얻는 것으로 시스템 자원에 접근 가능
		
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}
