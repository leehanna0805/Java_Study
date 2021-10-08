package 멀티스레드;

public class BeepPrintEx02 {

	public static void main(String[] args) {
		Runnable beepTask =  new BeepTask();
		Thread thread = new Thread(beepTask);
		
		thread.start(); //이 시점에서 메인스레드와 작업스레드 동시 실행됨.
	
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}
