package 가상의로봇릴레이게임;

class RobotRace extends Thread{

	public RobotRace(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(getName()+"가 "+i*10+"m 전진");
			try {
				sleep(2000);
			}catch(InterruptedException e) {
				System.out.println(e.toString());
			}
		}
	}
}

//작업 스레드
public class RobotRaceStart {
	public static void main(String[] args) {
		RobotRace A = new RobotRace("로봇A");
		RobotRace B = new RobotRace("로봇B");
		RobotRace C = new RobotRace("로봇C");
		
		A.start();
		B.start();
		C.start();
	}
}
