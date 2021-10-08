package 게임캐릭터;

public class Beginner extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("초급자의 천천히 RUN !!");
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