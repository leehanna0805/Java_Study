package ����ĳ����;
public class Advanced extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("�߱����� ������ RUN !!");
	}

	@Override
	public void jump() {
		System.out.println("�߱����� ���� JUMP !!");
	}

	@Override
	public void turn() {
		System.out.println("CAN'T TURN");
	}
	
	@Override
	public void showMessageLevel() {
		System.out.println("ADVANCED !!!");
		
	}

}