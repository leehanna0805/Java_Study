package ����ĳ����;

public class Beginner extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("�ʱ����� õõ�� RUN !!");
	}

	@Override
	public void jump() {
		System.out.println("CAN'T JUMP");
	}

	@Override
	public void turn() {
		System.out.println("CAN'T TURN");
	}
	
	@Override
	public void showMessageLevel() {
		System.out.println("BEGINNER!!!");
		
	}
}