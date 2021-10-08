package 게임캐릭터;
public class Advanced extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("중급자의 빠르게 RUN !!");
	}

	@Override
	public void jump() {
		System.out.println("중급자의 높이 JUMP !!");
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