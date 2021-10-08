package 게임캐릭터;

/*
 * Player 와 PlayerLevel 은 포함 관계 (has a)
 * = 집합 연관 관계 (aggregation)
 * 전체 (whole)와 부분(part)를 나타낸 모델 요소! 
 * 게임에서 Player는 자신의 레벨이 있기 때문에, Player 클래스에서 playerLevel을 "멤버변수"로 가짐.
 * playerLevel 을 추상클래스로 만들어서 공통 기능을 구현 후, 각 레벨의 기능은 추상메소드로 구현
 */

public class Player {
	private PlayerLevel level; //멤버변수로 PlayerLevel 가짐
	
	//생성자
	public Player() {
		level = new Beginner();
		level.showMessageLevel();
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showMessageLevel();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
