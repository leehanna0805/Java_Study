package �����Ƿκ������̰���;

class RobotRace extends Thread{

	public RobotRace(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(getName()+"�� "+i*10+"m ����");
			try {
				sleep(2000);
			}catch(InterruptedException e) {
				System.out.println(e.toString());
			}
		}
	}
}

//�۾� ������
public class RobotRaceStart {
	public static void main(String[] args) {
		RobotRace A = new RobotRace("�κ�A");
		RobotRace B = new RobotRace("�κ�B");
		RobotRace C = new RobotRace("�κ�C");
		
		A.start();
		B.start();
		C.start();
	}
}
