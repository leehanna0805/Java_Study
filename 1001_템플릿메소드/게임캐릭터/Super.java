package 게임캐릭터;

public class Super extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("고급자의 아주 빠르게 RUN !!");
	}

	@Override
	public void jump() {
		System.out.println("고급자의 아주 높이 JUMP !!");
	}

	@Override
	public void turn() {
		System.out.println("고급자의 TURN !!");
	}
	
	@Override
	public void showMessageLevel() {
		System.out.println("SUPER !!!");
		
	}

}