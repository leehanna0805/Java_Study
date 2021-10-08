package 게임캐릭터;

public class MainBoard {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		System.out.println();
	
		Advanced aLevel = new Advanced();
		player.upgradeLevel(aLevel);
		player.play(2);
		System.out.println();
		
		Super slevel = new Super();
		player.upgradeLevel(slevel);
		player.play(1);
	}

}